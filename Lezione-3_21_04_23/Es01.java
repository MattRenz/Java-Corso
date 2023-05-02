/*
 * Costruire un vettore di 10 elemento cauali con valori da 0 a 1000 e stampare la media dei 
 * valori del vettore
 */

public class Es01 {
    public static void main(String[] args) {

        int[] v = new int[10];

        for (int i = 0; i < v.length; i++) {

            double num = (int) (Math.random() * 1000);
            v[i] = (int) num;
        }

        int somma = 0;

        for (int i : v) {
            somma += i;
        }

        int media = somma / v.length;

        System.out.println("La media è " + media);

    }
}
