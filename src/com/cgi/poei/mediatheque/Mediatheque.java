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

		try {
			Usager usager = new Usager("MBJ5555", "David", "Gayerie", LocalDate.of(1973, Month.OCTOBER, 15));
			Livre livre = new Livre("978-2-7117-8644-2", "Design Patterns", "Erich Gamma & al.", "Vuiber",
					Year.of(2007));
			
			Film film1 = new Film("213123332", "Princess Bride", "Rob Reiner", "20th Century Fox", Year.of(1987));
			Film film2 = new Film("213123332", "Princess Bride 2", "Rob Reiner", "20th Century Fox", Year.of(1993));
			Film film3 = new Film("213123332", "Princess Bride 3", "Rob Reiner", "20th Century Fox", Year.of(1999));
			
			System.out.println("Nombre de films : " + Film.getNbFilms());

			Exemplaire exemplaire = new Exemplaire("12346789", film1);
			Exemplaire exemplaire1 = new Exemplaire("22346789", film2);
			Exemplaire exemplaire2 = new Exemplaire("32346789", film3);
			Exemplaire exemplaire3 = new Exemplaire("42346789", film3);

			usager.emprunter(new Pret(exemplaire, usager, 14));
			usager.emprunter(new Pret(exemplaire1, usager, 14));
			usager.emprunter(new Pret(exemplaire2, usager, 14));
			usager.emprunter(new Pret(exemplaire3, usager, 14));

			System.out.println(usager.getPrets().get(0));
		} catch (MediathequeException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}	
	}
}
