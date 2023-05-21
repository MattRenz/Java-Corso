package PkgesEs01;


public class Lista {
	// int valore; // l'informazione
	String valore;

	// byte numero;
	// long numerone;
	Lista next;

	// Aggiungo
	// int[] vint;

	public int length() {
		int len = 0;
		Lista p = next;
		while (p != null) {
			len++;
			p = p.next;
		}
		return len;
	}
}

// Quanto Ã¨ grande (quanti byte occupa) un oggetto di tipo Lista?
// Lista obj = new Lista(); 17 byte!!!
// E dopo aver aggiunto il vettore???
// 17+4