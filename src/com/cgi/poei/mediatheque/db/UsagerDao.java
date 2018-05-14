package com.cgi.poei.mediatheque.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.cgi.poei.mediatheque.Usager;

public class UsagerDao {

	private static final String LOGIN = "david";
	private static final String PASSWORD = "david";
	private static final String DATABASE_CONNECTION_URL = "jdbc:mysql://10.0.3.198:3306/mediatheque?serverTimezone=GMT";
	
	public UsagerDao() throws SQLException {
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	}
	
	public void inscrire(Usager usager) throws SQLException {
		String sql = "insert into Usager (code, nom, prenom, dateNaissance) values (?, ?, ?, ?)";
		try (Connection connection = DriverManager.getConnection(DATABASE_CONNECTION_URL, LOGIN, PASSWORD);
				PreparedStatement statement = connection.prepareStatement(sql);) {
			statement.setString(1, usager.getCode());
			statement.setString(2, usager.getNom());
			statement.setString(3, usager.getPrenom());
			Date dateNaissance = usager.getDateNaissance() != null ? Date.valueOf(usager.getDateNaissance()): null;
			statement.setDate(4, dateNaissance);
			statement.executeUpdate();
		}
	}

	public List<Usager> getUsagers() throws SQLException {
		List<Usager> usagers = new ArrayList<>();
		try(Connection connection = DriverManager.getConnection(DATABASE_CONNECTION_URL, LOGIN, PASSWORD);
			Statement stmt = connection.createStatement()) {
			
			try(ResultSet resultSet = stmt.executeQuery("select code, nom, prenom, dateNaissance from Usager")) {
				while(resultSet.next()) {
					String code = resultSet.getString("code");
					String nom = resultSet.getString("nom");
					String prenom = resultSet.getString("prenom");
					Date dateNaissance = resultSet.getDate("dateNaissance");
					
					Usager usager = new Usager(code, prenom, nom, dateNaissance);
					usagers.add(usager);
				}
			}
		}	
		return usagers;
	}

	public List<Usager> getUsagers(int ageMin) throws SQLException {
		LocalDate dateNaissanceParametre = LocalDate.now();
		dateNaissanceParametre = dateNaissanceParametre.minusYears(ageMin);

		List<Usager> usagers = new ArrayList<>();
		try(Connection connection = DriverManager.getConnection(DATABASE_CONNECTION_URL, LOGIN, PASSWORD);
			PreparedStatement stmt = connection.prepareStatement("select code, prenom, nom, dateNaissance from Usager where dateNaissance <= ?")) {
			stmt.setDate(1, Date.valueOf(dateNaissanceParametre));
			try(ResultSet resultSet = stmt.executeQuery()) {
				while(resultSet.next()) {
					String code = resultSet.getString("code");
					String nom = resultSet.getString("nom");
					String prenom = resultSet.getString("prenom");
					Date dateNaissance = resultSet.getDate("dateNaissance");
					
					Usager usager = new Usager(code, prenom, nom, dateNaissance);
					usagers.add(usager);
				}
			}
		}
		return usagers;
	}

}
