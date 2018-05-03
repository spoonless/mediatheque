package com.cgi.poei.mediatheque;

import java.util.Date;

public class Usager {

	private String id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private Pret[] historiquePrets;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public long getAge() {
		int anneeNaissance = dateNaissance.getYear();
		int anneeCourante = new Date().getYear();
		return anneeCourante - anneeNaissance;
	}

}
