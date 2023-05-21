import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Es01 {


/*
 * Costruire una lista di numeri casuali tra 0 e 100 escluso
 * la lista dove contenere un numero casuale di elementi
 * (lunghezza tra 10000 e 20000)
 * per ogni numero tra 0 e 100 escluso, contare quante
 * volte compare nella lista
 * Vi ricordo che per generare un numero casuale:
 * Random rnd = new Random(); //una sola volta
 * rnd.nextInt(100); //per ogni numero tra 0 e 100
 * //che intendete generare
 * Per generare un numero casuale tra 10000 e 20000
 * rnd.nextInt(10000)+10000; //per un numero tra 10000 e 20000
 * 
 * Esempio:
 * lista=> [2,5,7,3,4,5,6,9,8,7,6,7,0,12,31,24...]
 * 2=>1
 * 5=>2
 * 7=>3
 * ...
 /


/
 * NOTA BENE!!!!!!!!!
 * Il progetto va realizzato a step (singoli passi). In particolare
 * 1) Istanzio il generatore di numeri casuali
 * 2) Istanzio la lista di interi
 * 3) Genero il numero casuale ("dim") che indica quanti elementi andranno in
 * lista
 * 4) per "dim" volte inserisco nella lista un numero casuale tra 0 e 100
 * 5) Implemento l'algoritmo di conteggio delle occorrenze
 * 
 * 
 */

    
    public static void main(String[] args) {

        Random rnd = new Random();

        int dimensioneList = rnd.nextInt(10000) + 10000;

        List<Integer> li = new ArrayList<>(dimensioneList);

        
        for (int i = 0; i < dimensioneList; i++){
            int numCasuali = rnd.nextInt(100);
            li.add(numCasuali);
        }
        
        Map<Integer, Integer>  mii = new HashMap<>();
        
        int conta = 0;
        for (int x : li){

            //System.out.println(x);

            for (int xi: li){

                if (x == xi){
                    conta++;
                }
            
            }
            mii.put(x, conta);
            conta = 0;
        }

        for (Integer k : mii.keySet()) {

            System.out.println(k + "=" + mii.get(k));
      
        }
     

        

        

        
 

        
        


        
    }

}
