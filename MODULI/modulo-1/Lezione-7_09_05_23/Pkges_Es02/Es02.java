package Pkges_Es02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Random;


public class Es02 {

    static int uno = 10;
    static String due = "Ciao";
    static Double tre = 4.72365742634;
    static int[] vint = new int[5];

    public static void Salva(BufferedWriter writer, String str) throws IOException{

        writer.write(str);
        writer.write("\n");
    }

    public static void Salva(BufferedWriter writer, int num) throws IOException{

        writer.write(Integer.toString(num));
        writer.write("\n");
    }

    public static void Salva(BufferedWriter writer, double num) throws IOException{

        writer.write(Double.toString(num));
        writer.write("\n");
    }

	public static void Salva(BufferedWriter writer, int[] num) throws IOException {
		
        writer.write(Integer.toString(num.length));
		writer.write("\n");
        
		for (int i : num) {
			writer.write(Integer.toString(i));
			writer.write("\n");
		}
	}


    public static void SalvaDati() throws IOException{

        String nomeFile = "dati.txt";

        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nomeFile)));
            Salva(writer, uno);
            Salva(writer, due);
            Salva(writer, tre);
            Salva(writer, vint);
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void RecuperaDaFile(){
        
        String nomeFile = "dati.txt";

        try{
            FileReader file = new FileReader(nomeFile);

            BufferedReader reader = new BufferedReader(file);

            uno = Integer.parseInt(reader.readLine());
            due  = reader.readLine();
            tre = Double.parseDouble(reader.readLine());
            
            int lungArray = Integer.parseInt(reader.readLine());

            for (int i = 0; i < lungArray; i++){
                vint[i] = Integer.parseInt(reader.readLine());
            }
    
        } catch (Exception e) {
            e.printStackTrace();
        }


    

        

        // uno = Integer.parseInt(reader.readLine());
        // due = reader.readLine();
        // Double tre = Double.parseDouble(reader.readLine());
        // int lungArray = Integer.parseInt(reader.readLine());

        
        // int[] vint = new int[lungArray];
        
        // for (int i = 0; i < lungArray; i++){
        //     vint[i] = Integer.parseInt(reader.readLine());
        // }

     
    }

    

    public static void main(String[] args) throws IOException{

        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            vint[i] = rnd.nextInt(1000);
        }


        System.out.println(String.format("Uno: %d, Due: %s, Tre: %f, Quattro: %s",
                uno, due, tre, Arrays.toString(vint)));
        
        SalvaDati();
        
        uno = 20;
        due = "CCCCCCiao";
        tre = 4444.72365742634;
        vint = new int[10];

        RecuperaDaFile();
        System.out.println(String.format("Uno: %d, Due: %s, Tre: %f, Quattro: %s",
                uno, due, tre, Arrays.toString(vint)));

    }


}