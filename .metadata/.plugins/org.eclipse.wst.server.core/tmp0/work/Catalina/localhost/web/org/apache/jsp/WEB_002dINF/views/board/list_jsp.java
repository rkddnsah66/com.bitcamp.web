/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.48
 * Generated at: 2018-01-06 07:02:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/head.jsp", out, false);
      out.write("\r\n");
      out.write("<div style=\"margin: 50px auto;\">\r\n");
      out.write("\t<h1 style=\"text-align: center;\">게 시 글</h1>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"width: 80%; margin: 0 auto;\">\r\n");
      out.write("\t<label for=\"\">총 게시글 수: 100</label>\r\n");
      out.write("\t<button id=\"write_btn\" type=\"button\" class=\"btn btn-warning\" style=\"width: 200px; float: right;\">글쓰기</button>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"margin-top: 20px\">\r\n");
      out.write("\t<div class=\"input-group mb-3\" style=\"width: 80%; margin: 0 auto;\">\r\n");
      out.write("\t\t<select class=\"custom-select\" id=\"inputGroupSelect01\">\r\n");
      out.write("\t\t\t<option selected>제목</option>\r\n");
      out.write("\t\t\t<option value=\"1\">ID</option>\r\n");
      out.write("\t\t\t<option value=\"2\">이름</option>\r\n");
      out.write("\t\t</select> <input type=\"text\" class=\"form-control\">\r\n");
      out.write("\t\t<button type=\"button\" class=\"btn btn-dark\" style=\"width: 200px\">검색</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<table id=\"board_table\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>Company</th>\r\n");
      out.write("\t\t<th>Contact</th>\r\n");
      out.write("\t\t<th>Country</th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Alfreds Futterkiste</td>\r\n");
      out.write("\t\t<td>Maria Anders</td>\r\n");
      out.write("\t\t<td>Germany</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Centro comercial Moctezuma</td>\r\n");
      out.write("\t\t<td>Francisco Chang</td>\r\n");
      out.write("\t\t<td>Mexico</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Ernst Handel</td>\r\n");
      out.write("\t\t<td>Roland Mendel</td>\r\n");
      out.write("\t\t<td>Austria</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Island Trading</td>\r\n");
      out.write("\t\t<td>Helen Bennett</td>\r\n");
      out.write("\t\t<td>UK</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Laughing Bacchus Winecellars</td>\r\n");
      out.write("\t\t<td>Yoshi Tannamuri</td>\r\n");
      out.write("\t\t<td>Canada</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Magazzini Alimentari Riuniti</td>\r\n");
      out.write("\t\t<td>Giovanni Rovelli</td>\r\n");
      out.write("\t\t<td>Italy</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<nav aria-label=\"Page navigation example\"style=\"width: 80%; margin: 0 auto;\">\r\n");
      out.write("\t<ul class=\"pagination\"style=\"width: 313px; margin-left: auto; margin-right: auto;\">\r\n");
      out.write("\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\">Previous</a></li>\r\n");
      out.write("\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\">1</a></li>\r\n");
      out.write("\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\">2</a></li>\r\n");
      out.write("\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\r\n");
      out.write("\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\">4</a></li>\r\n");
      out.write("\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\">5</a></li>\r\n");
      out.write("\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\">Next</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</nav>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(\"#write_btn\").click(()=>{\r\n");
      out.write("\tlocation.href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/write_form\";\r\n");
      out.write("});\r\n");
      out.write("</script>");
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
