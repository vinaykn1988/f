package com.brilio.training.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.brillio.training.dao.DaoException;
import com.brillio.training.dao.DaoFactory;
import com.brillio.training.dao.ProductDao;
import com.brillio.training.entity.Product;

@WebServlet("/addProduct")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("productForm.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			// get product from the request ( stored by the filter)
			Product p = (Product) request.getAttribute("product");
			// get a product-dao object
			ProductDao dao = DaoFactory.getProductDao();
			// add a product
			dao.addProduct(p);
			// redirect to the homepage
			response.sendRedirect("productForm.jsp?success=true");
		} catch (DaoException e) {
			e.printStackTrace();
			// exception: forward to product-form
			request.getRequestDispatcher("productForm.jsp?success=false")
			.forward(request, response);
		}
		// exception: forward to product-form
	}

}
