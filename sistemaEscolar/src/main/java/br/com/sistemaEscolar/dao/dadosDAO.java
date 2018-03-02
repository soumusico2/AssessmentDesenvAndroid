package br.com.sistemaEscolar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sistemaEscolar.model.ContaModel;

public class dadosDAO {
	
	Connection conexao = ConnectionFactory.getConexao();
	PreparedStatement stmt = null;
	
	public void Inserir(ContaModel conta) throws SQLException {
		
		try {
			String sql = "INSERT INTO contas(descricao) values (?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, conta.getDescricao());
			stmt.execute();
			stmt.close();
			conexao.close();
		}catch(SQLException x) {
			System.out.println("Erro: " +x.getMessage());
		}
	}
	
	public List<ContaModel>listar(){
		Connection conexao = ConnectionFactory.getConexao();
		ContaModel conta = new ContaModel();
		List<ContaModel> contas = new ArrayList<ContaModel>();
		try {
			String sql = "SELECT * FROM conta";
			stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				conta.setDescricao(rs.getString("descricao"));
				contas.add(conta);
			}
			}catch(SQLException x) {
				System.out.println("Erro: " +x);
			}
		return contas;
	}
}
