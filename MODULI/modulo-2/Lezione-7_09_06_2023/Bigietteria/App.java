import java.time.LocalDate;
import java.util.Scanner;


public class App {

    static void menu(){
        System.out.println("\n 0) Crea un nuovo evento 1) Elenca eventi 2) Acquista biglietto 3) Cancella biglietto da evento");
    }
         

    public static void main(String[] args) throws Exception {

        try (Scanner input = new Scanner(System.in)) {
            
            Biglietteria biglietteria = new Biglietteria();

            while(true){

                menu();
    
                System.out.print("\n Operazione: ");
                int operazione = input.nextInt();
                
                // Nuovo evento
                if (operazione == 0){

                    System.out.println("\n Nuovo evento: ");

                    System.out.print("\n Descrizione: ");
                    String descrizione = input.next();
            
                    System.out.print("\n Luogo: ");
                    String luogo = input.next();
            
                    System.out.print("\n Data: ");
                    String data = input.next();

                    String anno = data.split("/")[2];
                    String mese = data.split("/")[1];
                    String giorno = data.split("/")[0];
            
                    LocalDate date = LocalDate.of(Integer.parseInt(anno), Integer.parseInt(mese), Integer.parseInt(giorno));
                

                    biglietteria.addEvento(descrizione, luogo, date);

                }

                //Elenco eventi
                if (operazione == 1){
                    biglietteria.OrdinaGliEventiPerData();
                    biglietteria.StampaTuttiGliEventi();
                }

                // Acquista BIglietto 
                if (operazione == 2){
                    
                    System.out.println("\n Prenotazione biglietto");

                    System.out.print("\n Nome evento: ");
                    String nomeEvento = input.next();

                    System.out.print("\n Nome: ");
                    String nome = input.next();

                    System.out.println("Il tuo biglietto: " + biglietteria.AddPrenotazione(nomeEvento, nome));

                   
                }
            
                // Elimina biglietto
                if (operazione == 3){

                    
            }
        }
        
        
    }
}

}
