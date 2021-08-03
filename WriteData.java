package Week5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class WriteData {
	//-----------------------------------------------------------------
	//	Reads strings from the user and writes them to an output file 
	//  called userStrings.txt. Terminate processing when the user 
	//  enters the string "DONE".
	//-----------------------------------------------------------------
	
	public static void main(String[] args) throws IOException{
		//declare variables
		String userInput = "";
		
		// Create the file to write to(userStrings.txt)
		File file = new File("C:\\Users\\guanxiaoxiong.liu\\eclipse-workspace\\MyFirstProject\\src\\Week5\\userStrings.txt");
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);
		
		Scanner scan = new Scanner(System.in);
		
		while (!userInput.equalsIgnoreCase("done")) {
			System.out.println("Please enter a string. Enter \"DONE\" to stop.");
			userInput = scan.nextLine();
			
			if (!userInput.equalsIgnoreCase("done")) {
				outFile.println(userInput);
			} else {
				System.out.println("Terminated successfully.");
				outFile.close();
			}
		}
		
//		while (!userInput.equalsIgnoreCase("done")) {
//			try {
//				System.out.println("Please enter a string. Enter \"DONE\" to stop.");
//				userInput = scan.nextLine();
//				
//				if (userInput.equalsIgnoreCase("done")) {
//					outFile.close();
//				}
//				
//				outFile.println(userInput);
//			} catch(NumberFormatException exception) {
//				System.out.println("Please enter a String.");
//			}
//		}
		
		scan.close();
		System.out.println ("Output file has been created: " + file);
	}

}
