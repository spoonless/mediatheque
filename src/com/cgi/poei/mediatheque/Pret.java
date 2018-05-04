package com.cgi.poei.mediatheque;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Pret {
	
	private final Exemplaire exemplaire;
	private final Usager usager;
	private final LocalDate dateEmprunt;
	private final LocalDate dateRetour;
	
    public Pret(Exemplaire exemplaire, Usager usager) {
        this.exemplaire = exemplaire;
        this.usager = usager;
        this.dateEmprunt = LocalDate.now();
        // TODO parler du 14
        this.dateRetour = this.dateEmprunt.plus(14, ChronoUnit.DAYS);
    }
    
    public boolean isDepasse() {
    	return this.dateRetour.isBefore(LocalDate.now());
    }

    @Override
	public String toString() {
    	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM YYYY");
		return usager.getNomComplet() + " emprunte " + 
			   exemplaire.getDocument().getTitre() + 
			   " jusqu'au " + dateTimeFormatter.format(dateRetour);
	}

	
}
