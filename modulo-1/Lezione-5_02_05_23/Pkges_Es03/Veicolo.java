package Pkges_Es03;

public class Veicolo {
    String marca;
    String modello;
    int anno;

    public Veicolo(String marca, String modello, int anno){

        this.marca = marca;
        this.modello = modello;
        this.anno = anno;

    }

    public String GetMarca(){
        return marca;
    }

    public String GetModello() {
        return modello;
    }

    public int GetAnno(){
        return anno;
    }

    public void SchedaVeicolo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modello: " + modello);
        System.out.println("Anno: " + anno);
    }

}
