/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.64
 * Generated at: 2015-10-15 07:17:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.brillio.training.entity.Product;
import java.util.List;
import com.brillio.training.dao.DaoFactory;
import com.brillio.training.dao.ProductDao;

public final class getProductsByPrice_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Products Data</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"jquery/jquery-1.11.3.js\"> </script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"jquery/jquery.tablesorter.js\"> </script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$(\"table\").tablesorter(); \r\n");
      out.write("\t$(\"table thead tr\").addClass(\"header\");\r\n");
      out.write("//\t$(\"table tbody tr:even\").addClass(\"even\");\r\n");
      out.write("//\t$(\"table tbody tr:odd\").addClass(\"odd\");\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write(".header{\r\n");
      out.write("\tbackground-color: #000;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tfont-weight: bolder;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".even{\r\n");
      out.write("\r\n");
      out.write("\tbackground-color: #ccc;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".odd{\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");

		String input = request.getParameter("min_price");
		if (input == null) {
			// redirect the user to "index.html"
			// A.K.A. client side redirection
			response.sendRedirect("index.html");
			return;
		}

		double min = Double.parseDouble(input);

		input = request.getParameter("max_price");
		if (input == null) {
			// redirect the user to "index.html"
			// A.K.A. client side redirection
			response.sendRedirect("index.html");
			return;
		}
		double max = Double.parseDouble(input);

		ProductDao dao = DaoFactory.getProductDao();
		List<Product> list = dao.getProductsByPriceRange(min, max);
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<h1>Product Data</h1>\r\n");
      out.write("\t<hr />\r\n");
      out.write("\r\n");
      out.write("\t<p>\r\n");
      out.write("\t\tThere are\r\n");
      out.write("\t\t");
      out.print(list.size());
      out.write("\r\n");
      out.write("\t\tproducts in the price range of $");
      out.print(min);
      out.write("\r\n");
      out.write("\t\tand $");
      out.print(max);
      out.write("</p>\r\n");
      out.write("\t<table border=\"1\" >\r\n");
      out.write("\t<thead>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<th>Product name</th>\r\n");
      out.write("\t\t\t<th>Quantity per unit</th>\r\n");
      out.write("\t\t\t<th>Unit price</th>\r\n");
      out.write("\t\t\t<th>Units in stock</th>\r\n");
      out.write("\t\t\t<th>Discontinued?</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</thead>\r\n");
      out.write("\t<tbody>\r\n");
      out.write("\t\t");

			for (Product p : list) {
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>");
      out.print(p.getProductName());
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(p.getQuantityPerUnit());
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(p.getUnitPrice());
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(p.getUnitsInStock());
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(p.getDiscontinued() == 1 ? "Yes" : "No");
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<p>\r\n");
      out.write("\t\t<a href=\"./\">Try again</a>\r\n");
      out.write("\t</p>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}