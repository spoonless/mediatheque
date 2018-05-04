package com.cgi.poei.mediatheque;

public class Film extends Document {

	private String realisateur;
	private String distributeur;
	private String isbn;

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
