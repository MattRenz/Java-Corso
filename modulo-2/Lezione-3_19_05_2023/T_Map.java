import java.util.Map;
import java.util.TreeMap;

// MAP uguale dizionario python chiave-valore


public class T_Map {
  public static void main(String[] args) {
    
    Map<String, Integer>  msi = new TreeMap<>();

    // voglio inserire la coppia ("uno", 7)

    msi.put("uno",7);
    msi.put("quattro",3);
    msi.put("uno",13);


    for (String k : msi.keySet()) {

        System.out.println("Chiave: " + k + ", Valore: " + msi.get(k));
  
    }

  }  
}
