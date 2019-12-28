package org.apache.jsp.Form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Penghasilan_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sistem Administrasi Kelurahan Sukaramai</title>\n");
      out.write("        <link href=\"../Template/Style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("                        ");

                            String nik = (String) session.getAttribute("nik");
                            if (nik != null) {
                        
      out.write("\n");
      out.write("                        <h3 style=\"margin: 0;\">Formulir Penghasilan</h3><br>\n");
      out.write("                        <form action=\"\" method=\"POST\">\n");
      out.write("                            <table>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Nama</td>\n");
      out.write("                                    <td>:</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"nama\" required></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Jenis Kelamin</td>\n");
      out.write("                                    <td>:</td>\n");
      out.write("                                    <td><input type=\"radio\" name=\"kelamin\" value=\"Laki-laki\" checked>Laki-laki\n");
      out.write("                                        <input type=\"radio\" name=\"kelamin\" value=\"Perempuan\">Perempuan</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Tempat, Tanggal Lahir</td>\n");
      out.write("                                    <td>:</td>\n");
      out.write("                                    <td><input type=\"text\" style=\"width: 50%\" name=\"tempat\" required>, <input type=\"date\" name=\"tanggal\" required></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Warganegara</td>\n");
      out.write("                                    <td>:</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"warganegara\" required></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Agama</td>\n");
      out.write("                                    <td>:</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <select name=\"agama\">\n");
      out.write("                                            <option value=\"Islam\">Islam</option>\n");
      out.write("                                            <option value=\"Hindu\">Hindu</option>\n");
      out.write("                                            <option value=\"Buddha\">Buddha</option>\n");
      out.write("                                            <option value=\"Kristen Protestan\">Kristen Protestan</option>\n");
      out.write("                                            <option value=\"Katolik\">Katolik</option>\n");
      out.write("                                            <option value=\"Kong Hu Cu\">Kong Hu Cu</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Pekerjaan</td>\n");
      out.write("                                    <td>:</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"pekerjaan\" required></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>No. KTP</td>\n");
      out.write("                                    <td>:</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"ktp\" required></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Alamat</td>\n");
      out.write("                                    <td>:</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"alamat\" required></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Nama Usaha</td>\n");
      out.write("                                    <td>:</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"usaha\" required></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Penghasilan</td>\n");
      out.write("                                    <td>:</td>\n");
      out.write("                                    <td>Rp <input type=\"number\" name=\"penghasilan\" min=\"500000\" required></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td colspan=\"3\"><input type=\"submit\" value=\"Kirim\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </form>\n");
      out.write("                        ");

                        } else {
                        
      out.write("\n");
      out.write("                        <h3 style=\"margin: 0;\">Silahkan Login terlebih dahulu.</h3>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
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
