package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class script_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <style>\n");
      out.write("        \n");
      out.write("        *{\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("        body{\n");
      out.write("            background-color: #D2D2D2;\n");
      out.write("            background-image:\n");
      out.write("            repeating-linear-gradient(\n");
      out.write("                to right, transparent 0 100px,\n");
      out.write("                #25283b22 100px 101px\n");
      out.write("            ),\n");
      out.write("            repeating-linear-gradient(\n");
      out.write("                to bottom, transparent 0 100px,\n");
      out.write("                #25283b22 100px 101px\n");
      out.write("            );\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        body::before{\n");
      out.write("            position: absolute;\n");
      out.write("            width: min(1400px, 90vw);\n");
      out.write("            top: 10%;\n");
      out.write("            left: 50%;\n");
      out.write("            height: 90%;\n");
      out.write("            transform: translateX(-50%);\n");
      out.write("            content: '';\n");
      out.write("            background-image: url(images/bg.png);\n");
      out.write("            background-size: 100%;\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            background-position: top center;\n");
      out.write("            pointer-events: none;\n");
      out.write("        }.banner{\n");
      out.write("    width: 100%;\n");
      out.write("    height: 100vh;\n");
      out.write("    text-align: center;\n");
      out.write("    overflow: hidden;\n");
      out.write("    position: relative;\n");
      out.write("}\n");
      out.write(".banner .slider{\n");
      out.write("    position: absolute;\n");
      out.write("    width: 200px;\n");
      out.write("    height: 250px;\n");
      out.write("    top: 10%;\n");
      out.write("    left: calc(50% - 100px);\n");
      out.write("    transform-style: preserve-3d;\n");
      out.write("    transform: perspective(1000px);\n");
      out.write("    animation: autoRun 20s linear infinite;\n");
      out.write("    z-index: 2;\n");
      out.write("}\n");
      out.write("@keyframes autoRun{\n");
      out.write("    from{\n");
      out.write("        transform: perspective(1000px) rotateX(-16deg) rotateY(0deg);\n");
      out.write("    }to{\n");
      out.write("        transform: perspective(1000px) rotateX(-16deg) rotateY(360deg);\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".banner .slider .item{\n");
      out.write("    position: absolute;\n");
      out.write("    inset: 0 0 0 0;\n");
      out.write("    transform: \n");
      out.write("        rotateY(calc( (var(--position) - 1) * (360 / var(--quantity)) * 1deg))\n");
      out.write("        translateZ(550px);\n");
      out.write("}\n");
      out.write(".banner .slider .item img{\n");
      out.write("    width: 100%;\n");
      out.write("    height: 100%;\n");
      out.write("    object-fit: cover;\n");
      out.write("}\n");
      out.write(".banner .content{\n");
      out.write("    position: absolute;\n");
      out.write("    bottom: 0;\n");
      out.write("    left: 50%;\n");
      out.write("    transform: translateX(-50%);\n");
      out.write("    width: min(1400px, 100vw);\n");
      out.write("    height: max-content;\n");
      out.write("    padding-bottom: 100px;\n");
      out.write("    display: flex;\n");
      out.write("    flex-wrap: wrap;\n");
      out.write("    justify-content: space-between;\n");
      out.write("    align-items: center;\n");
      out.write("    z-index: 1;\n");
      out.write("}\n");
      out.write(".banner .content h1{\n");
      out.write("    font-family: 'ICA Rubrik';\n");
      out.write("    font-size: 16em;\n");
      out.write("    line-height: 1em;\n");
      out.write("    color: #25283B;\n");
      out.write("    position: relative;\n");
      out.write("}\n");
      out.write(".banner .content h1::after{\n");
      out.write("    position: absolute;\n");
      out.write("    inset: 0 0 0 0;\n");
      out.write("    content: attr(data-content);\n");
      out.write("    z-index: 2;\n");
      out.write("    -webkit-text-stroke: 2px #d2d2d2;\n");
      out.write("    color: transparent;\n");
      out.write("}\n");
      out.write(".banner .content .author{\n");
      out.write("    font-family: Poppins;\n");
      out.write("    text-align: right;\n");
      out.write("    max-width: 200px;\n");
      out.write("}\n");
      out.write(".banner .content h2{\n");
      out.write("    font-size: 3em;\n");
      out.write("}\n");
      out.write(".banner .content .model{\n");
      out.write("    background-image: url(images/model.png);\n");
      out.write("    width: 100%;\n");
      out.write("    height: 75vh;\n");
      out.write("    position: absolute;\n");
      out.write("    bottom: 0;\n");
      out.write("    left: 0;\n");
      out.write("    background-size: auto 130%;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-position: top center;\n");
      out.write("    z-index: 1;\n");
      out.write("}\n");
      out.write("@media screen and (max-width: 1023px) {\n");
      out.write("    .banner .slider{\n");
      out.write("        width: 160px;\n");
      out.write("        height: 200px;\n");
      out.write("        left: calc(50% - 80px);\n");
      out.write("    }\n");
      out.write("    .banner .slider .item{\n");
      out.write("        transform: \n");
      out.write("            rotateY(calc( (var(--position) - 1) * (360 / var(--quantity)) * 1deg))\n");
      out.write("            translateZ(300px);\n");
      out.write("    }\n");
      out.write("    .banner .content h1{\n");
      out.write("        text-align: center;\n");
      out.write("        width: 100%;\n");
      out.write("        text-shadow: 0 10px 20px #000;\n");
      out.write("        font-size: 7em;\n");
      out.write("    }\n");
      out.write("    .banner .content .author{\n");
      out.write("        color: #fff;\n");
      out.write("        padding: 20px;\n");
      out.write("        text-shadow: 0 10px 20px #000;\n");
      out.write("        z-index: 2;\n");
      out.write("        max-width: unset;\n");
      out.write("        width: 100%;\n");
      out.write("        text-align: center;\n");
      out.write("        padding: 0 30px;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("@media screen and (max-width: 767px) {\n");
      out.write("    .banner .slider{\n");
      out.write("        width: 100px;\n");
      out.write("        height: 150px;\n");
      out.write("        left: calc(50% - 50px);\n");
      out.write("    }\n");
      out.write("    .banner .slider .item{\n");
      out.write("        transform: \n");
      out.write("            rotateY(calc( (var(--position) - 1) * (360 / var(--quantity)) * 1deg))\n");
      out.write("            translateZ(180px);\n");
      out.write("    }\n");
      out.write("    .banner .content h1{\n");
      out.write("        font-size: 5em;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"banner\">\n");
      out.write("        <div class=\"slider\" style=\"--quantity: 10\">\n");
      out.write("            <div class=\"item\" style=\"--position: 1\"><img src=\"images/dragon_1.jpg\" alt=\"\"></div>\n");
      out.write("            <div class=\"item\" style=\"--position: 2\"><img src=\"images/dragon_2.jpg\" alt=\"\"></div>\n");
      out.write("            <div class=\"item\" style=\"--position: 3\"><img src=\"images/dragon_3.jpg\" alt=\"\"></div>\n");
      out.write("            <div class=\"item\" style=\"--position: 4\"><img src=\"images/dragon_4.jpg\" alt=\"\"></div>\n");
      out.write("            <div class=\"item\" style=\"--position: 5\"><img src=\"images/dragon_5.jpg\" alt=\"\"></div>\n");
      out.write("            <div class=\"item\" style=\"--position: 6\"><img src=\"images/dragon_6.jpg\" alt=\"\"></div>\n");
      out.write("            <div class=\"item\" style=\"--position: 7\"><img src=\"images/dragon_7.jpg\" alt=\"\"></div>\n");
      out.write("            <div class=\"item\" style=\"--position: 8\"><img src=\"images/dragon_8.jpg\" alt=\"\"></div>\n");
      out.write("            <div class=\"item\" style=\"--position: 9\"><img src=\"images/dragon_9.jpg\" alt=\"\"></div>\n");
      out.write("            <div class=\"item\" style=\"--position: 10\"><img src=\"images/dragon_10.jpg\" alt=\"\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <h1 data-content=\"CSS ONLY\">\n");
      out.write("                CSS ONLY\n");
      out.write("            </h1>\n");
      out.write("            <div class=\"author\">\n");
      out.write("                <h2>LUN DEV</h2>\n");
      out.write("                <p><b>Web Design</b></p>\n");
      out.write("                <p>\n");
      out.write("                    Subscribe to the channel to watch many interesting videos\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"model\"></div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
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
