package Pkges_Es03;

public class Auto extends Veicolo{


    int numDoors;


    public Auto(String marca, String modello, int anno, int numDoors){
        super(marca, modello, anno);
        this.numDoors = numDoors;
    }


    public void ScehdaAuto(){
        
        System.out.println("Marca: " + marca);
        System.out.println("Modello: " + modello);
        System.out.println("Anno: " + anno);
        System.out.println("Numero Porte: " + numDoors);
    }



}
