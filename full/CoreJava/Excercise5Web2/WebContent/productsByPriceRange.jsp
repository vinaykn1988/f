<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Information</title>
</head>
<body>
<h1> Product Data</h1> 
<hr />

<form method="GET" action="viewAllProductsByPrice">
<h3>Enter price range</h3>

<div>
<label>Minimum</label>
<input type="text" size="10" name="min_price" />
</div>

<div>
<label>Max</label>
<input type="text" size="10" name="max_price" />
</div>


<div>
<label></label>
<button>Submit</button>
</div>

</form>

</body>
</html>