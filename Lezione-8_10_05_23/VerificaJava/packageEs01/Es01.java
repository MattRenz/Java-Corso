package VerificaJava.packageEs01;

import java.util.Scanner;

// Es01

// Scrivere un programma in cui:

// 1. Si chiede all'utente quanti numeri vuole inserire
// 2. Si chiede all'utente quale operazione vuole fare
//    1: somma
//    2: somma dei numeri inseriti che sono pari
//    3: prodotto

// 3. In un ciclo for si chiedono all'utente i numeri

// 4. Si stampa l'esito dell'operazione effettuata

// ## Esempio

// Quanti numeri vuoi inserire?
// 3
// Quale operazione(1 somma, 2 somma pari, 3 prodotto)?
// 2
// Inserisci numero:
// 32
// Inserisci numero:
// 20
// Inserisci numero:
// 17
// La somma dei numeri pari è 52






public class Es01 {


    public static void Operazioni(int scelta, int[] array){

        if  (scelta == 1){
 
            int somma = 0;
            for (int i : array){

                somma +=i;
            }

            System.out.println(String.format("\n Somma: %d",somma));
        }

        if (scelta == 2){

            int sommaNumPari = 0;

            for(int i :  array){

                if (i %2 == 0){
                    sommaNumPari +=i;   
            }
        }
            
        System.out.println(String.format("\n Somma numeri pari: %d",sommaNumPari));
    
        }    

        if (scelta == 3){

            int[] prod = new int[array.length];

            for (int i = 0; i < prod.length; i++){

                prod[i] = array[i] * 2;

            }

            for (int i : prod){

                System.out.println(String.format("\n Prodotto: %d",i));

            }
                
        }

   

}
    

    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        System.out.print("\n Quanti numeri vuoi inserire? ");
        int numUtente = input.nextInt();

        int[] arrayNum = new int[numUtente];

        System.out.print("\n Quale operazione vuoi fare ? \n 1) Somma 2) Somma pari 3) Prodotto ");
        int sceltaOper = input.nextInt();


        for (int i = 0; i < arrayNum.length; i++){
            
            System.out.print("\n Numero: ");
            int num = input.nextInt();

            arrayNum[i] = num;
        }
        
        Operazioni(sceltaOper, arrayNum);


    }
  
}
