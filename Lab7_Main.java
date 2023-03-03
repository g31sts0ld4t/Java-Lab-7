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
				pw.write((j + 1) + "x" + (i + 1) + "=" + ((j + 1) * (i +1 )) + "\t");
			}
			pw.write("\n");
		}
		pw.close();		
	}

}
