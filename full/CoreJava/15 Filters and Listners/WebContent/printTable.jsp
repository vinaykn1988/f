<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Multiplication Table</title>
</head>
<body>
<h1>Filters and Listeners</h1>
<hr />

<h2>Multiplication Table</h2>

<c:forEach begin="1" end="15" var="i">
${param.num} X ${i} = ${param.num*i} <br />
</c:forEach>

<p>
<a href="javascript:history.go(-1)">Back</a>	
</p>

</body>
</html>