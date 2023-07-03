package Es01;


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

public class App {
    public static void main(String[] args) throws Exception {
        // Prova p1 = new Prova(10, "venti"); // Cosa stampa a terminale?
        // System.out.println(p1); // Cosa stampa a terminale?

        MyThread [] vth1 = new MyThread[5];
        for (int i = 0; i < vth1.length; i++) {
            vth1[i] = new MyThread();
            vth1[i].start();
        }


        // Se voglio aspettare che tutti i thread abbiano terminato la loro esecuzione,
        // oppure se voglio fare in modo che i thread non terminino mai
        while (true) {
            Thread.sleep(1000);
            if (Thread.activeCount() == 1) {
                return;
            }
        }
        // System.exit(0);


        


    }
}