package L1_09_06_2023.Es01;

import java.util.*;
import java.util.stream.Collectors;

public class Es01 {
    
    public static void main(String[] args) {
        

        List<Integer> li = new LinkedList<>();

        li.add(20);
        li.add(40);
        li.add(2);


        var li1 = li.stream().map((Integer v) -> v * v).collect(Collectors.toList());

        System.out.println(li);

        System.out.println(li1);



        List<String> ls = new LinkedList<>();

        ls.add("uno");
        ls.add("due");
        ls.add("tre");

        List <String> lsl = ls.stream().map((String s) -> s.toUpperCase()).collect(Collectors.toList());
        
        // System.out.println(li1);

        

        
    }
}