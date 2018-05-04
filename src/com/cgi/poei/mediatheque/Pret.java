package com.cgi.poei.mediatheque;

import java.util.Date;

public class Pret {
	
	private Exemplaire exemplaire;
	private Usager usager;
	private Date dateEmprunt;
	
	// TODO faire évoluer le code : dateRetour = dateEmprunt + 2 semaines.
	private Date dateRetour;
	
    public Pret(Exemplaire exemplaire, Usager usager) {
        this.exemplaire = exemplaire;
        this.usager = usager;
        this.dateEmprunt = new Date();
        this.dateRetour = new Date(dateEmprunt.getYear(), dateEmprunt.getMonth(), dateEmprunt.getDay() + 14);
    }

	
	public String toString() {
		return usager.getNomComplet() + " emprunte " + exemplaire.getDocument().getTitre() + " jusqu'à " + dateRetour;
	}

	
}
