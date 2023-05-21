/*
Verificare che il numero di parametri passati dall'utente sia uguale a 2, se diverso uscire con messaggio
di errore, se pari a due convertirli in numeri e stampare il prodotto
 */

public class Es01 {
    public static void main(String[] argomenti) {
    
        if (argomenti.length != 2){
            System.out.println("Devono essere due argomenti");
        } else {

            int num1;
            int num2;
            
            num1 = Integer.parseInt(argomenti[0]);
            num2 = Integer.parseInt(argomenti[1]);

            int prodotto = num1 * num2;
            System.out.println(prodotto);
            
        }


    }
}
