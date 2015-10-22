<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products Data</title>
</head>
<body>

<h1>Products Data</h1>

<form action="getProductsByPrice">
<h3>Enter the price range: </h3>

<input type="text" placeholder="Minimum" name="minPrice" /> <br /> <br />
<input type="text" placeholder="Maximum" name="maxPrice" /> <br /> <br />

<button>Submit</button>

</form>
</body>
</html>
