import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InvestmentViewer{
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 100;

	private static final double INTEREST_RATE = 10;
	private static final double INITIAL_BALANCE = 1000;
	private static int counter = 0;

	public static void main(String[] args){
		JFrame frame = new JFrame();
		JButton button = new JButton("Add Interest");

		JLabel label = new JLabel("Current count: " + counter);

		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(label);
		frame.add(panel);

		class Listener implements ActionListener{
			public void actionPerformed(ActionEvent event){
				label.setText("Current count: " + counter++);
			}
		}
		ActionListener listener = new Listener();
		button.addActionListener(listener);

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}