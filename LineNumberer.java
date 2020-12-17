import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class LineNumberer{
	//Read in a file using a File Object
	//Write out a file using a PrintWriter Object
	public static void main(String[] args) throws FileNotFoundException{
		Scanner console = new Scanner(System.in);

		System.out.println("Input file: ");
		String inputFileName = console.next();

		System.out.println("Output file: ");
		String outputFileName = console.next();

		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		PrintWriter out = new PrintWriter(outputFileName);
		int lineNumber = 1;

		while(in.hasNextLine()){
			String line = in.nextLine();
			out.println("/* " + lineNumber + " */ " + line);
			lineNumber++;
		}

		in.close();
		out.close();

	}
}