package com.cgi.poei.mediatheque;

public class Exemplaire {

	private final String code;
	private final Document document;
	private Pret pret;
	
	public Exemplaire(String code, Document document) {
		this.code = code;
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
	
	public String getCode() {
		return code;
	}

	public void setPret(Pret pret) throws ExemplaireDejaEmprunteException {
		if (isEmprunte()) {
			throw new ExemplaireDejaEmprunteException(this);
		}
		this.pret = pret;
	}
	
}
