package PkgesEs01;

public class Es01 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // int[] v = new int[1000];
        // System.out.println(v);

        // Lista x = new Lista();
        // System.out.println(x);

        // Lista p = new Lista();

        // ArrayList<String> ls = new ArrayList<>();

        int a = 235;
        int b = 167;
        /*
         * 11101011
         * 10100111
         * ========
         * 10100011 => 163
         */

        /*
         * Operatore AND
         * 0 0 0
         * 0 1 0
         * 1 0 0
         * 1 1 1
         * 
         * Operatore OR
         * 0 0 0
         * 0 1 1
         * 1 0 1
         * 1 1 1
         * 
         * Operatore XOR
         * 0 0 0
         * 0 1 1
         * 1 0 1
         * 1 1 0
         * 
         */

        System.out.println(a & b);
        // il && si applica esclusivamente a elementi booleani
        // System.out.println(a && b);
        System.out.println(a > 10 && b < 1000);

    }
}