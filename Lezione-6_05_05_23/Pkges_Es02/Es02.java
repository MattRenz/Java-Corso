package Pkges_Es02;

import java.util.Scanner;

/*
 * Costruire un vettore di doboule chiedendo da terminale la sua dimensione
 * riempirlo di numeri casuali compresi tra 100 e 200 escluso, calcolare la somma totale
 * la media e la varianza. 
 * 
 * La varianza è la somma di tutti gli (M-Vi) al quadrato tutto diviso per il numero di elementi presenti nel vettore
 * 
 */


public class Es02 {

    static Double Media(Double[] array){
        
        Double somma = 0.0;

        for (int i = 0; i < array.length; i++){

            somma += array[i];
        }

        return somma/array.length;
    }

    static Double Somma(Double[] array){

        Double somma = 0.0;

        for (int i = 0; i < array.length; i++){

            somma+=array[i];
        }
    
        return somma;
    }

    
    //La varianza è la somma di tutti gli (M-Vi) al quadrato tutto diviso per il numero di elementi presenti nel vettore
    static Double Varianza(Double[] array, Double media){
        
        Double sumVarianza = 0.0;

        for (int i = 0; i < array.length; i++){

            //Double x = Math.pow(20, 2);

            Double varianza = media - array[i];
            sumVarianza += varianza;

        }

        Double quadratoVarianza = Math.pow(sumVarianza, 2);
        return quadratoVarianza / array.length;

    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Grandezza array: ");
        int num = input.nextInt();
    
        Double[] array = new Double[num];

        for (int i = 0; i < array.length; i++){

            double numberDouble = Math.random() * 200;

            if (numberDouble > 100.00) {
                array[i] = numberDouble;
            } else{
                i = i-1;
            }
        }


        for (Double i : array){
            System.out.println(i);
        }
        
        System.out.println("Somma: " + Somma(array));

        System.out.println("Media: " + Media(array));

        System.out.println("Varianza: " + Varianza(array, Media(array)));


    }
}
