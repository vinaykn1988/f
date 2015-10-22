<% 
	try {
		int num = Integer.parseInt(request.getParameter("num"));
		
		%>
		
		<jsp:include page="index.jsp" />
		<p> Multiplication Table </p>
		
		<% 
		
		for(int i=1; i<=15; i++){
			
			%>
			
			<%=num %> X <%=i %> = <%=num*i %> <br />
			
			<% 
			
		}
		
		
		
	}

	catch(NumberFormatException e){
		%>
		
		<jsp:forward page="error.jsp" />
		
		<%
	}

%>