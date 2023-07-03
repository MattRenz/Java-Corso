import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Mia implements Comparable<Mia> {
    public String nome;
    public String cognome;
    public int eta;

    public Mia() {

    }

    public Mia(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d", nome, cognome, eta);
    }

    @Override
    public int compareTo(Mia o) {
        return cognome.compareTo(o.cognome);
    }

    String getCognome() {
        return cognome;
    }

    int getEta() {
        return eta; 
    }
    
}

public class App {

    private static void Cambia(int i) {
        i = 200;
    }

    private static void Cambia(List<Integer> li) {
        li = Arrays.asList(1, 2, 3);
    }

    public static void main(String[] args) {

        /* Programmazione funzionale in Java
         * Map rduce filter
         */

        { // Creo una lista di interi Arrays.asList per creare al volo una lita di interi
            List<Integer> li = Arrays.asList(3, 2, 6, 5, 8, 7, 9, 1, 3, 2, 5, 9, 0);

            List<String> ls = Arrays.asList("string1, string2, string3, string4, string5, string6, string7, string8");

            List<Mia> lMia = Arrays.asList(
                    new Mia("Marco", "Rossi", 35),
                    new Mia("Andrea", "Palomino", 27),
                    new Mia("Luigi", "Caparotti", 33));

            System.out.println(li);
            System.out.println(ls);
            System.out.println(lMia);

            Mia m = new Mia();
            m.toString(); // Ci riporta alla classe toString() della classe Mia

            // Oridanre in verso crescente le tre liste

            Collections.sort(li); // Ordina la lista in ordine crescente
            System.out.println(li);

            // int i = 10;
            // Cambia(i);
            // System.out.println(i);

            // Cambia(li);
            // System.out.println(li);

            // La lista di stringhe
            Collections.sort(ls); // Ordina la lista in ordine crescente
            System.out.println(ls);

            Collections.sort(lMia); // Oridna la lista per cognome
            System.out.println(lMia);

            System.out.println(Collections.max(li)); // Massimo della lista di interi
            System.out.println(Collections.min(li)); // Minimo della lista di interi

        }

        {
            List<Integer> li = Arrays.asList(3, 2, 6, 5, 8, 7, 9, 1, 3, 2, 5, 9, 0);

            List<String> ls = Arrays.asList("string1", "string2", "string3", "string4", "string5", "string6", "string7", "string8");

            List<Mia> lMia = Arrays.asList(
                    new Mia("Marco", "Rossi", 35),
                    new Mia("Andrea", "Palomino", 27),
                    new Mia("Luigi", "Caparotti", 33));

            // MAP 
            
            // fare il reciproco degli elementi della lista li

            List<Double> reciproci = li.stream().map((Integer v) -> {
                return 1.0/v;
            }).toList();
            
            System.out.println(reciproci);
            
            // Costruire una lista che contenga le lunghezzze delle stringhe presenti in ls
            List<Integer> lunghezza = ls.stream().map(
                (String s) -> {
                
                    return s.length();
                
            }).toList();

            System.out.println(lunghezza);

            // Modificare gli oggetti di tipo Mia nella lista lmia, aggiungendo 5 anni all'eta

            List<Mia> leta = lMia.stream().map(
                (Mia m) -> {
                    m.eta += 5; // modifichiamo direttamente l'elemento della lista
                    return m;
                
                }).toList();
        
            System.out.println(leta);

            // FILTER 

            // Csa fa filter ? COnsente di eliminare elementi di una lista sneza modificare i valori

            // Sintassi lambda estesa
            List<Integer> limod = li.stream().filter(
                (Integer v) -> {
                        return v < 6;
                
                }).toList();
       
            // Sintassi lambda semplificata

            List<Integer> limods = li.stream().filter(v -> v < 6).toList();
            System.out.println(li); // Lista totale
            System.out.println(limods); // Lista con soli valori minori di 6
            
     

            // REDUCE
            
            // reduce in genere fornics un solo valore aggregando gli elementi dello stream

            int v = li.stream().reduce(0, (c, p) -> c + p);
            
            System.out.println(v);
            
        }
        


    }

    

}