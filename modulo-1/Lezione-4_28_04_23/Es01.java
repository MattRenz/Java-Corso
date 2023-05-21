public class Es01 {
	static public void main(String[] args)  {
		/*
		 * Leggere una sequenza di numeri, uno per riga, dal terminale
		 * e, quando sarÃ  digitata una riga vuota, stampare la somma dei numeri letti
		 * 
		 * sommare i numeri preenti nel file numeri.txt
		 */

		// devo calcolare la somma dei numeri digitati
		int somma = 0;	

		while (true){
			String num = System.console().readLine();

			if (num.length() == 0){
				System.out.println(somma);
				break;
			} else {
				somma += Integer.parseInt(num);
			}
		}
	}	
}


