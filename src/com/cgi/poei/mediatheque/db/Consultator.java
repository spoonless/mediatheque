package com.cgi.poei.mediatheque.db;

import java.sql.SQLException;
import java.util.List;

import com.cgi.poei.mediatheque.Usager;

public class Consultator {

	public static void main(String[] args) throws SQLException {
		UsagerDao usagerDao = new UsagerDao();
		List<Usager> usagers = usagerDao.getUsagers();
		for (Usager usager : usagers) {
			System.out.printf("%s (%d ans)\n", usager.getNomComplet(), usager.getAge());
		}
	}

}
