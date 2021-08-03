package Week5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class InputDissector {

	//-----------------------------------------------------------------
	//	Reads the file input.csv and outputs to the screen the
	//	largest number in each row.
	//-----------------------------------------------------------------
	public static void main(String[] args) throws IOException{
		String line;
		Scanner fileScan, lineScan;
		int globalMax = Integer.MIN_VALUE;
		int l = 1;
		
		// Reads the file.
		fileScan = new Scanner(new File("C:\\Users\\guanxiaoxiong.liu\\eclipse-workspace\\MyFirstProject\\src\\Week5\\input.csv"));
		
		System.out.println("Maximum values");
		
		while (fileScan.hasNext()) {
			// Reads each line in the file.
			line = fileScan.nextLine();
			
			// Delimit each line.
			lineScan = new Scanner(line);
			lineScan.useDelimiter(",");
			
			while (lineScan.hasNext()) {
				String eleStr = lineScan.next();
				int eleInt = Integer.parseInt(eleStr);	// String --> Integer
				if (globalMax < eleInt) {
					globalMax = eleInt;
				}
			}
			System.out.println("ROW " + l + ": " + globalMax);
			l++;
			globalMax = Integer.MIN_VALUE;
		}	
	}
}
