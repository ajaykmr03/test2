package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>Mail Sent Success Modal</title>\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <style>\n");
      out.write("    .success-checkmark {\n");
      out.write("      width: 80px;\n");
      out.write("      height: 80px;\n");
      out.write("      margin: 0 auto;\n");
      out.write("      position: relative;\n");
      out.write("    }\n");
      out.write("    .check-icon {\n");
      out.write("      width: 80px;\n");
      out.write("      height: 80px;\n");
      out.write("      border-radius: 50%;\n");
      out.write("      background: #4BB543;\n");
      out.write("      position: relative;\n");
      out.write("    }\n");
      out.write("    .check-icon::after {\n");
      out.write("      content: '';\n");
      out.write("      position: absolute;\n");
      out.write("      left: 22px;\n");
      out.write("      top: 40px;\n");
      out.write("      width: 25px;\n");
      out.write("      height: 10px;\n");
      out.write("      border-left: 5px solid white;\n");
      out.write("      border-bottom: 5px solid white;\n");
      out.write("      transform: rotate(-45deg);\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write(" \n");
      out.write("         \n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"mailSuccessModal\" tabindex=\"-1\" aria-labelledby=\"mailSuccessLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog modal-dialog-centered\">\n");
      out.write("    <div class=\"modal-content text-center p-4\">\n");
      out.write("      <div class=\"success-checkmark\">\n");
      out.write("        <div class=\"check-icon\"></div>\n");
      out.write("      </div>\n");
      out.write("      <h5 class=\"mt-3\">Mail Sent Successfully!</h5>\n");
      out.write("      <button type=\"button\" class=\"btn btn-primary mt-3\" data-bs-dismiss=\"modal\">OK</button>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("</body>\n");
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
