package com.cgi.poei.mediatheque;

import java.time.Year;

public abstract class Document {

	private Exemplaire[] exemplaires;

	private String titre;
	private String editeur;
	private Year anneeEdition;
	
	public Document(String titre, String editeur, Year anneeEdition) {
		this.titre = titre;
		this.editeur = editeur;
		this.anneeEdition = anneeEdition;
	}

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

	public Year getAnneeEdition() {
		return anneeEdition;
	}
	
	public void setAnneeEdition(Year anneeEdition) {
		this.anneeEdition = anneeEdition;
	}

	public Exemplaire[] getExemplaires() {
		return exemplaires;
	}

	public void setExemplaires(Exemplaire[] exemplaires) {
		this.exemplaires = exemplaires;
	}

}
