<%@page import="com.brillio.training.entity.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.brillio.training.dao.DaoFactory"%>
<%@page import="com.brillio.training.dao.ProductDao"%>

<%@ page contentType="text/html; charset=ISO-8859-1"%>

<%--@ page language="java" contentType="application/vnd.excel"
    pageEncoding="ISO-8859-1"--%>

<%--
	response.addHeader("Content-Disposition",
			"attachment;filename=products.xls");

--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products Data</title>
<script type="text/javascript" src="jquery/jquery-1.11.3.js"> </script>
<script type="text/javascript" src="jquery/jquery.tablesorter.js"> </script>
<script type="text/javascript">
$(function(){
	$("table").tablesorter(); 
	$("table thead tr").addClass("header");
//	$("table tbody tr:even").addClass("even");
//	$("table tbody tr:odd").addClass("odd");
	
});

</script>

<style type="text/css">

.header{
	background-color: #000;
	color: #fff;
	font-weight: bolder;
	cursor: pointer;
}

.even{

	background-color: #ccc;
}

.odd{

	
}

</style>


</head>
<body>

	<%
		String input = request.getParameter("min_price");
		if (input == null) {
			// redirect the user to "index.html"
			// A.K.A. client side redirection
			response.sendRedirect("index.html");
			return;
		}

		double min = Double.parseDouble(input);

		input = request.getParameter("max_price");
		if (input == null) {
			// redirect the user to "index.html"
			// A.K.A. client side redirection
			response.sendRedirect("index.html");
			return;
		}
		double max = Double.parseDouble(input);

		ProductDao dao = DaoFactory.getProductDao();
		List<Product> list = dao.getProductsByPriceRange(min, max);
	%>

	<h1>Product Data</h1>
	<hr />

	<p>
		There are
		<%=list.size()%>
		products in the price range of $<%=min%>
		and $<%=max%></p>
	<table border="1" >
	<thead>
		<tr>

			<th>Product name</th>
			<th>Quantity per unit</th>
			<th>Unit price</th>
			<th>Units in stock</th>
			<th>Discontinued?</th>
		</tr>
	</thead>
	<tbody>
		<%
			for (Product p : list) {
		%>

		
		<tr>
			<td><%=p.getProductName()%></td>
			<td><%=p.getQuantityPerUnit()%></td>
			<td><%=p.getUnitPrice()%></td>
			<td><%=p.getUnitsInStock()%></td>
			<td><%=p.getDiscontinued() == 1 ? "Yes" : "No"%></td>

			<%
				}
			%>
		</tbody>
	</table>
	<p>
		<a href="./">Try again</a>
	</p>
</body>
</html>