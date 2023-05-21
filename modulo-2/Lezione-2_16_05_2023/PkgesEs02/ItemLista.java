package PkgesEs02;

public class ItemLista {
	public int value;
	public ItemLista next;

	public ItemLista(int value) {
		this.value = value;
		this.next = null;
	}

	public ItemLista(int value, ItemLista item) {
		this.value = value;
		this.next = item;
	}

}
