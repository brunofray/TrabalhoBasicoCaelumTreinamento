package br.com.caelum.mvc.logica;

import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

public class SalvaContatoLogic implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		Contato contato = new Contato(); // CONTATO MONTADO COM OS DADOS DO REQUEST
		String id = req.getParameter("id");
		if(id != null && !id.equals("")) {
			contato.setId(Long.parseLong(req.getParameter("id")));
		}
		
		contato.setNome(req.getParameter("nome"));
		contato.setEmail(req.getParameter("email"));
		contato.setEndereco(req.getParameter("endereco"));
		String dataEmTexto = req.getParameter("dataNascimento");
		Calendar dataNascimento = Calendar.getInstance();
		
		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
			dataNascimento.setTime(date);
			contato.setDataNascimento(dataNascimento);	
		} catch(ParseException e) {
			throw new RuntimeException(e);
		}
		contato.setRg(req.getParameter("rg"));
		
		// BUSCANDO A CONEXAO DO REQUEST
		Connection con = (Connection) req.getAttribute("connection");
		ContatoDao dao = new ContatoDao(con);
		
		if(contato.getId() == null) {
			dao.adiciona(contato);
		} else {
			dao.altera(contato);
		}
		System.out.println("Atualizando o contato...");
		
		return "mvc?logica=ListaContatosLogic";
	}

}
