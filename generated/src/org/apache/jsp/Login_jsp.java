package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1 , user-scale=0\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <title>Chitkara University</title>\n");
      out.write("  <style>\n");
      out.write("      select {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 7px 10px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write(".body1{\n");
      out.write("background-image:url(\"g1.jpg\");\n");
      out.write("height:100vh;\n");
      out.write("background-size:cover;\n");
      out.write("background-position:center;\n");
      out.write("background-repeat:no repeat;\n");
      out.write("overflow:hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-box {\n");
      out.write("    position: relative;\n");
      out.write("    margin: 5% auto;\n");
      out.write("    height: 400px;\n");
      out.write("    width: 600px;\n");
      out.write("    background: #fff;\n");
      out.write("    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.6);\n");
      out.write("    opacity: 0.8;\n");
      out.write("  /*filter: alpha(opacity=10);*/ /* For IE8 and earlier */\n");
      out.write("  font-family: sans-serif;\n");
      out.write("    font-weight: 400;\n");
      out.write("    font-size: 15px;\n");
      out.write("    transition: 0.2s ease;\n");
      out.write("}\n");
      out.write(".button {\n");
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
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:hover {background-color: black}\n");
      out.write("\n");
      out.write(".button:active {\n");
      out.write("  background-color: black;\n");
      out.write("  box-shadow: 0 5px grey;\n");
      out.write("  transform: translateY(4px);\n");
      out.write("}    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("     <table WIDTH=\"100%\">\n");
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
      out.write("      \n");
      out.write("<div class=\"body1\">\n");
      out.write("<div class=\"col-sm-offset-4 col-sm-4 \" style=\"padding-top:5%;\"> \n");
      out.write("        <div class=\"login-box\">\n");
      out.write("        <div style=\"padding:40px 50px;\">\n");
      out.write("            <form method=\"post\" action=\"LogServlet\">\n");
      out.write("            \n");
      out.write("             <div class=\"form-group\">\n");
      out.write("             <label for=\"usrname\"><span class=\"glyphicon glyphicon-user\"></span> Username</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"usrname\" name =\"username\"   placeholder=\"Enter username\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("              <label for=\"pass\"> Password </label>\n");
      out.write("              <input type=\"password\" class=\"form-control\" id=\"myInput\" name =\"password\" placeholder=\"Enter password\" >\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"user\">Usertype</label>\n");
      out.write("              <select name=\"selects\"  class=\"form-control\">\n");
      out.write("                                        <option value=\"Admin\">Admin</option>\n");
      out.write("                                        <option value=\"Student\">Student</option>\n");
      out.write("                                        <option value=\"Management\">Management</option>\n");
      out.write("                                    </select><input type=\"checkbox\" onclick=\"myFunction()\">Show Password\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\t\t    <div class=\"div1\"><a href=\"\"><font color=\"black\">forgot Password ?</font></a></div>\n");
      out.write("                    <center><input type=\"submit\" class=\"button\" value=\"Login\"></center>\n");
      out.write(" \n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<script>\n");
      out.write("    function myFunction() {\n");
      out.write("    var x = document.getElementById(\"myInput\");\n");
      out.write("    if (x.type === \"password\") {\n");
      out.write("        x.type = \"text\";\n");
      out.write("    } else {\n");
      out.write("        x.type = \"password\";\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("}\n");
      out.write("function myValidation(){\n");
      out.write("var element1=document.forms[\"MyForm\"][\"username\"].value;\n");
      out.write("var element2=document.forms[\"MyForm\"][\"password\"].value;\n");
      out.write("var flag = true;\n");
      out.write("if(element1==\"\"){\n");
      out.write("alert(\"Name cannot be empty\");\n");
      out.write("flag = false;\n");
      out.write("}\n");
      out.write("if(element2==\"\"){\n");
      out.write("alert(\"password cannot be empty\");\n");
      out.write("flag = false;\n");
      out.write("}\n");
      out.write("return flag;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    </body>\n");
      out.write("\t</html>");
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
