package PkgesEs02;

public class Lista implements ILista {

	ItemLista lista;

	public Lista() {
		lista = null;
	}

 @Override
	public int length() {

		int len = 0;

		ItemLista tmp = lista;
		
		while (tmp != null){
			len++;
			tmp = tmp.next;
		}

		return len;
	
	}

 @Override
	public void push_front(int val) {

		ItemLista items = new ItemLista(val);

		items.next = lista;
		lista = items;

	}

 @Override
	public int pop_front() throws Exception{

		if (lista != null){
			int primo = lista.value;

			lista = lista.next;
	
			return primo;
		} else {
			throw new Exception("Lista vuota");
		}
	}
	
 @Override
	public boolean empty() {

		return lista == null;
	}

 @Override
	public void stampa() {

		ItemLista tmp = lista;
		
		while (tmp != null){
			System.out.print(tmp.value + " ");
			tmp = tmp.next;
		}

		System.out.println();
	}

}