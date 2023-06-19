import java.util.Arrays;

public class Es04 {

    static int LunghezzaStr(String str){
        
        return str.length();
    }

    static void ContieneStr(String str1, String str2){ 
        if (str1.contains(str2)){
            System.out.println("La stringa 1 contiene la stringa 2");
        } else {
            System.out.println("La stringa 1 non contiene la stringa 2");
        }
    }

    static void TrovaNumeri(String str){

        int[] num = new int[str.length()];

        String parole[] = str.split(" ");
        
        for(int i = 0; i < parole.length; i++){
            
            if (parole[i] != null && parole[i].matches("[0-9]+")){
                num[i] = Integer.parseInt(parole[i]);
            } 
        }
        
        for (int i : num){
            
            if (i == 0){
                continue;
            }
            System.out.println(i);
        }
    
    }

    static void SequenzaDiParole(String str){

        int contaSequenza = 0;

        String parole[] = str.split(" ");
        
        Arrays.sort(parole);
        
        for (int i = 1; i < parole.length; i++){

            if (parole[i].equals(parole[i -1])){
                contaSequenza++;
            } else {
                System.out.println(parole[i-1] + ": " + contaSequenza);
                contaSequenza = 1;
            }

        }

    }

        

        // [10, 12, 45, 55, al, al, al, al, al, due, due, men, tra, uno, uno]
    


	static public void main(String[] args) {
		/*
		 * date due stringhe lette da terminale, s1 e s2, di cui
		 * s1 piÃ¹ lunga di s2
		 * 1) stampare la lunghezza di ogni stringa
		 * 2) stampare se s1 contiene la stringa s2
		 * 3) cercare e stampare tutti i numeri interi presenti nella
		 * stringa s1
		 * 4) convertire la stringa s1 in un vettore (v1) di stringhe, una parola per
		 * elemento del vettore (vi ricordate lo split di python?)
		 * 5) ordinare il vettore v1 in ordine crescente
		 * 6) contare quante sequenze di parole uguali (una immediatamente dopo l'altra)
		 * ci sono in v1
		 * Esempio:
		 * s1="al 12 men 45 tra due 55 al 10 al uno al due al uno"
		 * s2="tra due 55"
		 */

        String s1 = "al 12 men 45 tra due 55 al 10 al uno al due al uno";
        String s2 = "tra due 55";

        // 1)
       System.out.println(LunghezzaStr(s1));
       System.out.println(LunghezzaStr(s2));

       // 2)
       ContieneStr(s1, s2);

       // 3)
       TrovaNumeri(s1);

        // 4)
        String parole1[] = s1.split(" ");
        System.out.println(Arrays.toString(parole1));

        // 5)
        Arrays.sort(parole1);
        System.out.println(Arrays.toString(parole1));

        // 6) 
        SequenzaDiParole(s1);
        


       

	}
}