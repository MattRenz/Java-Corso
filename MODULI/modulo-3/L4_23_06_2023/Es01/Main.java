package Es01.Es01;

import java.util.Random;
import java.util.Scanner;


        /*
         * A partire da questo codcie costruire realizzare un programma 
         * che istanzia N contatori, con N letto da terminale, dove ogni 
         * contatore conta da un valore casuale compreso tra 5 e 100 e stampa
         * a terminale il conteggio alla rovescia (countdown). Il conteggio 
         * e su base secondo quindi un decremento al secondo. Al primo thread
         * che termina (che stampa 0), fermare il programma. 
         */


class MyThread extends Thread {
    private int countdown;

    public MyThread(int countdown) {
        this.countdown = countdown;
    }

    @Override
    public void run() {
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread terminato");
        Main.stopProgram(); // Chiamata al metodo per fermare il programma
    }
}

public class Main {
    private static volatile boolean programRunning = true;

    public static synchronized void stopProgram() {
        programRunning = false;
    }

    public static synchronized boolean isProgramRunning() {
        return programRunning;
    }

    public static void main(String[] args) {
        Random random = new Random();

        System.out.print("Inserisci il numero di thread (N): ");
        Scanner scanner = new Scanner(System.in);
        int numThreads = scanner.nextInt();
        scanner.close();

        MyThread[] threads = new MyThread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            int countdown = random.nextInt(96) + 5; // Genera un valore casuale tra 5 e 100
            threads[i] = new MyThread(countdown);
            threads[i].start();
        }

        while (isProgramRunning()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Programma terminato");
    }
}
