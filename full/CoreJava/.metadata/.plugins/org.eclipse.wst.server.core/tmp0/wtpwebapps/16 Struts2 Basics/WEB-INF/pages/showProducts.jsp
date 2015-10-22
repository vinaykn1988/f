<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products Data</title>

<script type="text/javascript" src="jquery/jquery-1.11.3.js"> </script>

<script type="text/javascript" src="jquery/jquery.tablesorter.js"> </script>

<script type="text/javascript">

$(function(){
	$("table").tablesorter(); 
});
</script>

<style type="text/css">
	table {
		border-spacing: 0px;
	}
	
	td,th {
		padding: 5px;
		border: 1px solid blue;
	}
	
	th {
		background-color: blue;
		color:white;
		cursor:pointer;
	}

</style>
</head>
<body>
<h1>Products Data</h1>
<c:if test="${param.minPrice!=null}">
<h2>Products priced between $${param.minPrice} and $${param.maxPrice}</h2>
</c:if>

<table>
	<thead>
		<tr>
			<th>Product name</th>
			<th>Category</th>
			<th>Supplier</th>
			<th>Quantity per unit</th>
			<th>Unit price</th>
			<th>Units in stock</th>
			<th>Discontinued?</th>		
		</tr>
	</thead>
	
	<tbody>
	<c:forEach items="${products}" var="p">
	<tr>
	
		<td>${p.productName}</td>
		<td>${p.category.categoryName}</td>
		<td>${p.supplier.companyName}</td>
		<td>${p.quantityPerUnit}</td>
		<td>${p.unitPrice}</td>
		<td>${p.unitsInStock}</td>
		<td>${p.discontinued==1?"Yes":"No"}</td>
	</tr>
	</c:forEach>
	</tbody>		
</table>
</body>
</html>