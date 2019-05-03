package br.com.caelum.agenda.filtro;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import br.com.caelum.agenda.ConnectionFactory;

// FAZ QUE TODAS AS REQUISIÇÕES PASSEM POR ELE
@WebFilter("/*")
public class FiltroConexao implements Filter {
	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		try {
			// ABRE UMA CONEXAO
			Connection con = new ConnectionFactory().getConnection();
			
			// PENDURA UM OBJETO NO REQUEST
			request.setAttribute("connection", con);
			
			// INDICA QUE O PROCESSAMENTO DO REQUEST DEVE PROSSEGUIR
			chain.doFilter(request, response);
			
			// FECHA CONEXAO
			con.close();
		} catch (SQLException e) {
			throw new ServletException(e);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}