package com.cgi.poei.mediatheque;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cgi.poei.mediatheque.document.Film;
import com.cgi.poei.mediatheque.exception.PasAssezAgeException;
import com.cgi.poei.mediatheque.exception.QuotaEmpruntDepasseException;
import com.cgi.poei.mediatheque.exception.QuotaEmpruntFilmDepasseException;

public class Usager implements Emprunteur {

	private final String id;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private List<Pret> prets = new ArrayList<>();

	public Usager(String id, String prenom, String nom) {
		this(id, prenom, nom, null);
	}

	public Usager(String id, String prenom, String nom, LocalDate dateNaissance) {
		if (id == null) {
			throw new IllegalArgumentException("L'id ne peut pas être nul");
		}
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}

	public String getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	@Override
	public void emprunter(Pret pret) throws QuotaEmpruntDepasseException, PasAssezAgeException {
		Section section = pret.getExemplaire().getDocument().getSection();
		if (! section.isAssezAge(this)) {
			throw new PasAssezAgeException(section.getAgeMinimum());
		}
		if (Pret.isQuotaDepasse(this.prets.size())) {
			throw new QuotaEmpruntDepasseException("Prêt de " + prets.size() + " exemplaires atteint");
		}
		verifierQuotaFilmDepasse(pret);
		prets.add(pret);
	}
	
	/*
	 * TODO implémenter la méthode retourner
	public Pret retourner(String codeExemplaire) throws PasEmprunteException {
		pour chaque prêt de la liste
			est-ce que l'exemplaire du prêt a comme code codeExemplaire
	
		enlever l'élément de la liste
		retourner l'élément supprimé
		
	}
	 */

	private void verifierQuotaFilmDepasse(Pret pret) throws QuotaEmpruntFilmDepasseException {
		if (pret.getExemplaire().getDocument() instanceof Film && getNbFilmsEmpruntes() == Film.NB_PRETS_FILMS_AUTORISES) {
			throw new QuotaEmpruntFilmDepasseException();
		}
	}

	private int getNbFilmsEmpruntes() {
		int nbFilmsEmpruntes = 0;
		for (Pret p : prets) {
			if (p.getExemplaire().getDocument() instanceof Film) {
				nbFilmsEmpruntes++;
			}
		}
		return nbFilmsEmpruntes;
	}

	public Integer getAge() {
		if (dateNaissance != null) {
			Period periode = Period.between(dateNaissance, LocalDate.now());
			return periode.getYears();
		}
		return null;
	}

	public List<Pret> getPrets() {
		return Collections.unmodifiableList(prets);
	}

	public String getNomComplet() {
		return this.prenom + " " + this.nom;
	}

}
