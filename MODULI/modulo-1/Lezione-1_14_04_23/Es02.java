public class Es02 {
    public static void main(String[] args) {

        // Operatori di incremento

        int pippo = 10;
        System.out.println(pippo++); // pippo++ prima il valore di pippo (10)
        System.out.println(pippo++); // poi il valore incrementato (11)

        int pluto = 100;
        System.out.println(++pluto); // ++pippo incrementa il valore subito (101)
        System.out.println(++pluto); // 102

        // Operatori di shift

        byte b = 1; // b = 00000001

        System.out.println(b << 5); // significa che sposto tutti gli elementi di bit verso sinitra
        // 0000010 (2)

        System.out.println(b >> 5);

        System.out.println(35 >> 2);

        // Casting modificare un tipo

        int i = 10;
        System.out.println(i);
        System.out.println((float) (i));

        // if / else
        if (i > 10) {

            // istruzioni
        }

        else {

            // istruzione
        }

        // for

        for (int j = 0; i > 100; j++) {
            System.out.println(j);
        }
    }
}
