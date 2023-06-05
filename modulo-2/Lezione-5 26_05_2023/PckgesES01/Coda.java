package PckgesES01;

import java.util.LinkedList;

/*
         

    Utilizzando una LinkedList, costruire una classe Queue (coda) che
        ha i seguenti metodi


    
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


public class Coda {

    public LinkedList<String> lsit;


    // Costruttore
    
    public Coda(LinkedList<String> lsit){

        this.lsit = new LinkedList<>();

    }

    // 2) enqueue(item) => inserisce in coda un elemento
    public void AddElementoInCoda(String elemento){
        lsit.add(elemento);
    }

    //3) dequeue() => torna il primo elemento della coda e lo toglie dalla coda
    public void dequeue(){

        if (lsit.size() <= 0){
            System.out.println("\n Coda vuota");
        } else {
            System.out.println(lsit.removeFirst());
        }

 
    
    }


    //4) empty() => true se la coda è vuota
    public void CodaPiena(){

        if (lsit.isEmpty() == true){
            System.out.println("\n Coda vuota");
        }
        else {
            System.out.println("\n Coda non vuota, contiente: " + lsit.size() + " elemento/i");
        }
       
        
    }
    
    //5) size() => torna quanti elementi ci sono in coda
    public int Size(){
        return lsit.size();
    }

    //6) clear() => cancella tutti gli elementi presenti in coda
    public void Elimina(){
        lsit.clear();

        if (lsit.size() <= 0){
            System.out.println("\n Elementi eliminati correttamente");
        } 
        
    }


    //7) top() => torna il primo elemento della coda senza toglierlo dalla coda
    public void top(){

        System.out.println(lsit.getFirst());
        
    }


    // stampa intera coda 
    public void StampaCoda(){

        for (String i : lsit){
            System.out.println("\n " + i);
 
        }
    
    }


    

    
}


