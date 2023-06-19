import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;




public class Biglietteria {


	// la biglietteria gestisce una lista di eventi
	
	List<Evento> eventi;

	public Biglietteria() {
		eventi = new LinkedList<>();
	}

	public boolean addEvento(String descrizione, String luogo, LocalDate date) {
		
		Evento evento = new Evento(descrizione, luogo, date);
		return eventi.add(evento);
	}

	public int AddPrenotazione(String nomeEvento, String nomePersona){

		for (Evento e: eventi){
			if (e.descrizione.compareTo(nomeEvento) == 0){

				int id = e.Prenota(nomePersona);
				return id;
			}	
	}

		return -1;

	}

	
	public void StampaTuttiGliEventi(){

		if (eventi.size() == 0){
			
			System.out.println("\n Non ci sono eventi in programma");
			
		} else {
			System.out.println(eventi.toString());
		}

	}


	public void OrdinaGliEventiPerData(){
		
		Collections.sort(eventi, Comparator.comparing(Evento::getDate));

	}

}
