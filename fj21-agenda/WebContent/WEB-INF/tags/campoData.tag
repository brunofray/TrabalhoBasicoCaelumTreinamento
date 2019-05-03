<%@ attribute name="id" required="true" %>
<%@ attribute name="data" required="false"%>

<input id="${id}" name="${id}" value="${data}" />

<script>
	$("#${id}").datepicker({dateFormat: 'dd/mm/yy'});
</script>