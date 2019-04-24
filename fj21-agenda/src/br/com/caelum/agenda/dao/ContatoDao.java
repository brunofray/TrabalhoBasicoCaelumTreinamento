package br.com.caelum.agenda.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.agenda.ConnectionFactory;
import br.com.caelum.agenda.modelo.Contato;
import br.com.caelum.agenda.dao.DaoException;

public class ContatoDao {
	private Connection connection;

	public ContatoDao() {
		try {
			this.connection = new ConnectionFactory().getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public ContatoDao(Connection connection) {
		this.connection = connection;
	}

	public void adiciona(Contato contato) {
		String sql = "insert into contatos " + 
				"(nome,email,endereco,dataNascimento)" + 
				" values (?,?,?,?)";
		
		try {
			// Utilização do prepared Statement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			// Setando os valores
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
			
			// Execução
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	public List<Contato> getLista() {
		
		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from contatos");

			// FEITO PARA BUSCAR SOMENTE NOMES COM C
			//PreparedStatement stmt = this.connection.prepareStatement("select * from contatos where nome like 'C%'");
			ResultSet rs = stmt.executeQuery();
			
			List<Contato> contatos = new ArrayList<Contato>();
			while(rs.next()) {
				// Criação do objeto contato
				Contato contato = new Contato();
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));
				
				// Montando data através de Calendar
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data);
				
				// Adição do objeto a lista
				contatos.add(contato);	
			}
			rs.close();
			stmt.close();
			return contatos;
		} catch (SQLException e){
			throw new DaoException(e);
		}
	}
	
	public Contato pesquisar(int id) {
		Contato contato = new Contato();
		try {
			PreparedStatement stmt = connection.prepareStatement("select * from contatos where id=?");
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();
			
			
			rs.next();
			contato.setId(rs.getLong("id"));
			contato.setNome(rs.getString("nome"));
			contato.setEndereco(rs.getString("endereco"));
			contato.setEmail(rs.getString("email"));
			
			stmt.execute();
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			throw new DaoException(e, id);
		}
		return contato;	
	}
	
	public void altera(Contato contato) {
		String sql = "update contatos set nome=?, email=?," +
				"endereco=?, dataNascimento=? where id=?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
			stmt.setLong(5, contato.getId());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public void remove(Contato contato) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from contatos where id=?");
			stmt.setLong(1, contato.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new DaoException(e);
		}
	}
}
