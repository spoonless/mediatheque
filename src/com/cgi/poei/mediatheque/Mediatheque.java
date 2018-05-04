package com.cgi.poei.mediatheque;

import java.util.Date;

public class Mediatheque {
	
	private Document[] documents;
	private Usager[] usagers;

	public static void main(String[] args) {
		Usager usager = new Usager("MBJ5555", "David", "Gayerie", new Date(73, 10, 15));
		Livre livre = new Livre("978-2-7117-8644-2", "Design Patterns", 
								"Erich Gamma & al.", "Vuiber", new Date(107, 1,1));
		
		Livre livre2 = new Livre("978-2-7117-8644-2", "Design Patterns", 
				"Erich Gamma & al.", "Vuiber", new Date(107, 1,1));
		
		System.out.println(livre.equals(livre2));
		
		Exemplaire exemplaire = new Exemplaire(livre);
		usager.emprunter(exemplaire);
		System.out.println(usager.getHistoriquePrets().get(0));
	}
}
