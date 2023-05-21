/*
 *  Data la stringa s="Nel mezzo del cammin di nostra vita"
 *  contare quante vocali ci sono.
 * 
 * Più modi lo stesso risultato
 */

public class Es04 {

    // funzione trova vocali
    public static void GestStringa(String str) {
        int conta = 0;
        for (char c : str.toCharArray()) {
            if ("aeiouAEUOI".contains(String.valueOf(c))) {
                conta++;
            }
        }
        System.out.println("Vocali: " + conta);
    }

    // funzione trova vocali con switch
    public static void GestStringaSwitch(String str) {
        int contaVocali = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contaVocali++;
            }
        }
        System.out.println("Ho trovato " + contaVocali + " vocali");
    }

    // funzione conta vocali
    public static int ContaVocali(String str) {
        if (str.length() == 0) {
            return 0;
        }
        if ("aeiouAEIOU".contains(str.substring(0, 1))) {
            return 1 + ContaVocali(str.substring(1));
        } else {
            return ContaVocali(str.substring(1));
        }
    }

    // Implementazione ricorsiva
    public static long Fattoriale(long n) {
        if (n == 0) {
            return 1;
        }
        return n * Fattoriale(n - 1);
    }

    // Implementazione ITERATIVA
    public static long FattorialeI(long n) {
        if (n == 0)
            return 0;
        long ret = 1;
        for (long i = 1; i <= n; i++) {
            ret *= i;
        }
        return ret;
    }

    // main
    public static void main(String[] args) {

        String str = "Nel mezzo del cammin di nostra vita";

        // metodo 1
        int conta = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                conta++;
            }
        }
        System.out.println(conta);

        // metodo 2 con Funzione GetStringa
        GestStringa(str);

        // metodo 3 con Funzione GestStringaSwitch
        GestStringaSwitch(str);

        // metodo 4 con conta vocali
        ContaVocali(str);
    }
}
