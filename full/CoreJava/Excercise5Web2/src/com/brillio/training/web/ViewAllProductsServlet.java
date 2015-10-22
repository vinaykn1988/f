package com.brillio.training.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.brillio.training.dao.DaoException;
import com.brillio.training.dao.DaoFactory;
import com.brillio.training.dao.ProductDao;
import com.brillio.training.entity.Product;


@WebServlet(urlPatterns={"/viewAllProducts", "/viewAllProductsByPrice"})
public class ViewAllProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			// use the model layer to get the model data
			ProductDao dao = DaoFactory.getProductDao();
			List<Product> list; // = dao.getAllProducts();
			
			if(request.getParameter("min_price")!= null && request.getParameter("max_price")!= null )
			{
				
			
			Double min = Double.parseDouble(request.getParameter("min_price")) ;
			Double max = Double.parseDouble(request.getParameter("max_price")) ;
			list = dao.getProductsByPriceRange(min, max);
			// store this model data in a place accessible to the view
			request.setAttribute("products", list);
			}
			
			else{
				list = dao.getAllProducts();
				request.setAttribute("products", list);
			}
				
			// forward the request to the view
			RequestDispatcher rd = request.getRequestDispatcher("showProducts.jsp");
			rd.forward(request, response);

		} catch (DaoException e) {
			
		}
	}

}
