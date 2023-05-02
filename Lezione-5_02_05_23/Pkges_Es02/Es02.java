package Pkges_Es02;
public class Es02 {
    public static void main(String[] args) {

        Cane cane = new Cane("Bobby", 5);

        Gatto gatto = new Gatto("Fuffy", 3);
        
        Animale animale1 = new Animale("Mucca", 4, "Muu");
        
        cane.GetSuonoCane();

        gatto.GetSuonoGatto();

        animale1.GetSuono();

        /* 
        Animale an1 = new Gatto("pippo", 10);
        if (an1 instanceof Cane) {
            System.out.println("Cane");
            an1.GetSuonoCane();
        } else {
            System.out.println("Gatto");
            an1.GetSuonoGatto();
        }
        */
    }
        
}   


