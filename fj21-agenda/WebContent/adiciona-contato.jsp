<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="caelum" %>

<html>
		<head>
			<link href="css/jquery.css" rel="stylesheet">
			<script src="js/jquery.js"></script>
			<script src="js/jquery-ui.js"></script>
		</head>
	<body>
	<c:import url="cabecalho.jsp" />
		<h1>Atualiza��o de Contatos</h1>
		<hr />
		<form action="mvc?logica=SalvaContatoLogic" method="POST">
			<c:if test="${not empty contato.id}">
				<input type="hidden" name="id" value="${contato.id}" />
			</c:if>
			
			Nome: <input type="text" name="nome" value="${contato.nome}" /><br/>
			E-mail: <input type="text" name="email" value="${contato.email}"/><br />
			Endere�o: <input type="text" name="endereco" value="${contato.endereco}" /><br />
			<fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy" var="data" />
			Data Nascimento: <caelum:campoData id="dataNascimento" data="${data}" /><br />
			RG: <input type="text" name="rg" value="${contato.rg}" /><br />
					
			<input type="submit" value="Gravar" />
		</form>
		<c:import url="rodape.jsp" />
	</body>
</html>