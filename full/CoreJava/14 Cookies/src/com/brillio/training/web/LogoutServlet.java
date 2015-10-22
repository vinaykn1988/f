package com.brillio.training.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
       
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    
    // create a cookie with name = "username"
    // value doesn't matter
    	Cookie c1 = new Cookie("username", " ");
    	
    // set the age to o; die immediately
    	c1.setMaxAge(0);
    	
    // add to response
       response.addCookie(c1);
       
    // redirect to home page
       response.sendRedirect("./");
    	
	}

}
