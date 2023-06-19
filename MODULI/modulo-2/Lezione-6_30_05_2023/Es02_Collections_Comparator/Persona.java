package Es02_Collections_Comparator;

class Persona {

    String nome;
    String cognome;
    int eta;

    public Persona(String n, String c, int e) {
        nome = n;
        cognome = c;
        eta = e;
    }

    int getEta() {
        return eta;
    }

    public String toString() {
        return String.format("%s, %s, %d", nome, cognome, eta);
    }
}