package com.brillio.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/hello", "/hola"})
public class HelloServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String remoteAddress = req.getRemoteAddr();
		System.out.println("Got a request from" + remoteAddress);
		
		res.setContentType("text/plain");
		PrintWriter out = res.getWriter();
		
		out.println("Hello, World.");
		out.println("- Vinay");
		out.close();
	}

}
