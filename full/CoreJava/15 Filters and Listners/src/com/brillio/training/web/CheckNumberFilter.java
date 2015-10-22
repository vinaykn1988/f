package com.brillio.training.web;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/printTable.jsp")
public class CheckNumberFilter implements Filter {

    
    public CheckNumberFilter() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
			throws IOException, ServletException {
		
		try {
			Integer.parseInt(request.getParameter("num"));
			request.setAttribute("msg", "");
			chain.doFilter(request, response);
		} catch (NumberFormatException e) {
			// forward to the input page
			request.setAttribute("msg", "Invalid value entered!");
			
			request.getRequestDispatcher("table.jsp").forward(request, response);
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
