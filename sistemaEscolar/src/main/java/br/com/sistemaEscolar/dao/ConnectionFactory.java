package br.com.sistemaEscolar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	static String url = "jdbc:mysql://localhost:8080/banco";
	static String user = "root";
	static String password = "";
	static Connection con = null;
	
	public static Connection getConexao() {
		
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Conexão realizada com sucesso!");
		}catch(SQLException x) {
			System.out.println("Erro: " +x.getMessage());
		}
		return con;
	}
}
