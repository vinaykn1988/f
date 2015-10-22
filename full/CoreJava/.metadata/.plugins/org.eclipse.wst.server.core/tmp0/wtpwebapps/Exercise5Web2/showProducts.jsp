<%@page import="com.brillio.training.entity.Product"%>
<%@page import="java.util.List"%>
<%@ include file="header.txt" %>


<table class="tablesorter">
	<thead>
		<tr>
			<th class="header">Product Name</th>
			<th class="header">Quantity Per Unit</th>
			<th class="header">Unit Price</th>
			<th class="header">Units In Stock</th>
			<th class="header">Discontinued?</th>
		</tr>
	</thead>
	<tbody>
	<%-- loop through the products and print a row for each --%>
	<%
		@SuppressWarnings("unchecked")
		List<Product> list = 
			(List<Product>)request.getAttribute("products");
			
		for(Product p: list){
	%>
	<tr>
		<td><%=p.getProductName()%></td>
		<td><%=p.getQuantityPerUnit()%></td>
		<td><%=p.getUnitPrice()%></td>
		<td><%=p.getUnitsInStock()%></td>
		<td><%=p.getDiscontinued()==1?"Yes":"No"%></td>
	</tr>
	<%
		}
	%>
	</tbody>
</table>


<%@ include file="footer.txt" %>









