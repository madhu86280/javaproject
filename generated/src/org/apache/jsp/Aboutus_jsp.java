package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link <head>\n");
      out.write("<style>h1 {\n");
      out.write("  color: white;\n");
      out.write("  text-shadow: 2px 2px 4px grey;\n");
      out.write(" font-size: 60px;\n");
      out.write("}\n");
      out.write(".container {\n");
      out.write("  position: relative;\n");
      out.write("  text-align: center;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bottom-left {\n");
      out.write("  position: absolute;\n");
      out.write("  bottom: 8px;\n");
      out.write("  left: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".top-left {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 8px;\n");
      out.write("  left: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".top-right {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 8px;\n");
      out.write("  right: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bottom-right {\n");
      out.write("  position: absolute;\n");
      out.write("  bottom: 8px;\n");
      out.write("  right: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".centered {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 50%;\n");
      out.write("  left: 50%;\n");
      out.write("  transform: translate(-50%, -50%);\n");
      out.write("}\n");
      out.write(".overlay {\n");
      out.write("    height: 100%;\n");
      out.write("    width: 0;\n");
      out.write("    position: fixed;\n");
      out.write("    z-index: 1;\n");
      out.write("    top: 0;\n");
      out.write("    left: 0;\n");
      out.write("    background-color: rgb(0,0,0);\n");
      out.write("    background-color: rgba(0,0,0, 0.9);\n");
      out.write("    overflow-x: hidden;\n");
      out.write("    transition: 0.5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".overlay-content {\n");
      out.write("    position: relative;\n");
      out.write("    top: 5%;\n");
      out.write("    width: 100%;\n");
      out.write("    text-align: center;\n");
      out.write("    margin-top: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".overlay a {\n");
      out.write("    padding: 12px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    font-size: 25px;\n");
      out.write("    color: #818181;\n");
      out.write("    display: block;\n");
      out.write("    transition: 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".overlay a:hover, .overlay a:focus {\n");
      out.write("    color: #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".overlay .closebtn {\n");
      out.write("    position: absolute;\n");
      out.write("    top: 20px;\n");
      out.write("    right: 45px;\n");
      out.write("    font-size: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-height: 450px) {\n");
      out.write("  .overlay a {font-size: 10px}\n");
      out.write("  .overlay .closebtn {\n");
      out.write("    font-size: 10px;\n");
      out.write("    top: 25px;\n");
      out.write("    right: 35px;\n");
      out.write("  }\n");
      out.write("}</style>\n");
      out.write("<title>ABOUT</title>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <div class=\"row mb-3\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <h1>ABOUT US</h1>\n");
      out.write("                                        <hr>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <center>\n");
      out.write("\n");
      out.write("<div class=\"slideshow-container\">\n");
      out.write("\n");
      out.write("<div class=\"mySlides fade\">\n");
      out.write("  <div class=\"numbertext\"></div>\n");
      out.write("  <img src=\"z.jpg\" style=\"width:80%\">\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"mySlides fade\">\n");
      out.write("  <div class=\"numbertext\"></div>\n");
      out.write("  <img src=\"y.jpg\" style=\"width:80%\">\n");
      out.write(" \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<div style=\"text-align:center\">\n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("</div>\n");
      out.write("</center>\n");
      out.write("<script>\n");
      out.write("var slideIndex = 0;\n");
      out.write("showSlides();\n");
      out.write("\n");
      out.write("function showSlides() {\n");
      out.write("    var i;\n");
      out.write("    var slides = document.getElementsByClassName(\"mySlides\");\n");
      out.write("    var dots = document.getElementsByClassName(\"dot\");\n");
      out.write("    for (i = 0; i < slides.length; i++) {\n");
      out.write("       slides[i].style.display = \"none\";  \n");
      out.write("    }\n");
      out.write("    slideIndex++;\n");
      out.write("    if (slideIndex > slides.length) {slideIndex = 1}    \n");
      out.write("    for (i = 0; i < dots.length; i++) {\n");
      out.write("        dots[i].className = dots[i].className.replace(\" active\", \"\");\n");
      out.write("    }\n");
      out.write("    slides[slideIndex-1].style.display = \"block\";  \n");
      out.write("    dots[slideIndex-1].className += \" active\";\n");
      out.write("    setTimeout(showSlides,2000); // Change image every 2 seconds\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        \n");
      out.write("                                      <h4>  CHITKARA UNIVERSITY, HIMACHAL PRADESH\n");
      out.write("Chitkara University started its operations from Academic Year 2008-09 after the Legislature of Himachal Pradesh passed Chitkara University (Establishment and Regulation) Act (Act No. 2 of 2009). We are NAAC accredited government-recognized university with the right to confer degrees as per the Sections 2(f) and 22(1) of the UGC Act, 1956 and are member of esteemed Association of Indian Universities. The University has grown tremendously during the last few years and is fast moving towards attaining leadership position in North India, which speaks volumes about our enduring commitment, outstanding faculty and rich learning environment. Being founded by a family of academicians, consequently our ethos is geared towards development of society by providing high quality education.\n");
      out.write("\n");
      out.write("The Campus is spread over approximately 17 acres and provides state-of-the-art facilities and ambience for a conducive learning environment. The pedagogy is learning-centric and the curriculum has been drawn to keep abreast with latest in respective domains that prepares students for life. The ambience of the University, teacher-student relations, functional industry tie-ups, and collaborations with foreign universities provide excellent opportunities to students for their overall development.\n");
      out.write("\n");
      out.write("We hold a strong commitment to high standards in all aspects of our educational activities, learning outcomes and support services and also seek to continuously strengthen the overall effectiveness of our operations. We recognize that in a shrinking globe students have to possess skills to work in an international environment. The University has collaboration with a large number of reputed foreign universities that encompass articulation arrangements, student and faculty exchanges and research collaborations as the main stay of such joint ventures.\n");
      out.write("\n");
      out.write("Research has been accorded its due importance and the University has established three research centres to give a boost to research activities. A number of reputed companies have sponsored laboratories that have been set up in the campus and facilitate research. The companies like Bentley, nVIDIA  has granted the status of to Chitkara University. Marquee companies such as ARM, Cadence and NXP Semiconductors are supporting us in terms of supplying state-of-the-art equipment for best hands-on classroom training. Infosys Campus Connect and Wipro 10X Mission have provided us an important framework for our engineering curriculum.<h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("</head>\n");
      out.write("<body background=\"g1.jpg\">\n");
      out.write(" </body>\n");
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
