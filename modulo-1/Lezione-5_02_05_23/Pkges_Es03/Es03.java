package Pkges_Es03;

import java.util.Scanner;

/*
 * ES03: Creare una classe Java chiamata "Veicolo" con i seguenti attributi: 
    - marca (String), 
    - modello (String) e 
    - anno (int).
Quindi, creare una sottoclasse di Veicolo chiamata 
    Auto
con un attributo aggiuntivo chiamato
    - numDoors (int).

    Nel costruttore di Car, utilizzare la parola chiave "super" per
    richiamare il costruttore di Vehicle e impostare gli attributi make,
    model e year. Infine, scrivete un programma che crei un'istanza di
    Auto e ne stampi marca, modello, anno e numero di porte.
 * 
 */

public class Es03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Veicolo[] veicoli = new Veicolo[2];
        Auto[] autoArray = new Auto[2];

        System.out.print("Inserire Auto o Veicolo (1-2): ");
        int scelta = input.nextInt();

        if (scelta == 2) {

            for (int i = 0; i < veicoli.length; i++) {

                System.out.print("Marca: ");
                String marca = input.next();

                System.out.print("Modello: ");
                String modello = input.next();

                System.out.print("Anno: ");
                int anno = input.nextInt();

                Veicolo veicolo = new Veicolo(marca, modello, anno);

                veicoli[i] = veicolo;

            }

            for (int i = 0; i < veicoli.length; i++) {

                System.out.println("");
                veicoli[i].SchedaVeicolo();
            }

        }

        if (scelta == 1) {

            for (int i = 0; i < autoArray.length; i++) {

                System.out.print("Marca: ");
                String marca = input.next();

                System.out.print("Modello: ");
                String modello = input.next();

                System.out.print("Anno: ");
                int anno = input.nextInt();

                System.out.print("Numero porte: ");
                int numPorte = input.nextInt();

                Auto auto = new Auto(marca, modello, anno, numPorte);

                autoArray[i] = auto;

            }

            for (int i = 0; i < autoArray.length; i++) {

                System.out.println("");
                autoArray[i].ScehdaAuto();
                ;

            }

        }

    }

}