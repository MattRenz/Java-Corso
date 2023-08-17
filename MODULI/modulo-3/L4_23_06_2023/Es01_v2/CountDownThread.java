package Es01_v2;

import java.util.Random;

public class CountDownThread extends Thread {
    public CountDownThread(int cicli) {
    }

    public void run() {
        Random rnd = new Random();
        int start = rnd.nextInt(50) + 50;
        for (int i = start; i > 0; i--) {
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
