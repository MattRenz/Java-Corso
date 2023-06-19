import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Es03 {
	static public void main(String[] args) throws IOException{
        /*
         * Dato il file holmes.txt 
         * 1) Stampare quante parole ci sono
         * NB: una parola è separata dalle altre da uno " "
         */

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

        int righe = 0;
        int parole = 0;
        
  
        while (true){
            String riga = br.readLine();
            
            if (riga == null){
                System.out.println("Nm righe: " + righe);
                System.out.println("Nm parole: " + parole);
                break;

            } else {
                righe++;
                String[] ParoleString = riga.split(" ");
                parole = parole + ParoleString.length;
            }
        }

    }
}
