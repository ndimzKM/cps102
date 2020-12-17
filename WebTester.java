
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WebTester {
	public static void main(String[] args) {
		WebPage web = new WebPage();
		web.readPage();
		/*PrintWriter x;
		try {
			x = new PrintWriter("output.txt");
			x.println("Newton was a great scientist");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}
}
