package com.cgi.poei.mediatheque;

import java.util.Date;

public abstract class Document {

	private Exemplaire[] exemplaires;

	private String titre;
	private String editeur;
	private Date dateEdition;
	
	public abstract String getIdentifiant();

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public Date getDateEdition() {
		return dateEdition;
	}

	public void setDateEdition(Date dateEdition) {
		this.dateEdition = dateEdition;
	}

	public Exemplaire[] getExemplaires() {
		return exemplaires;
	}

	public void setExemplaires(Exemplaire[] exemplaires) {
		this.exemplaires = exemplaires;
	}

}
