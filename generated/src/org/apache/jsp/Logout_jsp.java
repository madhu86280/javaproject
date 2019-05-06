package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Logout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       \n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write("\t\t\n");
      out.write("\t\t.background{\n");
      out.write("\n");
      out.write("            height:400px;\n");
      out.write("            width:400px;\n");
      out.write("           \n");
      out.write("            border :6px solid black;\n");
      out.write("            position: relative;\n");
      out.write("        \n");
      out.write("            \n");
      out.write("        }\n");
      out.write("\t\t.background .bg{\n");
      out.write("\t\tbackground: url(g1.jpg) repeat;\n");
      out.write("\t\t opacity:.5;\n");
      out.write("           filter: alpha(opacity=20);\n");
      out.write("\t\t     position: absolute;\n");
      out.write("        z-index: -1;\n");
      out.write("          top: 0;\n");
      out.write("            bottom: 0;\n");
      out.write("          left: 0;\n");
      out.write("        right: 0;\n");
      out.write("        width: 100%;\n");
      out.write("        height: 100%;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t.button {\n");
      out.write("  padding: 5px 15px;\n");
      out.write("  font-size: 15px;\n");
      out.write("  text-align: center;\n");
      out.write("  cursor: pointer;\n");
      out.write("  outline: none;\n");
      out.write("  color: #fff;\n");
      out.write("  background-color: black;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 15px;\n");
      out.write("  box-shadow: 0 9px grey;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:hover {background-color: black}\n");
      out.write("\n");
      out.write(".button:active {\n");
      out.write("  background-color: black;\n");
      out.write("  box-shadow: 0 5px grey;\n");
      out.write("  transform: translateY(4px);\n");
      out.write("}\n");
      out.write("h1 {\n");
      out.write("  color: black;\n");
      out.write("  text-shadow: 2px 2px 4px grey;\n");
      out.write(" font-size: 80px;\n");
      out.write("}\n");
      out.write("h1 {\n");
      out.write("  color: black;\n");
      out.write("  text-shadow: 2px 2px 4px grey;\n");
      out.write(" font-size: 60px;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("    <body background=\"bus21.jpg\"> \n");
      out.write("        <table WIDTH=\"100%\">\n");
      out.write("<tr>\n");
      out.write("<td><center><b><h1><font face=\"Arial\"></font></h1></b></center></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td bgcolor=\"black\">\n");
      out.write("<center><b><font face=\"verdana\"><font color=\"white\" size=\"+4\">BUS MANAGEMENT SYSTEM</font></b></center>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("<marquee bgcolor=\"lightyellow\" direction=\"left\"><b><font size=\"5\" color=\"red\"></font></b>\n");
      out.write("</marquee>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<div class=\"w3-container w3-center w3-animate-zoom\">\n");
      out.write("<center>\n");
      out.write("        <div class=\"background\">\n");
      out.write("           <div class=\"bg\"></div>\n");
      out.write("        <div align=\"center\" style=\"opacity:1.0;\" >\n");
      out.write("            <form method=\"post\" action=\"MY.html\">\n");
      out.write("                <table cellpadding=\"10\" cellspacing=\"1\" border=\"0\" width=\"70%\">\n");
      out.write("                    <tr><td colspan=\"4\"></td></tr>\n");
      out.write("                     <tr><td colspan=\"4\"></td></tr>\n");
      out.write("                     \n");
      out.write("                    \n");
      out.write("                    <tr><td colspan=\"4\" align=\"center\"><h2><b><i>LOGIN HERE</b></i></h2></td></tr>\n");
      out.write("                <tr><td width=\"20%\"></td><td><strong><font color=\"black\"> <b> NAME:</b></font></strong></td><td><input type=\"text\" name=\"txt_uid\" required></td><td width=\"20%\"></td></tr>\n");
      out.write("                <tr><td width=\"20%\"></td><td><strong><font color=\"black\"><b>PASSWORD:</b></font></strong></td> <td><input type=\"password\" name=\"txt_pass\" required></td><td width=\"20%\"></td></tr>\n");
      out.write("                \n");
      out.write("                  \n");
      out.write("                </table>    \n");
      out.write("                \n");
      out.write("\n");
      out.write("<br><br><button class=\"button\">LOGIN</button>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("</center>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
