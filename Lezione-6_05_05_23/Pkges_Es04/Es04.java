package Pkges_Es04;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

// Salvataggio su file

public class Es04 {
	static int uno = 10;
	static String due = "Ciao";
	static double tre = 4.72365742634;
	static int[] vint = new int[5];

	public static void main(String[] args) {

		Random rnd = new Random();
		for (int i = 0; i < 5; i++) {
			vint[i] = rnd.nextInt(1000);
		}

		System.out.println(uno + " " + due + " " + tre + " " + Arrays.toString(vint));
		Salva();
		uno = 11;
		due = "Bene";
		tre = 10;
		vint = new int[5];
		System.out.println(uno + " " + due + " " + tre + " " + Arrays.toString(vint));
		Recupera();
		System.out.println(uno + " " + due + " " + tre + " " + Arrays.toString(vint));
	}

	private static void Recupera() {
		// Legge da disco i valori di tutte le variabili/attributi
		// Presenti nel codice
	}

	private static void Salva() {
		// Salva su disco tutte le variabili/attributi presenti nel
		// codice
		try {
			FileWriter myWriter = new FileWriter("salva.txt");
			Save(myWriter, uno);
			Save(myWriter, due);
			Save(myWriter, tre);
			Save(myWriter, vint);

			myWriter.close();
			// int uno = 10;
			// String due = "Ciao";
			// double tre = 4.72365742634;
			// int[] vint = new int[5];

		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	// Salva su file un numero intero
	public static void Save(FileWriter myWriter, int num) throws IOException {
		myWriter.write(Integer.toString(num));
		myWriter.write("\n");
	}

	public static void Save(FileWriter myWriter, byte num) throws IOException {
		myWriter.write(Byte.toString(num));
		myWriter.write("\n");
	}

	public static void Save(FileWriter myWriter, short num) throws IOException {
		myWriter.write(num);
		myWriter.write("\n");
	}

	public static void Save(FileWriter myWriter, long num) throws IOException {
		myWriter.write(Long.toString(num));
		myWriter.write("\n");
	}

	public static void Save(FileWriter myWriter, Double num) throws IOException {
		myWriter.write(Double.toString(num));
		myWriter.write("\n");
	}

	public static void Save(FileWriter myWriter, Float num) throws IOException {
		myWriter.write(Double.toString(num));
		myWriter.write("\n");
	}

	public static void Save(FileWriter myWriter, Boolean num) throws IOException {
		if (num) {
			myWriter.write(1);
		} else {
			myWriter.write(0);
		}
		myWriter.write("\n");
	}

	public static void Save(FileWriter myWriter, String num) throws IOException {
		myWriter.write(num);
		myWriter.write("\n");
	}

	public static void Save(FileWriter myWriter, int[] num) throws IOException {
		myWriter.write(Integer.toString(num.length));
		myWriter.write("\n");
		for (int i : num) {
			myWriter.write(Integer.toString(i));
			myWriter.write("\n");
		}
	}
}
