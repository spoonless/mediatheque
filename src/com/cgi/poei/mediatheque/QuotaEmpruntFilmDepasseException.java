package com.cgi.poei.mediatheque;

public class QuotaEmpruntFilmDepasseException extends QuotaEmpruntDepasseException {

	private static final long serialVersionUID = 1L;

	public QuotaEmpruntFilmDepasseException() {
		super("Prêt de " + Film.NB_PRETS_FILMS_AUTORISES + " films atteint");
	}

}
