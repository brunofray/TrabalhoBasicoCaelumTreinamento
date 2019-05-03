package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

public class RemoveContatoLogic implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		//Durante sua execução receberemos um id pelo request e removeremos o contato a partir deste id
		
		long id = Long.parseLong(req.getParameter("id"));
		
		Contato contato = new Contato();
		contato.setId(id);
		
		Connection con = (Connection) req.getAttribute("connection");
		ContatoDao dao = new ContatoDao(con);
		dao.remove(contato);
		
		System.out.println("Excluindo contato... ");
		
		return "mvc?logica=ListaContatosLogic";
	}

}
