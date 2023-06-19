package PckgesES01;


// * Implementare la classe Persona con attributi
// * - nome
// * - cognome
// * - eta
// * - professione
// * E con metodi
// * - IncreaseEta() => somma 1 all'età
// * - UpdateNome(string newNome)
// * - UpdateCognome(string newCognome)
// * - UpdateProfessione(string newProfessione)


public class Persona {
    
    String nome;
    String cognome;
    int eta;
    String professione;

    public Persona(){
        
    }

    public Persona(String nome, String cognome, int eta, String professione){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.professione = professione;
    }

    public void IncreaseEta() {
        eta+=1;
    }

    public void UpdateNome(String newNome){
        nome = newNome;
    }
    public void UpdateCognome(String newCognome){
        cognome = newCognome;
    }
    public void UpdateProfessione(String newProfessione){
        professione = newProfessione;
    }
    public void UpdateEta(int newEta){
        eta = newEta;
    }
}
