import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Costruiamo una lista di stringhe
 */

public class T_List {
    
    public static void main(String[] args) throws Exception{
        
        List<String> ls = new ArrayList<>();

        ls.add("ciao");

        ls.addAll(Arrays.asList("uno", "due", "tre", "due", "uno"));

        // for (String x : ls){
        //     System.out.println(x);
        // }

        // ADD AD UN ELEMENTO SPECIFICO
        ls.add(4, "pluto");

        for (String x : ls){
            System.out.println(x);
        }

        // FACCCIAMO UNA LISRA CHE CONTIENE UNA LISTA DI VOIT
        List<List<Integer>> lli = new ArrayList<>();
        
        // Dobbimo aggiungere la prima lista di voti a lli 30,28,29

        List<Integer> li = new ArrayList<>();
    
        li.add(28);
        li.add(28);
        li.add(29);

        lli.add(li);


        // Dobbimo aggiungere la seconda lista di voti a lli 24,30,23

        li = new ArrayList<>();

        li.add(24);
        li.add(25);
        li.add(30);

        lli.add(li);

        // Dobbiamo aggiungete la terza lista di voti a lli 20,25,30

        lli.add(Arrays.asList(20,25,30));
        
        // Stampare ogni linea contenuta in lli e i suoi elementi

        for (List<Integer> xi : lli){
            System.out.println(xi);
            for (int i: xi){
            System.out.println(i);
            }
            
        }
    }
}
