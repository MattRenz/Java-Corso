package Es03_iteratori;

import java.util.*;
import java.util.Iterator;

public class Es03_Iteratori {
    public static void main(String[] args) {

        List<Integer> li = new LinkedList<>(); // Lista ddi 10 elementi casuali tra 1 e 1000

        Random random = new Random();
        int randomRange = random.nextInt(1000) + 1;
        for (int i = 0; i < 10; i++) {
            li.add(random.nextInt(randomRange));
        }

        // Come posso modificare una lista che mi tolga tutti gli elementi superiori al
        // 300 ?

        // Modo molto più lento e complesso per leggere e modificare la lista

        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));

            // ogni volta devo accedere all'elemento i-esimo della lista
            // quindi se la lista è lunga N, allora
            // al termine avrò effettuato N*N operazioni
            // Non è feasibile/utilizzabile
        }

        // Uso un iteratore sulla lista Iteratore che rimuove tutti gli elementi
        // superiori al 300

        Iterator<Integer> lit = li.iterator();

        while (lit.hasNext()) { // true se ha un elmento successivo, altrimenti false

            int v = lit.next(); // restituisce l'elemento succcessivo e sposta l'itertore in avanti

            if (v > 300) { // se è maggiore di 300 rimuovilo
                lit.remove();
            }

            System.out.println(v); // scorrimento lista

        }

        System.out.println(li); // lista modificata

        // Creiamo la biblioteca e agggiungiamo qualche libro

        Biblioteca bib = new Biblioteca();

        bib.addLibro("L'isola del tesoro");
        bib.addLibro("1");
        bib.addLibro("L'isola misteriosa");
        bib.addLibro("1");
        bib.addLibro("Il giro del mondo in 80 giorni");
        bib.addLibro("I pirati di Monpracen");
        bib.addLibro("1");
        bib.addLibro("Ventimila leghe sotto i mari");
        bib.addLibro("1");
        bib.addLibro("Cuore");
        bib.addLibro("1");

        // Modifichiamo la lista levando "1"

        Iterator<String> is = bib.iterator();

        while (is.hasNext()) {

            var i = is.next();

            if (i.length() == 1) {
                is.remove();
            }
            // System.out.println(i);
        }

        // Ora stampiamo la lista modificata senza 1
        is = bib.iterator();
        while (is.hasNext()) {
            var v = is.next();
            System.out.println(v);
        }

    }

}
