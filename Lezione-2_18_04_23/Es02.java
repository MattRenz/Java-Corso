/*
 * Costruire un array di interi casuali, di dimensioni 1000 e trovare il numero più grande
 */

public class Es02 {
    public static void main(String[] args) {

        // istruzione che genera un numero intero
        double numeroCasuale = (int) (Math.random() * 1000);

        int[] ArrayNumeri = new int[1000];

        for (int i = 0; i < 1000; i++) {

            ArrayNumeri[i] = (int) numeroCasuale;

        }

        int numeroMax = Integer.MIN_VALUE;
        for (int i = 0; i < 1000; i++) {

            if (ArrayNumeri[i] > numeroMax) {
                numeroMax = ArrayNumeri[i];
            }
        }

        System.out.println("Numero più grande: " + numeroMax);

    }
}
