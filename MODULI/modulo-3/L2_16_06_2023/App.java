package L2_16_06_2023.Es01;

import java.util.*;
import java.util.stream.Collectors;

class Nomi {
    String nome;
    String cognome;
    static int numero = 0;

    public Nomi(String n, String c) {
        nome = n;
        cognome = c;
        numero++;
        System.out.println("Sono nel costruttore della classe NOmi");
    }

    public Nomi() {

    }
}

public class Es01 {

    // molto veloce
    static String GenStringSB(int len) {
        final String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        final Random rnd = new Random();

        StringBuilder sb = new StringBuilder();
        while (len-- >= 0) {
            sb.append(alfabeto.charAt(rnd.nextInt(26)));
        }

        return sb.toString();
    }

    // molto lenta
    static String GenStringString(int len) {
        final String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        final Random rnd = new Random();

        String sb = "";
        while (len-- >= 0) {
            sb += alfabeto.charAt(rnd.nextInt(26));
        }

        return sb;
    }

    public static void main(String[] args) throws Exception {

        Nomi n1 = new Nomi("mario", "rossi");
        Nomi n2 = new Nomi("mario", "verdi");

        n1 = new Nomi("Nuigi", "neri");

        System.out.println(n1);

        int v1 = 1000;
        String v2 = "String";
        Double d1 = 123.321;

        String dastampare = String.format("Il  numero è: %d; la stringas: <%s", v1, v2);

        // Multi line string
        System.out.print("""
                Menu:
                =====

                1) voce 1
                2) voce 2
                ....""");

        // Se, nel primo parametro della format non ci sono %s/c/d/e/f/g/b...
        // allora la formato non ha ulteriori parametri
        String ss = String.format("aksjdhak shdkajshd kajs d");
        System.out.println(ss);

        ss = String.format("aksjdhak\nshdkajshd\n\tkajs d\n");
        System.out.print(ss);

        String str1 = "Ciao";
        int int1 = 10;
        double dbl1 = 10000.123456;
        ss = String.format("\n\n\nQualsiasi testo %s, %s, %s\nNumero: %d\n\tDouble: %f\n", str1, str1, str1, int1,
                dbl1);
        System.out.print(ss);

        // voglio stampare una cosa del tipo
        /*
         * 1) testo
         * 2) testo
         * 3)
         * ...
         */
        // Senza string.format
        for (int i = 1; i < 12; i++) {
            if (i < 10) {
                System.out.print(" ");
            }
            System.out.println(i + ")" + "Testo");
        }

        // Con string.format!! Un numero tra % e il format indica lo
        // spazio MINIMO a disposizione dell'elemento che sto stampando
        for (int i = 1; i < 12; i++) {
            System.out.print(String.format("%3d) Testo\n", i));
        }

        System.out.print(String.format("<%12d>) Testo\n", 1));
        System.out.print(String.format("<%12s>) Testo\n", "Ciao"));
        System.out.print(String.format("<%12s>) Testo\n", "Ciaoksdf ksjdhfk shfd"));

        // Per i numeri decimali posso avere due numeri e non uno solo dopo il %
        // il secondo numero dopo il % indica il numero di cifre decimali
        System.out.print(String.format("<%12f>) Testo\n", 12.3456));
        System.out.print(String.format("<%12.2f>) Testo\n", 12.3456));

        /*
         * 
         */
        List<Integer> li = new LinkedList<>();
        Random rnd = new Random(0);
        for (int i = 0; i < 10; i++) {
            li.add(rnd.nextInt(100));
        }

        // Stampare la lista li ordinata!!!!
        Collections.sort(li);
        System.out.println(li);

        System.out.println(Collections.max(li));
        System.out.println(Collections.min(li));

        Collections.reverse(li);
        System.out.println(li);

        Collections.rotate(li, 2);
        System.out.println(li);

        List<Nomi> nomi = new ArrayList<>();
        nomi.add(new Nomi("a", "b"));
        nomi.add(new Nomi("e", "c"));
        nomi.add(new Nomi("b", "d"));
        nomi.add(new Nomi("h", "e"));

        System.exit(0);

        // // ordinare la lista!!!!
        // Collections.sort(nomi);
        // System.out.println(nomi);

        /*
         * Data una lista di numeri interi, come fareste in
         * python a mettere tutti i numeri "al quadrato?"
         * ln = [2, 3, 4, 5]
         * print(list(map(lambda x: x*x, ln)))
         */

        System.out.println(li);

        // applica una funzione a tutti gli elementi della lista, trasformandoli
        // NB; la lunghezza della lista resta invariata
        List<Integer> li1 = li.stream().map((Integer v) -> v * v).collect(Collectors.toList());
        System.out.println(li1);

        List<Integer> li2 = li.stream().map((Integer v) -> v * 2).collect(Collectors.toList());
        System.out.println(li2);

        /*
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         */
        List<String> ls = new LinkedList<>();
        ls.add("uno");
        ls.add("due");
        ls.add("tre");
        ls.add("quattro");
        ls.add("cinque");
        ls.add("sei");
        ls.add("sette");
        ls.add("otto");
        ls.add("nove");
        ls.add("dieci");

        List<Integer> llun = ls.stream().map(s -> s.length()).collect(Collectors.toList());
        // il compilatore java converte in ogni caso questa dichiarazione lambda
        // semplificata in:
        List<Integer> lluo = ls.stream().map((String s) -> {
            return s.length();
        }).collect(Collectors.toList());

        System.out.println(llun);

        // Altro esempio

        long inizio = System.nanoTime();
        String sout = GenStringSB(10000);
        long fine = System.nanoTime();
        System.out.println("Il tempo per generare la stringa è: " + (fine - inizio));

        inizio = System.nanoTime();
        sout = GenStringString(10000);
        fine = System.nanoTime();
        System.out.println("Il tempo per generare la stringa è: " + (fine - inizio));

        // System.in.read();

        /*
         * 
         * 
         * 
         * 
         * 
         * 
         */

        // voglio creare una nuova lista dove le stringhe diventano maiuscole
        List<String> ls1 = ls.stream().map((String s) -> s.toUpperCase()).collect(Collectors.toList());

        System.out.println(ls1);

        // converto le stringhe in parole che iniziano per maiuscola
        ls1 = ls.stream().map(
                (String s) -> {
                    // quante istruzioni mi servono
                    return s.substring(0, 1).toUpperCase() + s.substring(1);
                }).collect(Collectors.toList());
        System.out.println(ls1);

        System.out.println(li);

        // Voglio lasciare in li solo i numeri pari!!!!
        List<Integer> lpari = li.stream().filter((Integer n) -> (n % 2) == 0).collect(Collectors.toList());
        System.out.println(lpari);

        // Voglio calcolare la somma di tutti gli elementi di li
        Integer somma = li.stream().reduce(0, (Integer c, Integer p) -> {
            return c + p;
        });
        System.out.println(somma);

        // per calcolare la lunghezza totale delle stringhe contenute
        // in ls con la reduce, concateno tutte le stringhe e poi ne calcolo la
        // lunghezza
        int lunghezza = ls.stream().reduce("", (String s, String p) -> {
            return s + p;
        }).toString().length();
        System.out.println("Lunghezza totale: " + lunghezza);

        lunghezza = ls.stream().reduce(
                0,
                (Integer p, String s) -> {
                    return p + s.length();
                },
                (Integer p, Integer c) -> {
                    return p + c;
                });
        System.out.println("Lunghezza totale: " + lunghezza);

        List<Nomi> lnomi = List.of(new Nomi("a", "b"), new Nomi("c", "d"));

        Nomi[] vnomi = { new Nomi("a", "b"), new Nomi("c", "d") };
        String[] snomi = { "uno", "due", "tre", "quattro" };
        String[] scognomi = { "cuno", "cdue", "ctre", "cquattro" };

        String[][] v2nomi = { { "nome1", "cognome1" }, { "nome2", "cognome2" } };

        for (int i = 0; i < 4; i++) {
            Nomi nome = new Nomi(snomi[i], scognomi[i]);
            // Aggiunge in lista
        }

    }
}
