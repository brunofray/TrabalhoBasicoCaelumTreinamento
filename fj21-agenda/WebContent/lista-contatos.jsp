<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!--  cria o DAO -->
<jsp:useBean id= "dao" class="br.com.caelum.agenda.dao.ContatoDao"/>

<table border="1">
	<!-- percorre contatos montando as linhas da tabela -->
	<tr>
		<th>Nome</th>
		<th>Email</th>
		<th>Endereco</th>
		<th>Data de nascimento</th>
	</tr>
	<c:forEach var="contato" items="${dao.lista}">
		<tr bgcolor="#${id.count % 2 == 0 ? 'aaee88' : 'ffffff' }">
			<td> ${contato.nome}</td>
			<td> ${contato.email}</td>
			<td> ${contato.endereco}</td>
			<td> ${contato.dataNascimento.time}</td>
		</tr>
	</c:forEach>
</table>
