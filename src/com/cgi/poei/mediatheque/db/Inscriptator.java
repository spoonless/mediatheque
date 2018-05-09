package com.cgi.poei.mediatheque.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.cgi.poei.mediatheque.Usager;

public class Inscriptator {

	private static final String LOGIN = "david";
	private static final String PASSWORD = "david";
	private static final String DATABASE_CONNECTION_URL = "jdbc:mysql://10.0.3.198:3306/mediatheque?serverTimezone=GMT";
	
	public void inscrire(Usager usager) throws SQLException {
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());

		String sql = "insert into Usager (code, nom, prenom) values (?, ?, ?)";
		try (Connection connection = DriverManager.getConnection(DATABASE_CONNECTION_URL, LOGIN, PASSWORD);
				PreparedStatement statement = connection.prepareStatement(sql);) {
			statement.setString(1, usager.getId());
			statement.setString(2, usager.getNom());
			statement.setString(3, usager.getPrenom());
			statement.executeUpdate();
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Code : ");
		String code = scanner.nextLine();

		System.out.print("Nom : ");
		String nom = scanner.nextLine();

		System.out.print("Prenom : ");
		String prenom = scanner.nextLine();
		
		Usager usager = new Usager(code, prenom, nom);
		
		Inscriptator inscriptator = new Inscriptator();
		try {
			inscriptator.inscrire(usager);
		} catch (SQLException e) {
			System.err.println("Désolé, il y a eu un problème");
			e.printStackTrace();
		}
	}

}
