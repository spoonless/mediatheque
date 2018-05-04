package com.cgi.poei.mediatheque;

import java.util.ArrayList;
import java.util.Date;

public class Usager {

	private String id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private ArrayList<Pret> historiquePrets = new ArrayList<>();
	
	public Usager(String id, String prenom, String nom, Date dateNaissance) {
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

    public void emprunter(Exemplaire exemplaire) {
        Pret pret = new Pret(exemplaire, this);
		historiquePrets.add(pret);
    }

    public long getAge() {
		int anneeNaissance = dateNaissance.getYear();
		int anneeCourante = new Date().getYear();
		return anneeCourante - anneeNaissance;
	}
    
    public ArrayList<Pret> getHistoriquePrets() {
		return historiquePrets;
	}

	public String getNomComplet() {
		return this.prenom + " " + this.nom;
	}

}
