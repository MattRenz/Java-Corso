import java.util.*;


public class T_Set {
   public static void main(String[] args) {
    
    Set<Integer> si = new TreeSet<>();
                        //TressSer (ordinata)
                        //HashSet (non rodianta) 

    si.add(10);
    si.add(20);
    si.add(100);
    si.add(30);
    si.add(20);
    si.add(10);
    si.add(20);
    si.add(100);

    
    for (int x : si){
        System.out.println(x);
    }
       
    }
}
