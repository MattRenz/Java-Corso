package Es01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

class MyThread extends Thread {
    private long num;

    public void run() {
        while (num-- > 0) {
            // System.out.println("Thread id: " + getId() + ". Ciclo: " + num + ". Id unico:
            // " + App.GetIdent());
            System.out.println("Thread id: " + getId() + ". Ciclo: " + num + ". Id unico: " + Es04.GetIdentS());
        }
    }

    public MyThread(long num) {
        super();
        this.num = num;
    }
}

public class Es04 {

    static void FileWrite(int num) {
        BufferedWriter writer;
        try {
            writer = Files.newBufferedWriter(Path.of("unique.dat"),
                    StandardOpenOption.CREATE);
            writer.write(Integer.toString(num));
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

    static int FileRead() {
        BufferedReader reader;
        try {
            reader = Files.newBufferedReader(Path.of("unique.dat"));
            String sident = reader.readLine();
            reader.close();
            return Integer.parseInt(sident);
        } catch (IOException e) {
            FileWrite(0);
            return 0;
        }
    }

    // sincronizzazione tramite synchronized
    static synchronized int GetIdent() {
        int ident = FileRead();
        ident = ident + 1;
        FileWrite(ident);
        return ident;
    }

    public static void Sleep(int num) {
        try {
            Thread.sleep(num);
        } catch (InterruptedException e) {
        }

    }

    public static ReentrantLock mutex = new ReentrantLock();

    // Una semplificazione che non funziona
    // static Boolean stop = false;

    static int GetIdentM() {
        mutex.lock();
        // while (stop) {
        // Sleep(100);
        // }
        // stop = true;

        int ident = FileRead();
        ident = ident + 1;
        FileWrite(ident);
        mutex.unlock();
        // stop = false;

        return ident;
    }

    static Semaphore semaforo = new Semaphore(1);

    static int GetIdentS() {
        try {
            semaforo.acquire();
        } catch (InterruptedException e) {

            // TODO Auto-generated catch block

            e.printStackTrace();
        }

        int ident = FileRead();
        ident = ident + 1;
        FileWrite(ident);
        semaforo.release();
        return ident;
    }

    public static void main(String[] args) throws Exception {

        // Utilizzo:
        // MyThread t1 = new MyThread(400);
        // MyThread t2 = new MyThread(500);
        // MyThread t3 = new MyThread(300);

        // t1.start(); // Avvia l'esecuzione del thread
        // t2.start(); // Avvia l'esecuzione del thread
        // t3.start(); // Avvia l'esecuzione del thread

        // Utilizzo: II metodo
        Random rng = new Random();
        for (int i = 0; i < 112; i++) {
            // Ricordate che nextInt() senza bound torna numeri interi positivi e negativi
            // con il bound, nextInt(100), torna numeri tra 0 e il bound-1
            (new MyThread(rng.nextInt(500) + 1)).start();
        }

    }
}

/*

 * 

 * 
 */