package Pkges_Es03;

public class Libro {

    static String titolo;
    static Autroe autuore;
    static int scaffale;
    
    public Libro(String titolo, Autroe autore, int scafale){

        Libro.titolo = titolo;
        Libro.autuore = autore;
        Libro.scaffale = scafale;

    }


    public void StampaTuttiILibri(){

        System.out.println("Titolo: " + titolo);
        Autroe.StampaAutore();
        System.out.println("Scaffale: " + scaffale);
    
    }

}
