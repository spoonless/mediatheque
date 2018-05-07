package com.cgi.poei.mediatheque;

import java.time.Year;

public class Film extends Document {

	public static final int NB_PRETS_FILMS_AUTORISES = 3;
	private static int nbFilms;
	
	private String realisateur;
	private String isbn;
	
	public Film(String isbn, String titre, String realisateur, String editeur, Year anneeEdition) {
		super(titre, editeur, anneeEdition);
		this.isbn = isbn;
		this.realisateur = realisateur;
		Film.nbFilms++;
	}

	public String getRealisateur() {
		return realisateur;
	}
	
	public String getDistributeur() {
		return getEditeur();
	}

	@Override
	public String getIdentifiant() {
		return getIsbn();
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public static int getNbFilms() {
		return nbFilms;
	}
}
