import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Automobile {
    String modello;
    String costruttore;
    int cilindrata;

    public Automobile(String m, String c, int ci) {
        modello = m;
        costruttore = c;
        cilindrata = ci;
    }

    public int GetCilindrata(){
        return cilindrata;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d", modello, costruttore, cilindrata);
    }
}

public class Es_ripasso {
    public static void main(String[] args) throws Exception {

        List<Automobile> lauto = new LinkedList<>();

        Automobile a1 = new Automobile("panda", "fiat", 900);
        lauto.add(a1);
        a1 = new Automobile("Enzo", "Ferrari", 3000);
        lauto.add(a1);
        a1 = new Automobile("Miura", "Lamborghini", 3500);
        lauto.add(a1);
        a1 = new Automobile("a1", "Citroen", 650);
        lauto.add(a1);

        // System.out.println(lauto);

        // 1) ??? Modificare la classe in modo da consentirne la stampa
        // tramite System.out.println

        System.out.println("\n Stampa lista di auto: ");

        System.out.println(lauto.toString());

        // 2) ??? Ordinare la lista per cilindrata e stamparla dalla
        // cilindrata più piccola alla cilindrata più grande


        Collections.sort(lauto, Comparator.comparingInt(Automobile::GetCilindrata));

        System.out.println("\n Ordinamento per Cilindrata: ");

        System.out.println(lauto.toString());

        
    }
}
