package br.com.caelum.mvc.logica;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

public class BuscaContatoLogic implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Connection con = (Connection) req.getAttribute("connection");

		Long id = Long.parseLong(req.getParameter("id"));
		Contato contato = new Contato();
		contato.setId(id);
		
		ContatoDao dao = new ContatoDao(con);
		Contato encontrado = dao.pesquisar(id);
		
		req.setAttribute("contato", encontrado);
		
		return "adiciona-contato.jsp";
	}

}
