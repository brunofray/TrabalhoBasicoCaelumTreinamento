<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<html>
<body>

<!--  cria o DAO 
<jsp:useBean id= "dao" class="br.com.caelum.agenda.dao.ContatoDao"/>
-->
<c:import url="../cabecalho.jsp" />

<table border="1">
	<!-- percorre contatos montando as linhas da tabela -->
	<tr>
		<th>Alteração</th>
		<th>Nome</th>
		<th>Email</th>
		<th>Endereco</th>
		<th>Data de nascimento</th>
		<th>Rg</th>
		<th>Exclusão</th>
	</tr>
	<c:forEach var="contato" items="${contatos}">
		<tr bgcolor="#${id.count % 2 == 0 ? 'aaee88' : 'ffffff' }">
			<td>
				<a href="mvc?logica=BuscaContatoLogic&id=${contato.id}">Editar</a>
			</td>
			<td> ${contato.nome}</td>
			<!-- link para envio de	e-mail caso	o mesmo	tenha sido informado -->
			<!-- Utilizando uma maneira de SWITCH -->
			<td>
				<c:choose>
						<c:when test="${not empty contato.email }">
							<a href="mailto:${contato.email }">${contato.email }</a>
						</c:when>
					<c:otherwise>
						E-mail não informado
					</c:otherwise>
				</c:choose>
			<!--  #### Utilizando IF ###
			
			 	<c:if test="${not empty contato.email }">
			 		<a href="mailto:${contato.email }">${contato.email }</a>
			 	</c:if>	
			 	
			 	<c:if test="${empty contato.email }">
			 		E-mail não informado
			 	</c:if>
			-->
			</td>
			<td> ${contato.endereco}</td>
			<td>
			<fmt:formatDate value="${contato.dataNascimento.time }"
				pattern="dd/MM/yyyy"/>
			</td>
			
			<td> ${contato.rg}</td>
			<td>
				<a href="mvc?logica=RemoveContatoLogic&id=${contato.id}">Remover</a>
			</td>
		</tr>
	</c:forEach>
</table>

<c:import url="../rodape.jsp" />
</body>
</html>
