<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="caelum"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar Contatos</title>
</head>
<body>
	<c:import url="cabecalho.jsp" />
		
		Formulário para alteração de contatos:
		<!--  NAO FUNCIONAL AINDA  -->
		<br />
			<form action="mvc" method="post">
				Id:<input type="text" name="id" value="${param.id}" readonly="readonly"/><br/> 
				Nome:<input type="text" name="nome" value="${contato.nome}" /><br />
				E-mail:<input type="text" name="email" value="${contato.email}"/><br /> 
				Endereço:<input type="text" name="endereco" value="${contato.endereco}" /><br />
				Data de Nascimento: <input type="text" name="dataNascimento" value="${param.data}" /><br />
				Rg: <input type="text" name="rg" value="${encontrado.rg}" />
				
				<!-- button enviar -->
				<br>
				<br>
				<input type="hidden" name="logica" value="AlteraContatoLogic"/>
				<input type="submit" value="Enviar" />
				
				<!-- button Voltar -->
				<input type="button" onclick="window.location.href='mvc?logica=ListaContatosLogic'" value="Voltar" />
			</form>
	<c:import url="rodape.jsp" />
</body>
</html>