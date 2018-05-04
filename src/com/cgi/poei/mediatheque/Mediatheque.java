package com.cgi.poei.mediatheque;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;

public class Mediatheque {
	
	private final ArrayList<Document> documents = new ArrayList<>();
	private final ArrayList<Usager> usagers = new ArrayList<>();

	public ArrayList<Document> getDocuments() {
		return documents;
	}
	
	public ArrayList<Usager> getUsagers() {
		return usagers;
	}
	
	public static void main(String[] args) {
		Usager usager = new Usager("MBJ5555", "David", "Gayerie", LocalDate.of(1973, Month.OCTOBER, 15));
		Livre livre = new Livre("978-2-7117-8644-2", "Design Patterns", 
								"Erich Gamma & al.", "Vuiber", Year.of(2007));
		
		Exemplaire exemplaire = new Exemplaire(livre);
		System.out.println("Nombre d'exemplaires du document " + livre.getExemplaires().size());
		
		usager.emprunter(exemplaire);
		System.out.println(usager.getHistoriquePrets().get(0));
	}
}
