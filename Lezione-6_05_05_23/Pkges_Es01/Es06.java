package Pkges_Es01;

import java.util.Scanner;

/*
     * definire la classe Persona
     * - nome (string)
     * - eta (int)
     * - residenza (string)
     * 
     * definire una specializzazione della classe persona Dipendente
     * - mansioni (string)
     * - stipendio (int)
     * definire una specializzazione della classe persona Professionista
     * - Attività (string)
     * - Reddito annuale (int)
     * 
     * definire una classe archivio di persone
     * - che contiene un array, non necessariamente pieno, di persone
     * - che ha come metodi:
     * - boolean AddPersona(Persona p)
     * - int ContaPersone()
     * - void StampaPersona(int i) //stampa la persona al posto n. i
     * - void StampaPersone()
     * 
     * Il programma main presenta un menu di opzioni:
     * 1) aggiungere una nuova persona (deve essere data la
     * possibilità di scegliere tra Dipendente e Professionista)
     * 2) stampare quante persone sono in archivio
     * 3) stampare l'i-esima persona (legge indice da tastiera)
     * 4) Stampare tutte le persone presenti in archivio
     * 
     */

public class Es06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArchivioPersone archivioPersone = new ArchivioPersone();

        System.out.println(
                "1) Aggiungi nuova persona 2) Stampa nm persone in archivio 3) Stampa persona in archivio 4) Stampare tutte le persone");

        System.out.print("Menu: ");
        int scelta1 = input.nextInt();

        // aggiungi persona (1)

        if (scelta1 == 1) {

            System.out.print("Inserire Dipendete o Professionista (1,2)");
            int scelta = input.nextInt();

            // Dipdendente
            if (scelta == 1) {

                for (int i = 0; i < archivioPersone.GetLenArrayDipendenti(); i++) {

                    System.out.print("Nome: ");
                    String nome = input.next();

                    System.out.print("Eta: ");
                    int eta = input.nextInt();

                    System.out.print("Residenza: ");
                    String residenza = input.next();

                    System.out.print("Mansioni: ");
                    String mansioni = input.next();

                    System.out.print("Stipendio: ");
                    int stipendio = input.nextInt();

                    Dipendente dipendente = new Dipendente(nome, eta, residenza, mansioni, stipendio);

                    archivioPersone.addDipendente(dipendente);
                }

            }

            // Professionista
            if (scelta == 2) {

                for (int i = 0; i < archivioPersone.GetLenArrayProfessionisti(); i++) {

                    System.out.print("Nome: ");
                    String nome = input.next();

                    System.out.print("Eta: ");
                    int eta = input.nextInt();

                    System.out.print("Residenza: ");
                    String residenza = input.next();

                    System.out.print("Attività: ");
                    String attivita = input.next();

                    System.out.print("Reddito annuo: ");
                    int redditoAnnuo = input.nextInt();

                    Professionista professionista = new Professionista(nome, eta, residenza, attivita, redditoAnnuo);
                    archivioPersone.addProfessionista(professionista);
                }

            }

        }

    }
}
