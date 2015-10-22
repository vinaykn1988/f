package com.brillio.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/PrintTableServlet", "/printTable" })
public class PrintTableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. read the input
		String input;
		input = request.getParameter("num");
		int num = Integer.parseInt(input);
		input = request.getParameter("limit");
		int limit = Integer.parseInt(input);
		
		
		// 2. get the data required for the output based on the input
		String data = " ";
		for(int i=1;i<limit;i++){
			
			data += num + "*" + i + "=" + (num*i) + "<br>";
		}
		
		// 3. Generate the output and update the response
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(data);
		
		out.close();
	}
		
}
