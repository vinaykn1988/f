/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.64
 * Generated at: 2015-10-16 05:36:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tag_002ddemo1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/mycustomtags.tld", Long.valueOf(1444973653833L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvk_005ftoday_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvk_005ftoday_0026_005fpattern_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fvk_005ftoday_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvk_005ftoday_0026_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fvk_005ftoday_005fnobody.release();
    _005fjspx_005ftagPool_005fvk_005ftoday_0026_005fpattern_005fnobody.release();
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
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>JSP Custom Tags Demo</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>JSP Custom Tags Demo</h1>\r\n");
      out.write("<hr />\r\n");
      out.write("\r\n");
      if (_jspx_meth_vk_005ftoday_005f0(_jspx_page_context))
        return;
      out.write(" <br />\r\n");
      if (_jspx_meth_vk_005ftoday_005f1(_jspx_page_context))
        return;
      out.write(" <br />\r\n");
      if (_jspx_meth_vk_005ftoday_005f2(_jspx_page_context))
        return;
      out.write(" <br />\r\n");
      if (_jspx_meth_vk_005ftoday_005f3(_jspx_page_context))
        return;
      out.write(" <br />\r\n");
      if (_jspx_meth_vk_005ftoday_005f4(_jspx_page_context))
        return;
      out.write(" <br />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_vk_005ftoday_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  vk:today
    com.brillio.training.web.tags.TodayTag _jspx_th_vk_005ftoday_005f0 = (com.brillio.training.web.tags.TodayTag) _005fjspx_005ftagPool_005fvk_005ftoday_005fnobody.get(com.brillio.training.web.tags.TodayTag.class);
    _jspx_th_vk_005ftoday_005f0.setPageContext(_jspx_page_context);
    _jspx_th_vk_005ftoday_005f0.setParent(null);
    int _jspx_eval_vk_005ftoday_005f0 = _jspx_th_vk_005ftoday_005f0.doStartTag();
    if (_jspx_th_vk_005ftoday_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvk_005ftoday_005fnobody.reuse(_jspx_th_vk_005ftoday_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fvk_005ftoday_005fnobody.reuse(_jspx_th_vk_005ftoday_005f0);
    return false;
  }

  private boolean _jspx_meth_vk_005ftoday_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  vk:today
    com.brillio.training.web.tags.TodayTag _jspx_th_vk_005ftoday_005f1 = (com.brillio.training.web.tags.TodayTag) _005fjspx_005ftagPool_005fvk_005ftoday_0026_005fpattern_005fnobody.get(com.brillio.training.web.tags.TodayTag.class);
    _jspx_th_vk_005ftoday_005f1.setPageContext(_jspx_page_context);
    _jspx_th_vk_005ftoday_005f1.setParent(null);
    // /tag-demo1.jsp(17,0) name = pattern type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_vk_005ftoday_005f1.setPattern("d/M/y");
    int _jspx_eval_vk_005ftoday_005f1 = _jspx_th_vk_005ftoday_005f1.doStartTag();
    if (_jspx_th_vk_005ftoday_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvk_005ftoday_0026_005fpattern_005fnobody.reuse(_jspx_th_vk_005ftoday_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fvk_005ftoday_0026_005fpattern_005fnobody.reuse(_jspx_th_vk_005ftoday_005f1);
    return false;
  }

  private boolean _jspx_meth_vk_005ftoday_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  vk:today
    com.brillio.training.web.tags.TodayTag _jspx_th_vk_005ftoday_005f2 = (com.brillio.training.web.tags.TodayTag) _005fjspx_005ftagPool_005fvk_005ftoday_0026_005fpattern_005fnobody.get(com.brillio.training.web.tags.TodayTag.class);
    _jspx_th_vk_005ftoday_005f2.setPageContext(_jspx_page_context);
    _jspx_th_vk_005ftoday_005f2.setParent(null);
    // /tag-demo1.jsp(18,0) name = pattern type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_vk_005ftoday_005f2.setPattern("EEEE MMMM d, yyyy");
    int _jspx_eval_vk_005ftoday_005f2 = _jspx_th_vk_005ftoday_005f2.doStartTag();
    if (_jspx_th_vk_005ftoday_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvk_005ftoday_0026_005fpattern_005fnobody.reuse(_jspx_th_vk_005ftoday_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fvk_005ftoday_0026_005fpattern_005fnobody.reuse(_jspx_th_vk_005ftoday_005f2);
    return false;
  }

  private boolean _jspx_meth_vk_005ftoday_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  vk:today
    com.brillio.training.web.tags.TodayTag _jspx_th_vk_005ftoday_005f3 = (com.brillio.training.web.tags.TodayTag) _005fjspx_005ftagPool_005fvk_005ftoday_0026_005fpattern_005fnobody.get(com.brillio.training.web.tags.TodayTag.class);
    _jspx_th_vk_005ftoday_005f3.setPageContext(_jspx_page_context);
    _jspx_th_vk_005ftoday_005f3.setParent(null);
    // /tag-demo1.jsp(19,0) name = pattern type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_vk_005ftoday_005f3.setPattern("dd-mm-yy");
    int _jspx_eval_vk_005ftoday_005f3 = _jspx_th_vk_005ftoday_005f3.doStartTag();
    if (_jspx_th_vk_005ftoday_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvk_005ftoday_0026_005fpattern_005fnobody.reuse(_jspx_th_vk_005ftoday_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fvk_005ftoday_0026_005fpattern_005fnobody.reuse(_jspx_th_vk_005ftoday_005f3);
    return false;
  }

  private boolean _jspx_meth_vk_005ftoday_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  vk:today
    com.brillio.training.web.tags.TodayTag _jspx_th_vk_005ftoday_005f4 = (com.brillio.training.web.tags.TodayTag) _005fjspx_005ftagPool_005fvk_005ftoday_0026_005fpattern_005fnobody.get(com.brillio.training.web.tags.TodayTag.class);
    _jspx_th_vk_005ftoday_005f4.setPageContext(_jspx_page_context);
    _jspx_th_vk_005ftoday_005f4.setParent(null);
    // /tag-demo1.jsp(20,0) name = pattern type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_vk_005ftoday_005f4.setPattern("yyyy-MM-dd hh:mm:ss");
    int _jspx_eval_vk_005ftoday_005f4 = _jspx_th_vk_005ftoday_005f4.doStartTag();
    if (_jspx_th_vk_005ftoday_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvk_005ftoday_0026_005fpattern_005fnobody.reuse(_jspx_th_vk_005ftoday_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fvk_005ftoday_0026_005fpattern_005fnobody.reuse(_jspx_th_vk_005ftoday_005f4);
    return false;
  }
}
