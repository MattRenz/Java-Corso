package Es01;

import java.util.concurrent.Semaphore;

class MyThread_semaphore extends Thread {

    String nome_t;
    Semaphore semaphore;
    int[] numeri;

    public MyThread_semaphore(String nome, Semaphore semaphore, int[] numeri) {
        this.nome_t = nome;
        this.semaphore = semaphore;
        this.numeri = numeri;
    }

    @Override
    public void run() {

        try {

            semaphore.acquire(); // Acquisizione del permesso

            System.out.println(nome_t + " Inizio esecuzione");

            for (int i : numeri) {
                System.out.println(i + 2);
            }

            Thread.sleep(5000); // Aspetta 5 secondi

            System.out.println(nome_t + "Fine esecuzione");

            Thread.sleep(2000); // Aspetta 2 secodni

            semaphore.release(); // Rilascio del permesso

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

public class Es_thread_semaphore_01 {
    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(1);

        int numeri_1[] = { 2, 4, 6, 8 };

        MyThread_semaphore t1 = new MyThread_semaphore("Thread 1", semaphore, numeri_1);

        int numeri_2[] = { 1, 3, 5, 7 };

        MyThread_semaphore t2 = new MyThread_semaphore("Thread 2", semaphore, numeri_2);

        t1.start();
        t2.start();

    }
}
