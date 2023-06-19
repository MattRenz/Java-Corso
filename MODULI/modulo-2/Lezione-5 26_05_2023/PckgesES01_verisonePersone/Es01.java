package PckgesES01_verisonePersone;

import java.util.LinkedList;
import java.util.Scanner;


public class Es01{

/*
         
                        Il tipo di dato da mettere in coda sono stringhe (es: id di persone per
                        gestire una coda alla posta)
                        Nel main dovete

                        1) creare la coda di stringhe
                        2) inserire in coda un numero qualsiasi di persone
                        3) verificare se la coda è vuota
                        4) verificare quanti elementi sono presenti in coda
                        5) stampare il primo elemento della coda (senza toglierlo dalla coda)
                        6) togliere alcuni elementi dalla coda
                        7) stampare l'intera coda
                        8) cancellare la coda
                        9) verificare quanti elementi sono presenti in coda
                        Per i più rapidi
                        
                        1) modificare la coda in una coda di tipi <generics>
                        2) provarla con elementi della classe Persona (presa da un precedente
                        esercizio)
                    */


    public static void Menu(){
        System.out.println("\n 1) Aggiungi una persona");
        System.out.println("\n 2) Inserisci più persone");
        System.out.println("\n 3) Elimina e ritorna la prima Persona");
        System.out.println("\n 4) Controlla se la coda è vuota");
        System.out.println("\n 5) Persone presenti in coda");
        System.out.println("\n 6) Cancella tutti le Persone della coda");
        System.out.println("\n 7) Torna la prima Persona della coda");
        System.out.println("\n 8) Stampa intera coda");
    }

    public static void main(String[] args) {

            LinkedList<Persona> lsit = new LinkedList<>();

            Coda coda = new Coda(lsit);


            Scanner input = new Scanner(System.in);
    

            while(true){

                Menu();

                System.out.print("\n Operazione: ");
                int operazione = input.nextInt();

                if (operazione == 1){

                    System.out.print("\n Nome: ");
                    String nome = input.next();

                    System.out.print("\n Cognome: ");
                    String cognome = input.next();

                    System.out.print("\n Id: ");
                    int id = input.nextInt();

                    Persona persona = new Persona(nome,cognome, id);

                    coda.AddElementoInCoda(persona);
                    
                }

                if (operazione == 2){


                    System.out.print("\n Inserisci il numero di elmenti che vuoi inserire: ");
                    int numElementi = input.nextInt();
    
                    Persona[] arrayPersone = new Persona[numElementi];

                    for (int i = 0; i < numElementi; i++){

                        // Input utente
                        System.out.print("\n Nome: ");
                        String nome = input.next();

                        System.out.print("\n Cognome: ");
                        String cognome = input.next();

                        System.out.print("\n Id: ");
                        int id = input.nextInt();

                        Persona persona = new Persona(nome,cognome, id);
 
            
                        arrayPersone[i] = persona;
    
                        
                    }

                    for (int i = 0; i < arrayPersone.length; i++){

                        coda.AddElementoInCoda(arrayPersone[i]);
                    }
                    
                 
                }
                
                if (operazione == 3){

                    coda.dequeue();
                    
                }

                if (operazione == 4){

                    coda.CodaPiena();
                    
                }
                if (operazione == 5){
                    
                    System.out.println("\n Ci sono: " + coda.Size() + " Persone in coda");
                }

                if (operazione == 6){

                    coda.Elimina();
                    
                }
                
                if (operazione == 7){

                    coda.top();
                    
                }

                if (operazione == 8){

                    coda.StampaCoda();
                    
                }
            }
            
            }

    }

