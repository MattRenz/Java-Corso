package Thread_vs_runnable;

class MioThread implements Runnable {
    public void run() {
        System.out.println("Ciao dalla classe MioThread");
    }
}

class MioThread1 extends Thread {
    public void run() {
        System.out.println("Ciao dalla classe MioThread1");
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        Runnable mioth = new Runnable() {
            public void run() {
                System.out.println("Ciao");
            }
        };
        for (int i = 0; i < 1; i++) {

            // Gli oggetti che implementano Runnable possono essere
            // eseguiti direttamente nel codice (ovviamente non sono thread)
            mioth.run();

            // Diventano thread quando li assegno a una new di un thread
            Thread tmp = new Thread(mioth);
            tmp.start();

            // Gli oggetti che implementano Runnable possono essere
            // eseguiti direttamente nel codice (ovviamente non sono thread)
            MioThread tmp1 = new MioThread();
            tmp1.run();
            // Diventano thread quando li assegno a una new di un thread
            Thread th = new Thread(tmp1);
            th.start();

            // Gli oggetti/classi che estendono la classe thread,
            // non possono essere eseguiti se non come thread
            MioThread1 tmp2 = new MioThread1();
            tmp2.start();
        }

    }
}
