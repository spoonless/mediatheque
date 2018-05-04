package com.cgi.poei.mediatheque;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Usager {

	private String id;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private ArrayList<Pret> historiquePrets = new ArrayList<>();
	
	public Usager(String id, String prenom, String nom) {
		this(id, prenom, nom, null);
	}

	public Usager(String id, String prenom, String nom, LocalDate dateNaissance) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

    public void emprunter(Pret pret) {
		historiquePrets.add(pret);
    }

    public Integer getAge() {
    	if (dateNaissance != null) {
    		Period periode = Period.between(dateNaissance, LocalDate.now());
			return periode.getYears();
    	}
    	return null;
	}
    
    public ArrayList<Pret> getHistoriquePrets() {
		return historiquePrets;
	}

	public String getNomComplet() {
		return this.prenom + " " + this.nom;
	}

}
