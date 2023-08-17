package Es01;

// 2 Thread che stampino uno dopo l'altro i numeri da 0 a 5

class MyThread_prova2 extends Thread {

    private String name_t;

    public MyThread_prova2(String name_t) {
        this.name_t = name_t;
    }

    @Override
    public void run() {

        for (int i = 0; i <= 5; i++) {
            System.out.println(name_t + ": " + i);
        }

    }

}

public class Es_thread_02 {

    public static void main(String[] args) throws Exception {

        MyThread_prova2 t1 = new MyThread_prova2("Thread1");
        t1.start();

        t1.join(); // aspettta che finisce il primo thread e poi esegue il secondo

        MyThread_prova2 t2 = new MyThread_prova2("Thread2");
        t2.start();

    }

}
