package com.brillio.training.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    Map<String,String> usersMap;
    public void init() throws ServletException{
    	
    	usersMap = new HashMap<>();
    	usersMap.put("vinod", "secret");
    	usersMap.put("guest", "guest");
    	usersMap.put("johndoe", "incorrect");
    	
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie[] cookies = request.getCookies();
		if(cookies!= null){
		for(Cookie c1: cookies){
			
			if(c1.getName().equals("username")){
				String username = c1.getValue();
				if(usersMap.containsKey(username)){
					
					// forward to inbox
					request.getRequestDispatcher("/WEB-INF/pages/inbox.jsp").forward(request, response);
					return;
					
				}
			}
		}
		}
		
		response.sendRedirect("loginForm.jsp");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String remember = request.getParameter("remember");
		
		if(usersMap.containsKey(username) && usersMap.get(username).equals(password)){
			
			Cookie c1 = new Cookie("username", username);
			
			
			
			if(remember!=null){
				
				// persistent cookie
				c1.setMaxAge(365*24*60*60); // 1 year
			}
			
			response.addCookie(c1);
			
			// forward to inbox
			request.getRequestDispatcher("/WEB-INF/pages/inbox.jsp").forward(request, response);
		}
		
		else{
			
			// redirect to login form
			response.sendRedirect("loginForm.jsp?error=true");
		}
	}

}
