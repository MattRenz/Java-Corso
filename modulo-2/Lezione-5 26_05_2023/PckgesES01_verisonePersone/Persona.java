package PckgesES01_verisonePersone;

public class Persona {
    String nome;
    String cognome;
    int id;

    public Persona(String nome, String cognome, int id){

        this.nome = nome;
        this.cognome = cognome;
        this.id = id;
    }

    public void StampPersona(){

        System.out.println("\n Nome: " + nome);
        System.out.println("\n Cognome: " + cognome);
        System.out.println("\n Id: " + id);
    }
}
