package JavaUtilFunction;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class utilfunction {
    
    public static void main(String[] args) {


        // Supplier chiamo e da valori senza parametri

        Supplier<String> supstr = () -> {

            String alfa = "0123456789ABCDEFGHILMNOPQRSTUVWXYZabcdefghilmnopqrstUvwxyz";
            Random rnd = new Random();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < (10 + rnd.nextInt(40)); i++) {
                int p = rnd.nextInt(alfa.length());
                sb.append(alfa.substring(p,p+ 1));
            }
            return sb.toString();
           
        };

        System.out.println(supstr.get());
        System.out.println(supstr.get());

        // Consumer lo chiamo e accetta un singolo argometno di <T>, prende tutto ciò che gli passiamo 
        
        List<Integer> li = Arrays.asList(3, 2, 6, 5, 8, 7, 9, 1, 3, 2, 5, 9, 0);

        Consumer<Integer> intcons = (Integer v) -> {
            System.out.print(v + " ");
        };
        
        li.forEach(intcons); // forEach è fatto apposta per i consumatori
        System.out.println();
        
        
        // Predicato <T> accetta un tipo di dato e ritorna ture o false

        // metodo test(T t)

        Predicate <Integer> intpred = (Integer n) -> {
            return n < 6;
        };

        System.out.println(li.stream().filter(intpred).toList());
    

        // FUnction ha un parametro d'ingresso un valore d'uscita <T, R> trasfomra l'elemento

        
        Function<Integer, String> inttostr = (Integer v) -> {
            return "<" + v.toString() + ">";
        };
        
        System.out.println(li.stream().map(inttostr).toList());
    
        
        // Operatore Unario

        UnaryOperator<Integer> uniint = (Integer v) -> {
            return v * 2;
        };
    
        System.out.println(li.stream().map(uniint).toList());


        // BinaryOperator prende 2 valori dello stesso tipo e torna 1 intero
        
        
        // BiFunction <T, U, R> // 2 tipi diversi in ingresso e torna un altro tipo

        
        // BiCOnsumer <T, U> prende 2 valori di tipo diverso e non restituisce niente

              
    
        
    }

}
