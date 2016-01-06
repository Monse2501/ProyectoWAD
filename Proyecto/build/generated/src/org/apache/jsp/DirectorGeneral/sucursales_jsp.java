package org.apache.jsp.DirectorGeneral;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sucursales_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Principal</title>\n");
      out.write("        <link href=\"../css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("        <script src=\"../js/jquery.min.js\"></script>\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <link href=\"../css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <!---- start-smoth-scrolling---->\n");
      out.write("        <script type=\"text/javascript\" src=\"../js/move-top.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"../js/easing.js\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("                jQuery(document).ready(function($) {\n");
      out.write("                $(\".scroll\").click(function (event) {\n");
      out.write("                    event.preventDefault();\n");
      out.write("                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!---- start-smoth-scrolling---->\n");
      out.write("        <!----webfonts--->\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic,700italic|Oswald:400,300' rel='stylesheet' type='text/css'>\n");
      out.write("        <!---//webfonts--->\n");
      out.write("        <!----start-top-nav-script---->\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                var pull = $('#pull');\n");
      out.write("                menu = $('nav ul');\n");
      out.write("                menuHeight = menu.height();\n");
      out.write("                $(pull).on('click', function (e) {\n");
      out.write("                    e.preventDefault();\n");
      out.write("                    menu.slideToggle();\n");
      out.write("                });\n");
      out.write("                $(window).resize(function () {\n");
      out.write("                    var w = $(window).width();\n");
      out.write("                    if (w > 320 && menu.is(':hidden')) {\n");
      out.write("                        menu.removeAttr('style');\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!----//End-top-nav-script---->\n");
      out.write("        <script src=\"../js/easyResponsiveTabs.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('#horizontalTab').easyResponsiveTabs({\n");
      out.write("                    type: 'default', //Types: default, vertical, accordion           \n");
      out.write("                    width: 'auto', //auto or any width like 600px\n");
      out.write("                    fit: true   // 100% fit in a container\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!----- start-header---->\n");
      out.write("        <div id=\"home\" class=\"header\">\n");
      out.write("            <div class=\"top-header\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"logo\">\n");
      out.write("                        <h1>BIENVENIDO</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <!----start-top-nav---->\n");
      out.write("                    <nav class=\"top-nav\">\n");
      out.write("                        <ul class=\"top-nav\">\n");
      out.write("                            <li class=\"active\"><a href=\"#home\" class=\"scroll\">Inicio</a></li>\n");
      out.write("                            <li><a href=\"sucursales.jsp\">Sucursales</a></li>\n");
      out.write("                            <li><a href=\"#services\">Managers</a></li>\n");
      out.write("                            <li><a href=\"#portfolio\">Reportes</a></li>\n");
      out.write("                            <li><a href=\"#contact\">Gráficas</a></li>\n");
      out.write("                            <li><a href=\"#contact\">Configuración</a></li>\n");
      out.write("                            <li><a href=\"#contact\">Cerrar sesión</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <a href=\"#\" id=\"pull\"><img src=\"../images/menu-icon.png\" title=\"menu\" /></a>\n");
      out.write("                    </nav>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!----- //End-header---->\n");
      out.write("\n");
      out.write("        <div class=\"Themes\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"feature-grids\">\n");
      out.write("                    <div class=\"col-md-4 feature-grid\">\n");
      out.write("                        <h3>Sucursales</h3>\n");
      out.write("                        <p>\n");
      out.write("                            Este tipo de usuario puede realizar varias operaciones, entre éstas están\n");
      out.write("                            alta, baja, cambios y consultas sobre las sucursales con las cuales va a contar\n");
      out.write("                            la cadena de cine, ingresando su dirección.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-md-4 feature-grid\">\n");
      out.write("                        <h3>Managers</h3>\n");
      out.write("                        <p>\n");
      out.write("                            Puede realizar las operaciones correspondientes a los managers\n");
      out.write("                            de cada una de las sucursales para que éstos lleven la administración\n");
      out.write("                            por separado y organicen a sus empleados y las películas que se presentarán.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 feature-grid\">\n");
      out.write("                        <h3>Administración</h3>\n");
      out.write("                        <p>\n");
      out.write("                            Para llevar a cabo sus tareas puede utilizar herramientas como reportes o\n");
      out.write("                            gráficas para facilitar el manejo de información y obtener estadísticas\n");
      out.write("                            de las sucursales o managers que administra.s\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"> </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"> </div>\n");
      out.write("        </div>\n");
      out.write("        <!---//End-da-features----->\t\n");
      out.write("        <!--- portfolio ---->\n");
      out.write("        <div id=\"portfolio\" class=\"portfolio\">\n");
      out.write("            <div id=\"contact\" class=\"footer\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"col-md-4 footer-grid footer-grid1\">\n");
      out.write("                        <div class=\"f-bout\">\n");
      out.write("                            <h4>Contáctanos</h4>\n");
      out.write("                                 <h5>Correo:</h5>\n");
      out.write("                            <h6><a href=\"mailto:alitamonse@hotmail.com\">alitamonse@hotmail.com</a></h6>\n");
      out.write("                            <h6><a href=\"mailto:max300394@hotmail.com\">max300394@hotmail.com</a></h6>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 footer-grid footer-grid3\">\n");
      out.write("                        <div class=\"recent-tweet\">\n");
      out.write("                            <h4>Síguenos en...</h4>\n");
      out.write("                            <div class=\"social\">\t\n");
      out.write("                                <ul>\t\n");
      out.write("                                    <li><a href=\"#\"><span class=\"alo-icon\"> </span></a></li>\n");
      out.write("                                    <li><a href=\"#\"> <span class=\"fb-icon\"> </span></a></li>\t\n");
      out.write("                                    <li><a href=\"#\">  <span class=\"t-icon\"> </span></li>\n");
      out.write("                                    <li><a href=\"#\"><span class=\"in-icon\"> </span></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"clearfix\"> </div>\t\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"> </div>\t\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"bottom\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"copy-right\">\n");
      out.write("                        <p>Copyright &copy; 3CV2. All Rights Reserved . Design by Monse Chimal & Max Vázquez</p>\n");
      out.write("                    </div>\t\t\t\t\t\t\t\t\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                    <script type=\"text/javascript\">\n");
      out.write("                        $(document).ready(function () {\n");
      out.write("                            /*\n");
      out.write("                             var defaults = {\n");
      out.write("                             containerID: 'toTop', // fading element id\n");
      out.write("                             containerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("                             scrollSpeed: 1200,\n");
      out.write("                             easingType: 'linear' \n");
      out.write("                             };\n");
      out.write("                             */\n");
      out.write("\n");
      out.write("                            $().UItoTop({easingType: 'easeOutQuart'});\n");
      out.write("\n");
      out.write("                        });\n");
      out.write("                    </script>\n");
      out.write("                    <a href=\"#\" id=\"toTop\" style=\"display: block;\"> <span id=\"toTopHover\" style=\"opacity: 1;\"> </span></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
