package com.cgi.poei.mediatheque;

import java.util.List;

public interface Emprunteur {
	
	String getNomComplet();
	
	void emprunter(Pret pret) throws QuotaEmpruntDepasseException, PasAssezAgeException;

	List<Pret> getPrets();
}
