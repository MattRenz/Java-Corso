import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;

public class Es01_Recupera {

    public static void main(String[] args) throws IOException {

        FileReader file = new FileReader("file.txt");

        BufferedReader reader = new BufferedReader(file);

        String nome = reader.readLine();
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());

        int sumNum = num1 + num2;

        System.out.println("Nome: " + nome + " \n Somma num: " + sumNum);

    }
}
