package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.schedule;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class Deleteroute_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"management.css\">\n");
      out.write("        <style>\n");
      out.write("        h1{\n");
      out.write("  font-size: 30px;\n");
      out.write("  color: #ff9900;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("  font-weight: 300;\n");
      out.write("  text-align: center;\n");
      out.write("  margin-bottom: 15px;\n");
      out.write("}\n");
      out.write("table{\n");
      out.write("  width:100%;\n");
      out.write("/*  table-layout: fixed;*/\n");
      out.write("}\n");
      out.write(".tbl-header{\n");
      out.write("  background-color: rgba(0,0,0,0.9);\n");
      out.write("  overflow-x:auto;\n");
      out.write("  margin-top: 0px;\n");
      out.write("  border: 1px solid rgba(0,0,0,0.9);\n");
      out.write(" }\n");
      out.write(".tbl-content{\n");
      out.write(" /*height:300px;*/\n");
      out.write("  overflow-x:auto;\n");
      out.write("  margin-top: 0px;\n");
      out.write("  border: 1px solid rgba(0,0,0,0.9);\n");
      out.write("}\n");
      out.write("th{\n");
      out.write("  padding: 12px 12px;\n");
      out.write("  text-align: left;\n");
      out.write("  font-weight: 500;\n");
      out.write("  font-size: 12px;\n");
      out.write("  color: grey;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("}\n");
      out.write("td{\n");
      out.write("  background-color: black;\n");
      out.write("  padding: 15px;\n");
      out.write("  text-align:left ;\n");
      out.write("  vertical-align:middle;\n");
      out.write("  font-weight: 300;\n");
      out.write("  font-size: 20px;\n");
      out.write("  color: grey;\n");
      out.write("  border-bottom: solid 1px rgba(0,0,0,0.7);\n");
      out.write("}\n");
      out.write(".butn\n");
      out.write("  {\n");
      out.write("    width:20%;\n");
      out.write("    margin:auto;\n");
      out.write("    margin-left:435px;\n");
      out.write("    box-sizing:border-box;\n");
      out.write("    padding: 10px 0px;\n");
      out.write("    background-color: white;\n");
      out.write("    opacity:0.7;\n");
      out.write("    outline:none;\n");
      out.write("    border:none;\n");
      out.write("    border-bottom:1px  #ff9900;\n");
      out.write("    color:#ff9900;\n");
      out.write("    border-radius:20px;\n");
      out.write("    font-size:15px;\n");
      out.write("    height:35px;\n");
      out.write("\n");
      out.write("  }\n");
      out.write("  .butn:hover\n");
      out.write("{\n");
      out.write("  background:White;\n");
      out.write("  color:#ff9900;\n");
      out.write("  cursor:pointer;\n");
      out.write("}\n");
      out.write(".demo\n");
      out.write("{\n");
      out.write("  display:flex;\n");
      out.write("      background-color: black;\n");
      out.write("      padding:20px;\n");
      out.write("            flex-wrap:wrap;\n");
      out.write("      flex-direction:row;\n");
      out.write("      justify-content: space-around;\n");
      out.write("      width:83%;\n");
      out.write("      margin-top: 50px;\n");
      out.write("     \n");
      out.write("     margin:auto;\n");
      out.write("     box-sizing: border-box;\t\n");
      out.write("}\n");
      out.write(" .demo input[type=text]\n");
      out.write("    {\n");
      out.write("      margin-top:3px;\n");
      out.write("      border-radius: 20px;\n");
      out.write("      width:200px;\n");
      out.write("      height:30px;\n");
      out.write("      \n");
      out.write("          }\n");
      out.write("section{\n");
      out.write("  margin: 50px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("   <body background=\"g1.jpg\"> \n");
      out.write("       \n");
      out.write("           <table WIDTH=\"100%\">\n");
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
      out.write("           <header>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <ul class=\"main-nav\">\n");
      out.write("                     <button class=\"button\"><li><a href=\"Register.jsp\">Register</a></li></button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                    <button class=\"button\"><li><a href=\"Remove.jsp\">Remove User</a></li></button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                    <button class=\"button\">  <li><a href=\"Adminpage.jsp\">Add Route </a></li></button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                    <button class=\"button\"> <li><a href=\"Deleteroute.jsp\">Delete Route</a></li></button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                     <button class=\"button\"> <li><a href=\"Editroute.jsp\">Edit Route</a></li></button>\n");
      out.write("                   \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("               \n");
      out.write("     <section>\n");
      out.write("  <!--for demo wrap-->\n");
      out.write(" \n");
      out.write("  <div class=\"tbl-header\">\n");
      out.write("    <table>\n");
      out.write("    <thead>\n");
      out.write("    <tr>      \n");
      out.write("    <th><h2>BUS NUMBER    </th></h2>\n");
      out.write("    <th><h2>ROUTE</h2></th>\n");
      out.write("    </tr>\n");
      out.write("    </thead>\n");
      out.write("      <tbody>\n");
      out.write("         ");
 
                    int busn;
                    
                    Configuration cf = null;
                    SessionFactory sf = null;
                    Session s = null;
                    schedule sch = null;
                    try{
                        cf = new Configuration();
                        cf.configure();
                        sf = cf.buildSessionFactory();
                        s = sf.openSession();
                        Query q = s.createQuery("from schedule");
                        Iterator it = q.iterate();
                        while (it.hasNext()){
                            
                            sch = (schedule)it.next();
                            busn = sch.getBusn();
                          
                            System.out.println(busn);
                            
                
      out.write("        \n");
      out.write("                \n");
      out.write("\t\t\t<tr>\n");
      out.write("                            <td>");
      out.print(busn);
      out.write("</td>\n");
      out.write("                            \n");
      out.write("                           \n");
      out.write("\t\t\t</tr>\n");
      out.write("                        ");

                            }
                    }catch(Exception e){
                        e.printStackTrace();
                    }  
                
      out.write("      \n");
      out.write("      </tbody>\n");
      out.write("    </table>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("           \n");
      out.write("        <form class=\"login\" action=\"delete\" method=\"post\">\n");
      out.write("    <h1 class=\"login-title\">DELETE ROUTE</h1>\n");
      out.write("    <input type=\"text\" class=\"login-input\" name=\"busn\" placeholder=\"Bus number\" autofocus required>\n");
      out.write("   \n");
      out.write("   <center> <button type=\"submit\" value=\"Submit\" class=\"button\" width=\"50\" height=\"20\">SUBMIT HERE</button></center><br><br>\n");
      out.write("   \n");
      out.write("    </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("    ");
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
