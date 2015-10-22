package com.brillio.training.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/welcome")
public class WelcomeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/plain");
		PrintWriter out = resp.getWriter();
		
		Enumeration<String> headers = req.getHeaderNames();
		
		out.println("Your IP address is:"+ req.getRemoteAddr());
		out.println("Your PC name is:"+ req.getRemoteHost());
		out.println("The received headers are:");
		
		while(headers.hasMoreElements()){
			String key = headers.nextElement();
			String value = req.getHeader(key);
			out.println(key + ": " + value);
		}
		out.close();
	}
}
