package com.cgi.poei.mediatheque;

import java.util.Date;

public class Film extends Document {

	private String realisateur;
	private String isbn;
	
	public Film(String isbn, String titre, String realisateur, String editeur, Date dateEdition) {
		super(titre, editeur, dateEdition);
		this.isbn = isbn;
		this.realisateur = realisateur;
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
	
}
