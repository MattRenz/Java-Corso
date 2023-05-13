package Pkges_Es02;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Es02_Recupera {

    public static void RecuperaDaFile() throws IOException{
        
        String nomeFile = "dati.txt";

        FileReader file = new FileReader(nomeFile);

        BufferedReader reader = new BufferedReader(file);


        int uno = Integer.parseInt(reader.readLine());
        String due = reader.readLine();
        Double tre = Double.parseDouble(reader.readLine());
        int lungArray = Integer.parseInt(reader.readLine());

        int[] vint = new int[lungArray];
        
        for (int i = 0; i < lungArray; i++){
            vint[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println(uno + "\n" + due + "\n" + tre);
        for (int i : vint){
            System.out.println(i);
        }

    }

    
    public static void main(String[] args) throws IOException {


        System.out.print("Dati salvati, recuperarli? (si = 1,no = 0)");
        Scanner input = new Scanner(System.in);

        int scelta = input.nextInt();

        if (scelta == 1){
            RecuperaDaFile();
        }


    }
}
