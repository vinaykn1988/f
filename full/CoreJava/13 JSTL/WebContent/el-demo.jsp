<%@page import="com.brillio.training.entity.Person"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Expression Language Demo</title>
</head>
<body>
<h1>JSP Expression Language Demo</h1>

<%--

An EL uses a format of $(expr). An expression is used directly in the 
HTML content, and the expression evaluated, and the result is
substituted in the HTML. 
 --%>

<p>\${10+20} is ${10+20}</p>
<p>\${10==20} is ${10==20}</p>

<p>\${10==20} is ${10==20?"Expr resulted in true":"Expr evaluated to false"}</p>

<%-- action="" means submit to the same page --%>
<form action="">
<input placeholder="Enter city" name="city" />
<button>Submit</button>
</form>

<%--
${param} is a builtin object equivalent to request.getParameter
Can be used as ${param.PARAMETER} or ${param["PARAMETER"]} 
 --%>
<p> The value for city is ${param.city}</p>
<p> The value for city is ${param["city"]}</p>

<%

	// create an object of Person
	Person p1 = new  Person(1, "David", "Miller", 5.11);

	// store the mae in request scope
	request.setAttribute("person", p1);
	
	// in the JSP EL, the request attribute is accessible as
	// ${requestScope.ATTRIBUTE}
	
	// For example, ${requestScope.person} or
	// ${requestScope["person"]}
	
%>

<p>Id : ${requestScope.person.id}</p>
<p>Name : ${person.fullName}</p>
<p>Height : ${requestScope.person.height}</p>

</body>
</html>