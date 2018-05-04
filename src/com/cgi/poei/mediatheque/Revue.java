package com.cgi.poei.mediatheque;

public class Revue extends Document {
	private String issn;

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
