package PckgesES01;

import java.util.Scanner;

public class Es01 {


    // * Scrivere un programma main che consente di
    // * 1) leggere l'archivio di tutte le persone da file
    // * 2) scrivere l'archivio di tutte le persone da file
    // * 3) Stampare a video l'intero archivio
    // * 4) cercare una persona per cognome e stamparla a video
    // * 5) aggiornare nome, eta ,professione di una persona riconosciuta tramite
    // * cognome
    // * - dato il cognome ,aggiornare gli altri campi richiesti

    // enum Comandi {
    //     e_LEGGI_DA_FILE,
    //     e_SCRIVI_SU_FILE,
    //     e_CERCA_PERSONA,
    //     e_CANCELLA_PERSONA,
    //     e_CAMBIA_ETA,
    //     e_CAMBIA_NOME,
    //     e_CAMBIA_PROFESSIONE,
    //     e_CAMBIA_COGNOME,
    //     e_STAMPA_ARCHIVIO,
    //     e_TERMINA
    // };

    static void Menu() {
        System.out.println("Inserire i valori indicati");
        System.out.println();
        System.out.println("1) Leggi archivio da disco");
        System.out.println("2) Salva archivio su disco");
        System.out.println("3) Cerca persona in archivio");
        System.out.println("4) Elimina persona da archivio");
        System.out.println("5) Cambia parametri");
    }

    // private static Es01.Comandi GetMenu(int num){
    //     // Leggo numero da terminale e converto in comando della enum
    //     int numero = 0;
    //     // leggo il numero da terminale
    //     return Comandi.values()[numero];
    // }

    public static void main(String[] args) throws Exception {

        try (Scanner input = new Scanner(System.in)) {
            // Crea l'archivio
            Archivio archivio = new Archivio();
            
            Menu();

            while(true){
                System.out.print("\n Operazione: ");
                int operazione = input.nextInt();

                if (operazione == 1){
                    archivio.StampaInteroArchivio();
                }

                if (operazione == 2) {
                    archivio.ReadFromFile("PckgesES01/archivio.txt");
                }

                if (operazione == 3 ){
                    System.out.print("\n Ricerca cognome: ");
                    String ricercaCognome = input.next();
                    archivio.CercaPersona(ricercaCognome);
                    
                }
                if (operazione == 4){
                    System.out.print("\n Elimina persona: ");
                    String EliminaPersona = input.next();
                    archivio.EliminaPersonaInArchivio(EliminaPersona);
                }

                if (operazione == 5){
                    System.out.print("\n Cambia parametri persona: ");
                    String CambiaPersona = input.next();
                    archivio.Update(CambiaPersona);
                }
            }
        
        }

    }

}
