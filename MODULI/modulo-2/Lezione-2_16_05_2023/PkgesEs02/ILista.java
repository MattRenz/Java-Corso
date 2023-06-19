package PkgesEs02;


public interface ILista{

	public int length();  // torna lunghezza della lista

	public void push_front(int val); // inserisce elemento in testa alla lista

	public int pop_front() throws Exception; // torna il valore del primo elemento della lista e lo toglie dalla lista

	public boolean empty(); // torna true se la lista Ã¨ vuota

	public void stampa();

}
