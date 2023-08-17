package Es01;

import java.util.Random;

class MyThread extends Thread {
    private long num;

    @Override
    public void run() {
        // Codice da eseguire nel thread
        // System.out.println("Inizio ciclo: " + this.getId());
        while (num-- > 0) {
            try {
                System.out.println("Id unico: " + Es02.GetIdent());
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // System.out.println("Terminato ciclo: " + this.getId());
    }

    public MyThread(long num) {
        super();
        this.num = num;
    }
}

public class Es02 {

    static int ident = 0;

    static int GetIdent() {
        ident = ident + 1;
        try {
            Thread.sleep(100);
        } catch (Exception e) {

        }
        return ident;
    }

    public static void main(String[] args) throws Exception {

        // Utilizzo:
        MyThread t1 = new MyThread(400);
        MyThread t2 = new MyThread(500);
        MyThread t3 = new MyThread(300);

        t1.start(); // Avvia l'esecuzione del thread
        t2.start(); // Avvia l'esecuzione del thread
        t3.start(); // Avvia l'esecuzione del thread

        // Utilizzo: II metodo
        Random rng = new Random();
        for (int i = 0; i < 25; i++) {
            // Ricordate che nextInt() senza bound torna numeri interi positivi e negativi
            // con il bound, nextInt(100), torna numeri tra 0 e il bound-1
            (new MyThread(rng.nextInt(800) + 200)).start();
        }
    }

}
