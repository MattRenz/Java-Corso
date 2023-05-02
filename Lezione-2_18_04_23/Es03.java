/*
 * inizializzare un vettore con i valori 1 6 2 8 3 9 4 0 
 * e costruire un nuovo vettore che conterrà i valori al contrario
 */

public class Es03 {
    public static void main(String[] args) {

        int[] v = { 1, 6, 2, 8, 3, 9, 4, 0 };

        int[] contario = new int[v.length]; // 0, 4, 9, 3, 8, 2, 6, 1} ;

        for (int i = 0; i < v.length; i++) {

            int iContrario = v.length - i - 1;

            contario[i] = v[iContrario];

        }

        for (int i : contario) {
            System.out.println(i);
        }

    }
}
