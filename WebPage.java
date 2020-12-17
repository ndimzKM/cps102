import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
/********************************************************************
 * Copyright 2020, University of The Gambia, School of ICT
 * https://www.utg.edu.gm
 *
* @author Ousainou Jaiteh
*********************************************************************/




/*********************************************************************************
 *  Write a program that reads all data from a web page and writes them to a file.
 *  Prompt the user for the web page URL and the file.
 * Provide a tester program the implementation of the program
 *PROVIDE A TESTER CLASS FOR PROGRAM
 * *******************************************************************************/

public class WebPage {

    public void readPage(){
        // Your Implementation Here
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("Enter URL");
		String urlPath = in.next();
		
		System.out.println("Enter File Name");
		String fileName = in.next();
    	try {
    		URL u = new URL(urlPath);
    		
			try {
				Scanner inputResult = new Scanner(u.openStream());
				
				try {
					PrintWriter out = new PrintWriter(fileName);
					while(inputResult.hasNextLine()) {
		    			String line = inputResult.nextLine();
		    			out.println(line);
		    			//System.out.println(fileName);
		    		}
					
					
					out.close();
					inputResult.close();
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    		//Scanner result = Scanner(urlConn.)
    	}catch(MalformedURLException e) {
    		System.out.println("URL not written corretly");
    	}
    	in.close();
    }
}
