package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class app_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Document</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("</head>\n");
      out.write("<style>body{\n");
      out.write("    background-color: #b9c1cd;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    min-height: 100vh;\n");
      out.write("\n");
      out.write("}\n");
      out.write("img{\n");
      out.write("    height: 350px;\n");
      out.write("    width: 200px;\n");
      out.write("}\n");
      out.write(".container{\n");
      out.write("    width: 200px;\n");
      out.write("    height: 350px;\n");
      out.write("    position: relative;\n");
      out.write("    transform-style: preserve-3d;\n");
      out.write("    transform: perspective(1000px);\n");
      out.write("    animation: gallery 20s linear infinite;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write(".container span{\n");
      out.write("    position: absolute;\n");
      out.write("    width: 100%;\n");
      out.write("    height: 100%;\n");
      out.write("    transform-style: preserve-3d;\n");
      out.write("    transform: rotateY(calc(var(i)*45deg)) translateZ(500px);\n");
      out.write("    -webkit-box-reflect: below 2.5px linear-gradient(transparent, transparent, rgba(3,3,3,0.2));\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".container span img{\n");
      out.write("    position: absolute;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    border: 6px ridge #ccc;\n");
      out.write("}\n");
      out.write("@keyframes gallery{\n");
      out.write("    0%{\n");
      out.write("        transform: perspective(1000px) rotateY(0deg);\n");
      out.write("    }\n");
      out.write("    100%{\n");
      out.write("        transform: perspective(1000px) rotateY(360deg);\n");
      out.write("    }\n");
      out.write("}</style>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <span style=\"i:1\"><img src=\"1.png\" alt=\"\"></span>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
