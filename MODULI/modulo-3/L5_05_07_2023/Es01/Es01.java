package Es01;

import java.util.Random;

class MyThread extends Thread {
    private long num;

    @Override
    public void run() {

        // Codice da eseguire nel thread
        System.out.println("Inizio ciclo: " + this.getId());
        while (num-- > 0) {
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Terminato ciclo: " + this.getId());
    }

    public MyThread(long num) {
        super();
        this.num = num;
    }
}

public class Es01 {

    public static void main(String[] args) throws Exception {

        // tilizzo: Il metodo
        MyThread t1 = new MyThread(400);
        t1.start(); // Avvia l'esecuzione del thread
        MyThread t2 = new MyThread(500);
        t2.start(); // Avvia l'esecuzione del thread
        MyThread t3 = new MyThread(300);
        t3.start(); // Avvia l'esecuzione del thread

        // Utilizzo: II metodo
        Random rng = new Random();
        for (int i = 0; i < 100; i++) {
            // Ricordate che nextInt() senza bound torna numeri interi positivi e negativi
            // con il bound, nextInt(100), torna numeri tra 0 e il bound-1
            (new MyThread(rng.nextInt(800) + 200)).start();
        }
    }

}
