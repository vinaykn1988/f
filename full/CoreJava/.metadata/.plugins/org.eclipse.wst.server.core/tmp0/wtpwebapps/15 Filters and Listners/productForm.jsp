<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product data</title>
<style type="text/css">
	input {
		margin: 5px 0;
		padding: 5px;
		border-radius: 5px;
		border: 1px solid #777;
	}
	.err {
		color: red;
	}
	.success {
		color: green;
	}
</style>
</head>
<body>
<h1>Filters and Listeners</h1>
<hr />

<h2>Add a new product</h2>

<form action="addProduct" method="POST" class="form">

<input name="productId" placeholder="Product Id" 
	value="${param.productId}" />
<span class="err">${requestScope.productId}</span><br />

<input name="productName" placeholder="Product Name" 
	value="${param.productName}" />
<span class="err">${requestScope.productName}</span><br />

<input name="quantityPerUnit" placeholder="Quantity Per Unit" 
	value="${param.quantityPerUnit}" />
<span class="err">${requestScope.quantityPerUnit}</span><br />

<input name="unitPrice" placeholder="Unit Price (USD)" 
	value="${param.unitPrice}" />
<span class="err">${requestScope.unitPrice}</span><br />

<input name="unitsInStock" placeholder="Units In Stock" 
	value="${param.unitsInStock}" />
<span class="err">${requestScope.unitsInStock}</span><br />

<input name="reorderLevel" placeholder="Reorder Level" 
	value="${param.reorderLevel}" />
<span class="err">${requestScope.reorderLevel}</span><br />

<input name="unitsOnOrder" placeholder="Units On Order" 
	value="${param.unitsOnOrder}" />
<span class="err">${requestScope.unitsOnOrder}</span><br />

<input type="radio" name="discontinued" value="0" checked> No
<input type="radio" name="discontinued" value="1" ${param.discontinued==1?"checked":""}> Yes
<br />
<input name="categoryId" placeholder="Category Id" 
	value="${param.categoryId}" />
<span class="err">${requestScope.categoryId}</span><br />

<input name="supplierId" placeholder="Supplier Id" 
	value="${param.supplierId}" />
<span class="err">${requestScope.supplierId}</span><br />


<br />
<button>Submit</button>
</form>

<c:choose>
	<c:when test="${param.success==true}">
	<h3 class="success">Product added successfully!</h3>
	</c:when>
	
	<c:when test="${param.success==false}">
	<h3 class="err">Could not add the product</h3>
	</c:when>

</c:choose>

</body>
</html>
