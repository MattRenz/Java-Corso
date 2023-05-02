/* 
 * Ordnina un vettore in modo crescente o decrescente
 * 
 */

public class Es03 {

    // Funzione che trova l'indice del valore minimo di un vettore
    public static int iMin(int[] v, int len) {
        int indice_valore_minimo = 0;
        for (int i = 1; i < len; i++) {
            if (v[i] < v[indice_valore_minimo]) {
                indice_valore_minimo = i;
            }
        }
        // ora indice_valore_minimo mi dice a che post sta il più
        // piccolo elemento del vettore
        return indice_valore_minimo;
    }

    public static void main(String[] args) {

        // int[] v2 = { 31, 12, 47, 25, 9, 11, 1, 4, 88, 32 };

        int[] v2 = new int[Integer.parseInt(args[0])];
        for (int i = 0; i < v2.length; i++) {
            v2[i] = (int) (Math.random() * 10);
        }

        // ora v2 è pieno di dati
        int len = v2.length;
        while (len > 1) {
            int indicemin = iMin(v2, len);
            int old = v2[indicemin];
            v2[indicemin] = v2[len - 1];
            v2[len - 1] = old;
            len--;
        }

        // il vettore è ordinato
        for (int x : v2) {
            System.out.print(x + " ");
        }

    }
}
