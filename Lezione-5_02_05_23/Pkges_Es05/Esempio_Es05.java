package Pkges_Es05;

import java.io.*;
import java.util.Scanner;

public class Esempio_Es05 {

	public class Main {
        
		public void main(String[] args) {
			try {
				FileWriter myWriter = new FileWriter("output.txt");
				myWriter.write("Hello World!");
				myWriter.close();
				System.out.println("Successfully wrote to the file.");
			} catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}

			try {
				File myFile = new File("input.txt");
				Scanner myReader = new Scanner(myFile);
				while (myReader.hasNextLine()) {
					String data = myReader.nextLine();
					System.out.println(data);
				}
				myReader.close();
			} catch (FileNotFoundException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}
		}
	}
}