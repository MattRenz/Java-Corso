package Pkges_Es01;

public class Dipendente extends Persona {

    String mansioni;
    int stipendio;

    public Dipendente(String nome, int eta, String residenza, String mansioni, int stipendio) {
        super(nome, eta, residenza);
        this.mansioni = mansioni;
        this.stipendio = stipendio;
    }

    public void SchedaDipendente() {

        System.out.println("Nome: " + nome);
        System.out.println("Eta: " + eta);
        System.out.println("Residenza: " + residenza);
        System.out.println("Mansioni: " + mansioni);
        System.out.println("Stipendio: " + stipendio);
    }
}
