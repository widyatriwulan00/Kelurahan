package org.apache.jsp.Form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TambahAkun_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sistem Administrasi Kelurahan Sukaramai</title>\n");
      out.write("        <link href=\"../Template/Style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("          <script>\n");
      out.write("            function visibility()\n");
      out.write("            {\n");
      out.write("                var x = document.getElementById(\"password\");\n");
      out.write("                if (x.type === \"password\")\n");
      out.write("                    x.type = \"text\";\n");
      out.write("                else\n");
      out.write("                    x.type = \"password\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Template/Header.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"section\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Template/Menu.jsp", out, false);
      out.write("\n");
      out.write("                <div class=\"center\">\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <h3 style=\"margin: 0;\">Tambah Akun</h3><br>\n");
      out.write("                        <form action=\"../DataPengguna\" method=\"POST\">\n");
      out.write("                            <table>\n");
      out.write("                                 <tr>\n");
      out.write("                                    <td colspan=\"2\">No. KK </td>\n");
      out.write("                                    <td>:</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"noKK\"  ></td>\n");
      out.write("                                 </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td colspan=\"2\">Password</td>\n");
      out.write("                                    <td>:</td>\n");
      out.write("                                    <td><input type=\"password\" style=\"width: 75%;  margin-bottom: 10px;    padding-left: 0;\n");
      out.write("                                               padding-top: 5px;    padding-bottom: 5px;    padding-right: 0;\" name=\"password\" id=\"password\"  required>\n");
      out.write("                                        <input type=\"button\" onclick=\"visibility()\" value=\"Lihat\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                                \n");
      out.write("                                <tr>\n");
      out.write("                                    <td colspan=\"2\">Nama </td>\n");
      out.write("                                    <td>:</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"nama\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td colspan=\"2\">No HP </td>\n");
      out.write("                                    <td>:</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"noHP\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td colspan=\"2\">Foto</td>\n");
      out.write("                                 </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><input type=\"file\" class=\"form-control\" name=\"foto\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                                    <td><input type=\"submit\" value=\"TambahAkun\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Template/Footer.jsp", out, false);
      out.write("\n");
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
