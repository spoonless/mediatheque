package com.cgi.poei.mediatheque;

import java.util.Date;

public class Revue extends Document {

	private String issn;

	public Revue(String issn, String titre, String editeur, Date dateEdition) {
		super(titre, editeur, dateEdition);
		this.issn = issn;
	}


	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	@Override
	public String getIdentifiant() {
		return issn;
	}

}
