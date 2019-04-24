package br.com.caelum.agenda.dao;

import java.sql.SQLException;

public class DaoException extends RuntimeException{

	public DaoException(SQLException e) {
	}
	
	// Excessão de pesquisa
	public DaoException(SQLException e, int id) {
		super("Aconteceu um erro! O id " + id + " não existe no banco de dados!");
	}

}
