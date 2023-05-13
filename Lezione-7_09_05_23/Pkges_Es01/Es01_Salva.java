import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Es01_Salva {

    public static void Salva(FileWriter file, String str) throws IOException {
        file.write(str);
        file.write("\n");
    }

    public static void Salva(FileWriter file, int num) throws IOException {
        file.write(Integer.toString(num));
        file.write("\n");
    }

    public static void SalvaPersona(String nome, int num1, int num2) throws IOException {

        FileWriter file = new FileWriter("file.txt");
        Salva(file, nome);
        Salva(file, num1);
        Salva(file, num2);
        file.close();

    
    }

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Nome: ");
            String nome = input.next();

            System.out.print("Num1: ");
            int num1 = input.nextInt();

            System.out.print("Num2: ");
            int num2 = input.nextInt();

            SalvaPersona(nome, num1, num2);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}