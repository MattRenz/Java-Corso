package Es01;

import java.util.concurrent.Semaphore;

// 2 Thread che stampino contemporaneamente i numeri d a0 a 5

class MyThread_prova extends Thread {
    private String name_t;
    private Semaphore semaphore;
    public int count;

    public MyThread_prova(String name_t, Semaphore semaphore, int count) {
        this.name_t = name_t;
        this.semaphore = semaphore;
        this.count = count;
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i <= 5; i++) {

                semaphore.acquire();

                if (i == 0) {
                    System.out.println(name_t + ": " + i);
                    semaphore.release();

                } else {
                    semaphore.release();
                    Thread.sleep(100); // Aggiungi una breve pausa per garantire l'alternanza dei thread
                    semaphore.acquire();
                    System.out.println(name_t + ": " + i);
                    semaphore.release();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Es_thread_01 {
    public static void main(String[] args) throws Exception {
        Semaphore semaphore = new Semaphore(1);

        MyThread_prova t1 = new MyThread_prova("Thread1", semaphore, 0);
        t1.start();

        MyThread_prova t2 = new MyThread_prova("Thread2", semaphore, 1);
        t2.start();
    }
}
