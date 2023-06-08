package Es03_iteratori;

import java.util.*;

//la classe biblioteca implementa l'interfaccia Iterable (di string
// poiché navigheremo su una lista di stringhe)

class Biblioteca implements Iterable<String> {
    private List<String> libri;

    public Biblioteca() {
        libri = new LinkedList<>();
    }

    public void addLibro(String s) {
        libri.add(s);
    }

    /*
     * Questo è il metodo che torna l'iteratore
     * l'iteratore è un oggetto che consente di navigare sulla biblioteca
     * e, nello specifico, sulla lista dei libri
     */

    public Iterator<String> iterator() {
        return new BibIterator();
    }

    private class BibIterator implements Iterator<String> {

        // su una lista non posso andare al successivo (le liste di Java non
        // hanno metodi next o prec)

        // converto in array in modo da iterare tramite indice

        // Convertire una lista di stringhe in array di stringhe!!!

        private String[] elenco;
        private int index;
        private int eliminati;

        public BibIterator() {
            elenco = libri.toArray(new String[0]);
            index = 0;
            eliminati = 0;
        }

        public boolean hasNext() {
            return index < elenco.length;
        }

        public String next() {
            if (hasNext()) {
                return elenco[index++];
            }
            throw new java.util.NoSuchElementException();
        }

        public void remove() {
            // rimuove l'elemento corrente (dalla lista e non dal vettore)
            if ((index - eliminati) > 0) {
                libri.remove(index - eliminati - 1);
                eliminati++;
            } else {
                throw new UnsupportedOperationException();
            }
        }
    }
}