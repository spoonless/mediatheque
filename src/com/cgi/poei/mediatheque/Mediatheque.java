package com.cgi.poei.mediatheque;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Mediatheque {

	private final List<Document> documents = new ArrayList<>();
	private final List<Usager> usagers = new ArrayList<>();

	public List<Document> getDocuments() {
		return documents;
	}

	public List<Usager> getUsagers() {
		return usagers;
	}

	public static void main(String[] args) {

		try {
			Emprunteur emprunteur = new Usager("MBJ5555", "David", "Gayerie", LocalDate.of(2015, Month.OCTOBER, 15));
			Livre livre = new Livre("978-2-7117-8644-2", "Design Patterns", "Erich Gamma & al.", "Vuiber",
					Year.of(2007));
			
			Film film1 = new Film("213123332", "Princess Bride", "Rob Reiner", "20th Century Fox", Year.of(1987));
			
			System.out.println("Nombre de films : " + Film.getNbFilms());

			Exemplaire exemplaire = new Exemplaire("12346789", film1);
			exemplaire.setNotificateurDeRetourDePret(new SimpleNotificateur());

			emprunteur.emprunter(new Pret(exemplaire, emprunteur, 14));

			System.out.println(emprunteur.getPrets().get(0));
			
		} catch (MediathequeException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
