package Pkges_Es01;

public class Professionista extends Persona {

    String attivita;
    int redditoAnnuo;

    public Professionista(String nome, int eta, String residenza, String attivita, int redditoAnnuo) {
        super(nome, eta, residenza);
        this.attivita = attivita;
        this.redditoAnnuo = redditoAnnuo;
    }

    public void SchedaProfessionista() {

        System.out.println("Nome: " + nome);
        System.out.println("Eta: " + eta);
        System.out.println("Residenza: " + residenza);
        System.out.println("Attività: " + attivita);
        System.out.println("Reddito annuo: " + redditoAnnuo);

    }
}
