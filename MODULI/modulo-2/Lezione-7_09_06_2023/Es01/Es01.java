package Es01;

import java.util.*;

public class Es01 {
    

    public static void main(String[] args) {
        
        List<Integer> li = new LinkedList<>();

        Random rnd = new Random(0);
    
        for (int i = 0; i < 100; i++){
        
            li.add(rnd.nextInt(10000));
        }

        Collections.sort(li);

        System.out.println(Collections.max(li));

        System.out.println(Collections.min(li));

        Collections.reverse(li);
  
        System.out.println(li);
    }


}
