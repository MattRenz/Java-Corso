import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class GestireErroe {
   static public void main(String[] args) /* throws IOException */ {
      /*
       * Leggere una sequenza di numeri, uno per riga, dal terminale
       * e, quando sarà digitata una riga vuota, stampare la somma dei numeri letti
       */

      // devo calcolare la somma dei numeri digitati
      int somma = 0;

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // gestisce la tastiera in modo
                                                                                // flessibile

      // classe // istanza classe

      System.console().readLine(); // per leggere da terminale, direttamente dalla console

      // se in java mi chiamo una funzione che ptorebbe andare in errore, il programma
      // non compila

      // Gestire l'erore:

      /*
       * 1) Modo
       * Programma padre di queta funzione se arriva un errore
       * la fa paasare verso l'altro: throws IOException. In caso io non gli
       * dico di gestire questo erroe br.readline() andrà in errore perchè il
       * programma non gestisce l'errore
       */

      // br.readLine();

      /*
       * 2) Modo
       * con il try e il catch, prova a fare il programma
       * se non funziona, se va in errore esegui qualcosa,
       * il programma non va in crash
       */

      try {
         br.readLine();
      } catch (Exception ex) {
         System.out.println("Errore: " + ex.toString());
      }

      /* 3) Modo */
      // Troviamo noi l'errore
      // if (somma < 0) {
      // throw new Exception("Sei andto in errore");
      // }

   }
}
