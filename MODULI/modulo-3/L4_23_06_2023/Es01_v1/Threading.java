package Es01;

import java.util.Scanner;
import java.util.*;

class Prova {
    int v1;
    String s1;

    public Prova(int v1, String s1) {
        this.v1 = v1;
        this.s1 = s1;
        System.out.println("1");
    }

    public Prova() {
        System.out.println("2");
    }

    public void Run() {
        System.out.println("3");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        boolean b = this.isDaemon();
        long id = currentThread().getId();
        for (int i = 0; i < 10; i++) {
            System.out.println(id + ": " + i + ") Il mio thread è un daemon?: " + b);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Threading {
    public static void main(String[] args) throws Exception {
        // Prova p1 = new Prova(10, "venti"); // Cosa stampa a terminale?
        // System.out.println(p1); // Cosa stampa a terminale?

        // MyThread[] vth = new MyThread[100];
        // for (int i = 0; i < 100; i++) {
        // vth[i] = new MyThread();
        // vth[i].start();
        // }

        // // Se voglio aspettare che tutti i thread abbiano terminato la loro
        // esecuzione,
        // // oppure se voglio fare in modo che i thread non terminino mai
        // while (true) {
        // Thread.sleep(1000);
        // if (Thread.activeCount() == 1) {
        // return;
        // }
        // }
        // System.exit(0);

        // a partire da quanto scritto, realizzare un programma che istanzia
        // N contatori, con N letto da terminale, dove ogni contatore conta da
        // un valore casuale compreso tra 50 e 100 e stampa a terminale il conteggio
        // alla rovescia (countdown).
        // Il conteggio è su base secondo, quindi un decremento al secondo.
        // Al primo thread che termina (che stampa 0), fermare il programma.

        Scanner scan = new Scanner(System.in);
        System.out.print("Inserire numero di thread: ");
        int N = scan.nextInt();
        scan.close();

        CountDownThread[] vcntdown = new CountDownThread[N];
        for (int i = 0; i < N; i++) {
            vcntdown[i] = new CountDownThread();
            vcntdown[i].start();
        }

        while (true) {
            Thread.sleep(1000);
            if (Thread.activeCount() == 1) {
                return;
            }
        }

    }
}
