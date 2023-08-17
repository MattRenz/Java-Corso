package Es_01_v3;

import java.util.*;
import Es01_v2.CountDownThread;

class MyThread extends Thread {
    public void run() {
        boolean b = this.isDaemon();
        long id = currentThread().getId();
        for (int i = 0; i < 10; i++) {
            System.out.println(id + ": " + i + ") Il mio thread è un daemon?: " + b);
            // try {
            // Thread.sleep(1);
            // } catch (InterruptedException e) {
            // e.printStackTrace();
            // }
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        // a partire da quanto scritto, realizzare un programma che istanzia
        // N contatori, con N letto da terminale, dove ogni contatore conta da
        // un valore casuale compreso tra 50 e 100 e stampa a terminale il conteggio
        // alla rovescia (countdown).
        // Il conteggio è su base secondo, quindi un decremento al secondo.
        // Al primo thread che termina (che stampa 0), fermare il programma.

        // Ma io vorrei passare un parametro al thread, ad esempio
        // il numero di cicli che deve effettuare
        // e questo voglio passarlo dal main program!!
        // Come faccio?

        Scanner scan = new Scanner(System.in);
        System.out.print("Inserire numero di thread: ");
        int N = scan.nextInt();
        scan.close();

        for (int i = 0; i < N; i++) {
            Random rnd = new Random();
            int cicli = rnd.nextInt(50) + 50;
            CountDownThread tmp = new CountDownThread(cicli);
            tmp.start();
        }

        while (true) {
            Thread.sleep(1000);
            if (Thread.activeCount() == 1) {
                return;
            }
        }

    }
}
