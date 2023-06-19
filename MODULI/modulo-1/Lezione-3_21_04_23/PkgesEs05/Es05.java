package PkgesEs05;
/*
 * Crate una classe che chiamerete Persona che contiene le variabili di istanza : etè, nome, altezza
 * 
 * Creare due persone con età diverse 
 * 
 * Mettetele in un vettore array archiviatele in un array
 */
public class Es05 {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Matteo", 196, 20);

        Persona persona2 = new Persona("Andrea", 160, 23);

        Persona[] archivioPersone = {persona1, persona2};

    }
}
