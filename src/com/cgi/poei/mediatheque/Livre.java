package com.cgi.poei.mediatheque;

import java.util.Date;

public class Livre extends Document {
	
	private String isbn;
	private String auteur;

	public Livre(String isbn, String titre, String auteur, String editeur, Date dateEdition) {
		super(titre, editeur, dateEdition);
		this.isbn = isbn;
		this.auteur = auteur;
	}

	@Override
	public String getIdentifiant() {
		return isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

}
