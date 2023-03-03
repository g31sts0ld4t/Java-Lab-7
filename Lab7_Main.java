package lab7;

import java.io.*;
import java.util.Scanner;

public class Lab7_Main {

	public static void main(String[] args) throws IOException {
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter name of file");
		String filename = input1.next();
		
		File file1 = new File(filename + ".txt");
		FileWriter fw = new FileWriter(file1);
		PrintWriter pw = new PrintWriter(fw);
		
		pw.write("This is a Multiplication Table\n");
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < (i + 1); j++) {
				int spaceSep = 4;
				int longest = 6;
				int spacing = 10;
				String out1 = (j + 1) + "x" + (i + 1) + "=" + ((j + 1) * (i +1 )) + "\t";
				String formatStr = "%-10s";
				pw.write(String.format(formatStr, out1));
			}
			pw.write("\n");
		}
		pw.close();		
	}

}
