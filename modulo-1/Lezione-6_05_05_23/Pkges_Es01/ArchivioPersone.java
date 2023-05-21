package Pkges_Es01;

public class ArchivioPersone {

    Dipendente[] dipendenti;
    Professionista[] professionista;

    public ArchivioPersone() {
        dipendenti = new Dipendente[3];
        professionista = new Professionista[3];
    }

    // dipendenti
    public int GetLenArrayDipendenti() {
        return dipendenti.length;
    }

    public boolean addDipendente(Dipendente obj) {
        for (int i = 0; i < dipendenti.length; i++) {
            if (dipendenti[i] == null) {
                dipendenti[i] = obj;
                return true;
            }
        }
        return false;
    }

    // professionisti
    public int GetLenArrayProfessionisti() {
        return professionista.length;
    }

    public boolean addProfessionista(Professionista obj) {
        for (int i = 0; i < professionista.length; i++) {
            if (professionista[i] == null) {
                professionista[i] = obj;
                return true;
            }
        }
        return false;
    }

}
