<%@page import="com.brillio.training.entity.Product"%>
<%@page import="java.util.List"%>
<%@ include file="header.txt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri= "http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<table border="1">
<thead>
	<tr>
		<th>Product Name</th>
		<th>Quantity Per Unit</th>
		<th>Unit Price</th>
		<th>Units In Stock</th>
		<th>Discontinued?</th>
	</tr>
</thead>

<tbody>

	<c:forEach items="${requestScope.products}" var="p">
		<tr>
			<td>${p["productName"]}</td>
			<td>${p["quantityPerUnit"]}</td>
			<td>${p["unitPrice"]}</td>
			<td>${p["unitsInStock"]}</td>
			<td>${p["discontinued"]}</td>
		</tr>
		</c:forEach>

<%-- loop through the products and print a row for each --%>

<%--
	List<Product> list =
	(List<Product>)request.getAttribute("products");

		for(Product p : list){
		
--%>
<%--     <tr>
    <td><%=p.getProductName()%></td>
    <td><%=p.getQuantityPerUnit()%></td>
    <td><%=p.getUnitPrice()%></td>
    <td><%=p.getUnitsInStock()%></td>
    <td><%=p.getDiscontinued()==1?"Yes":"No"%></td>
	</tr>
	--%>
<%--

		}

--%>

</tbody>

</table>

<%@ include file="footer.txt" %>