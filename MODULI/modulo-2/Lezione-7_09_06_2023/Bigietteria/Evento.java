import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;


class Prenotazione {
	public String nome;
	public int id;

	public Prenotazione(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}


 @Override
	public String toString(){
		return String.format("Nome: %s, Id: %d", nome, id);
	}
		
}


// numero evento unico per evento

public class Evento {
	String descrizione;
	String luogo;
	LocalDate data;
	int numeroUico;
 
	List<Prenotazione> prenotazioni; 

	public Evento(String descrizione, String luogo, LocalDate dataevento) {
		this.descrizione = descrizione;
		this.luogo = luogo;
		this.data = dataevento;
		prenotazioni = new LinkedList<>();
		numeroUico = 0;
	}




	// torna l'id (intero) delle prenotazione
	
	public int Prenota(String nome) {

		int id = numeroUico;
		numeroUico = numeroUico+1; 

		Prenotazione p = new Prenotazione(nome, id);

		prenotazioni.add(p);

		return id;
	}

	
	public void EliminaPrenotazione(int idPrenotazione) {

			// devo cercare nella lista delle prenotazioni l'oggetto che contiene id pari a idPrenotazione ed eliminarlo
	
			for (Prenotazione x : prenotazioni){

				if (x.id == idPrenotazione){
					prenotazioni.remove(x);
					break;
				}
	
			}
	}

 @Override
	public String toString(){
		 return String.format("%s, %s, %s \n \t %s\n", descrizione, luogo, data, prenotazioni.toString());
	}

	public LocalDate getDate(){
		return data;

	}
}

	


