package Pkges_Es03;

public class Autroe {
    
    static String nome;
    static String nazionalita;

    public Autroe(String nome, String nazionalita){

        Autroe.nome = nome;
        Autroe.nazionalita = nazionalita;
    }


    static void StampaAutore(){

        System.out.println("Nome: " + nome);
        System.out.println("Nazionalità: " + nazionalita);
        
    }

}