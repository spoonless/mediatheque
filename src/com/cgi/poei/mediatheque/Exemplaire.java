package com.cgi.poei.mediatheque;

public class Exemplaire {

	private final Document document;
	private Pret pret;
	
	public Exemplaire(Document document) {
		this.document = document;
		this.document.getExemplaires().add(this);
	}
	
	public boolean isEmprunte() {
		return this.getPret() != null;
	}

	public Document getDocument() {
		return document;
	}

	public Pret getPret() {
		return pret;
	}

	public void setPret(Pret pret) throws ExemplaireDejaEmprunteException {
		if (isEmprunte()) {
			throw new ExemplaireDejaEmprunteException(this);
		}
		this.pret = pret;
	}
	
}
