package com.cgi.poei.mediatheque;

public class Exemplaire {

	private final Document document;
	
	public Exemplaire(Document document) {
		this.document = document;
		this.document.getExemplaires().add(this);
	}

	public Document getDocument() {
		return document;
	}
	
}
