<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Multiplication Table</title>

<style style="text/css">

.err {

	color:red;
}

</style>

</head>
<body>
<h1>Filters and Listeners</h1>
<hr />

<h2>Multiplication Table</h2>

<form action="printTable.jsp">
	<input type="text" placeholder="Enter number" name="num" />
	<button>Submit</button>
	</form>
	
	<span class="err">${msg }</span>
	
<p>
<a href="javascript:history.go(-1)">Back</a>	
</p>
</body>
</html>