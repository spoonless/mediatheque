package com.cgi.poei.mediatheque;

public class Livre extends Document {
	
	private String isbn;
	private String auteur;

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
