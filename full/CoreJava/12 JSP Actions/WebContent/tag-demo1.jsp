<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="brillio-training/tags" prefix="vk" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Custom Tags Demo</title>
</head>
<body>
<h1>JSP Custom Tags Demo</h1>
<hr />

<vk:today /> <br />
<vk:today pattern="d/M/y" /> <br />
<vk:today pattern="EEEE MMMM d, yyyy" /> <br />
<vk:today pattern="dd-mm-yy" /> <br />
<vk:today pattern="yyyy-MM-dd hh:mm:ss" /> <br />



</body>
</html>