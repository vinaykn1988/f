<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>You need to Login</h1>

<form action="login" method="POST">

<div>

<input placeholder="username" name="username" />

</div>

<div>

<input placeholder="Password" name="password"  type="password"/>

</div>

<div>
<button> login</button>
</div>


<div>
<input type="checkbox" name="remember" value="yes" /> Keep me signed in
</div>
</form>

<c:if test="${param.error==true}">
Your login attempt failed. Incorrect username/password.
</c:if>

</body>
</html>