package Es_01_v3;

import java.util.Random;

public class CountDownThread extends Thread {

    int cicli;

    public CountDownThread(int cicli) {
        super();
        this.cicli = cicli;
    }

    public void run() {
        for (int i = cicli; i > 0; i--) {
            System.out.println(currentThread().getId() + ": " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.exit(0);
    }
}
