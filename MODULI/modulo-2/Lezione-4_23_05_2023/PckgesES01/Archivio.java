package PckgesES01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Archivio {

    Map<String, Persona> mappa = null;

    public Archivio() {
        mappa = new TreeMap<>();
    }

    // * 1) leggere l'archivio di tutte le persone da file
    public void ReadFromFile(String string) throws IOException {

        FileReader file = new FileReader(string);

        try (BufferedReader bufferedReader = new BufferedReader(file)) {

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                String nome = line.split(",")[0];
                String cognome = line.split(",")[1];
                int eta = Integer.parseInt(line.split(",")[2]);
                String professione = line.split(",")[3];

                Persona persona = new Persona(nome, cognome, eta, professione);

                // * 2) scrivere l'archivio di tutte le persone da file
                mappa.put(persona.cognome, persona);

            }

            file.close();

        }
    }

    // * 3) Stampare a video l'intero archivio
    public void StampaInteroArchivio() {

        if (mappa.size() == 0) {
            System.out.println("\n Archivio su disco vuoto");
        } else {
            for (Persona k : mappa.values()) {
                System.out.println("");
                System.out.println(k.nome);
                System.out.println(k.cognome);
                System.out.println(k.eta);
                System.out.println(k.professione);
                System.out.println("");

            }
        }

    }

    // * 4) cercare una persona per cognome e stamparla a video
    public void CercaPersona(String ricerca) {

        String ricerca_lower = ricerca.toLowerCase();
        for (String k : mappa.keySet()) {

            String archivio_K = k.toLowerCase();

            if (ricerca_lower.equals(archivio_K)) {

                Persona persona = mappa.get(k);
                System.out.println("");
                System.out.println(persona.nome);
                System.out.println(persona.cognome);
                System.out.println(persona.eta);
                System.out.println(persona.professione);
                System.out.println("");
            }

        }

    }

    public void EliminaPersonaInArchivio(String personaDaEliminare) {

        String ricerca_lower = personaDaEliminare.toLowerCase();

        if (mappa.size() > 0) {
            for (String k : mappa.keySet()) {

                String archivio_K = k.toLowerCase();

                if (ricerca_lower.equals(archivio_K)) {

                    mappa.remove(k);
                }
            }
        } else {
            System.out.println("\n Archivio su disco vuoto");
        }

    }

    // * 5) aggiornare nome, eta ,professione di una persona riconosciuta tramite
    // * cognome
    // * - dato il cognome ,aggiornare gli altri campi richiesti

    public void Update(String ricerca) {
        String ricerca_lower = ricerca.toLowerCase();
        for (String k : mappa.keySet()) {

            String archivio_K = k.toLowerCase();

            if (ricerca_lower.equals(archivio_K)) {

                Persona persona = mappa.get(k);

                // Scanner input = new Scanner(System.in);

                // String nome = "Matteo";
                // String cognome = "Renzi";
                // int eta = 20;
                // String professione = "Stud";

                // String cognome = "Renzi";

                persona.UpdateNome("Matteo");
                persona.UpdateCognome("Renzi");
                persona.UpdateEta(20);
                persona.UpdateProfessione("Stud");

                // Persona persona_new = new Persona(nome, cognome, eta, professione);

                // mappa.put(cognome, persona_new);

                // System.out.print("\n Nome: ");
                // String nome = input.next();
                // persona.UpdateNome(nome);

                // System.out.print("\n Cognome: ");
                // String cognome = input.next();
                // persona.UpdateCognome(cognome);

                // System.out.print("\n Eta: ");
                // int eta = input.nextInt();
                // persona.UpdateEta(eta);

                // System.out.print("\n Professione: ");
                // String professione = input.next();
                // // persona.UpdateProfessione(professione);

                // Persona persona_new = new Persona(nome, cognome, eta, professione);

                // mappa.put(cognome, persona_new);

                // mappa.remove(k);

            }

        }

    }
}
