package runnable_synchronized;

import java.util.*;

class Counter {
    int numero;

    public Counter() {
        numero = 0;
    }

    public synchronized int get() {
        // questa operazione è atomica nel senso che non è interrompibile
        // return numero++;

        // ma!!!! tra la chiamata a get e il calcolo di numero++
        // c'è la possibilità di una interruzione
        // e quindi due chiamate alla get tornano lo stesso numero!!!!!!!

        // Per evidenziare al meglio il problema, utilizziamo questa seconda
        // sezione di codice, che inserisce artatamente, uno sleep
        numero = numero + 1;
        try {
            Thread.sleep(10);
        } catch (Exception e) {

        }
        return numero;
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        Runnable myrun = new Runnable() {
            public void run() {
                System.out.println("Ciao");
            }
        };

        // per eseguirlo come thread:
        Thread th = new Thread(myrun);
        th.start();

        // supponiamo di voler utilizzare un generatore di numeri ID
        // crescenti e di voler utilizzare tali id all'interno di alcuno thread
        // Esempio
        Counter counter = new Counter();
        Runnable usaContatore = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Sto utilizzando il contatore: " + counter.get());
                }
            }
        };

        for (int i = 0; i < 10; i++) {
            new Thread(usaContatore).start();
        }
    }
}
