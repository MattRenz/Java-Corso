import java.util.*;

public class CMenu<T extends Enum<T>> {
	private Map<String, T> map = null;
	private Scanner reader = null;

	CMenu(T[] elenco) {
		// Inizializza il reader
		reader = new Scanner(System.in);

		map = new TreeMap<>();
		// per ogni vodce della enum, la converto in stringa

		for (T v : elenco) {
			String[] vs = v.toString().split("_");
			// Toglie la E_

			String s = "";
			for (int i = 1; i < vs.length; i++) {
				if (i == 1) {
					s = vs[i].substring(0, 1).toUpperCase() +
							vs[i].substring(1).toLowerCase();
				} else {
					s = s + " " + vs[i].toLowerCase();
				}
			}
			map.put(s, v);
		}
	}

	public T run() {
		int code = 1;
		System.out.println("Selezionare una delle voci del menu\n");
		for (String k : map.keySet()) {
			System.out.println(String.format("%02d) %s", code++, k));
		}
		System.out.print("\nScelta: ");
		code = reader.nextInt();
		return (T) map.values().toArray()[code - 1];
	}
}
