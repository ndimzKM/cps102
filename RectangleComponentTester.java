import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class RectangleComponentTester{
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 400;
	
	public static void main(String[] args){
		final RectangleComponent component = new RectangleComponent();

		class MousePressListener implements MouseListener{
			public void mousePressed(MouseEvent event){
				int x = event.getX();
				int y = event.getY();
				component.moveTo(x, y);

			}

			// Do-nothing methods
			public void mouseReleased(MouseEvent event) {}
			public void mouseClicked(MouseEvent event) {}
			public void mouseEntered(MouseEvent event) {}
			public void mouseExited(MouseEvent event) {}
		}
		MouseListener listener = new MousePressListener();
		component.addMouseListener(listener);
		
		JFrame frame = new JFrame();
		frame.add(component);
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}