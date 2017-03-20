package it.polito.tdp.libretto.model;

import java.util.*;

public class Model { 
	private List<Esame> esami;
	
	public Model(){ //Costruttore
		this.esami=new ArrayList<Esame>();
	}
	
	/**
	 * Aggiunge un nuovo esame all'elenco degli esami presenti, verificando che non ci sia già
	 * @param e
	 * @return true se l'hai inserito, false se esisteva già e quindi non viene inserito
	 */
	public boolean addEsame(Esame e){
		if(!esami.contains(e)){
			esami.add(e);
			return true;
		}
		else 
			return false;
	}
	
	/**
	 * Ricerca se esiste un esame con il codice specificato. Se esiste lo restituisce, altrimenti restituisce null.
	 * @param codice --> Codice esame da ricercare
	 * @return l'esame trovato, altrimenti null
	 */
	public Esame trovaEsame(String codice){
		int pos=this.esami.indexOf(new Esame(codice, null, null)); //Creo un oggetto dello stesso tipo di quello che sto cercando per far si 
		                                                           //che risponda positivamente ad equals e mi dia la posizione pos
	    if(pos==-1)
	    	return null;
	    else
	    	return esami.get(pos);
	}
}
