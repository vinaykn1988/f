<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Structs2 Advanced</title>

<style type="text/css">

	input{
		padding: 5px;
	}

</style>

</head>
<body>
<h1>Struts2 Example</h1>
<form action="hello">
<input type="text" name="name" placeholder="what's your name?" /> <br /> <br />
<input type="text" name="city" placeholder="where are you from?" /> <br /> <br />
<button>Submit</button>
</form>

<span class="err">${errMessage}</span>

<br />

<a href="priceForm">Find products between a price range

</a>

<br />

<a href="getAllProducts">Show all the products

</a>

</body>
</html>