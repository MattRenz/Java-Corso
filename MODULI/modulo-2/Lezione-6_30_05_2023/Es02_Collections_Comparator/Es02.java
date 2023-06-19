package Es02_Collections_Comparator;

import java.util.*;

public class Es02 {

    public static void main(String[] args) {

        // Creo una lista di persone
        List<Persona> lp = new LinkedList<>();
        lp.add(new Persona("Mario", "Rossi", 24));
        lp.add(new Persona("Paolo", "Bianchi", 25));
        lp.add(new Persona("Giuseppe", "Verdi", 21));
        lp.add(new Persona("Antonio", "Turchese", 19));
        lp.add(new Persona("Giuseppe", "Verdi", 89));
        lp.add(new Persona("Giuseppe", "Verdi", 24));
        lp.add(new Persona("Giuseppe", "Rossi", 24));

        // Ordina in base all'età in ordine crescente
        Collections.sort(lp, Comparator.comparingInt(Persona::getEta));

        System.out.println(lp.toString());
        // Avremo una lista cotente persone, ordiante per età in ordine crescente

        // Come posso ordinare rispetto al nome o al cognome?
        // devo passare al Comparatore una funzione/metodo di compare/confronto

        Comparator<Persona> comp = new Comparator<>() {

            public int compare(Persona p1, Persona p2) {

                // ordiniamo rispetto a nome, cognome ed età?
                int inome = p1.nome.compareTo(p2.nome);
                int icognome = p1.cognome.compareTo(p2.cognome);
                int ieta = p1.eta - p2.eta;

                if (inome < 0) {
                    return -1;
                }
                if (inome > 0) {
                    return 1;
                }
                if (icognome < 0) {
                    return -1;
                }
                if (icognome > 0) {
                    return 1;
                }
                return ieta;
            }

        };

        lp.sort(comp);
        System.out.println(lp.toString());
    }
}
