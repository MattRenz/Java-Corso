import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Es02 {
	static public void main(String[] args) throws IOException{

		int somma = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

        String riga = br.readLine();

        while (riga != null && riga.length() != 0){
            
            somma+=Integer.parseInt(riga);
            riga = br.readLine();
        }

        System.out.println("La somma è: " + somma);


    }
}
