package com.cgi.poei.mediatheque;

public class QuotaEmpruntDepasseException extends MediathequeException {

	private static final long serialVersionUID = 1L;
	
	public QuotaEmpruntDepasseException(String message) {
		super(message);
	}

}
