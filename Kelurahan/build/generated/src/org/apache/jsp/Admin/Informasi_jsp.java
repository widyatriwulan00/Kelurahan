package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Informasi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                        <h3 style=\"margin-left: 0; margin-bottom: 20px;\">Data Informasi</h3>\n");
      out.write("                        <a class=\"btn-table\" style=\"max-width: 150px; text-align: center;\" href=\"index.php?halaman=tambah_informasi\">Tambah Informasi</a>\n");
      out.write("                        <table border=\"1px\" width=\"100%\" cellspacing=\"0\" cellpadding=\"5px\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th>No</th>\n");
      out.write("                                <th>Judul</th>\n");
      out.write("                                <th>Gambar</th>\n");
      out.write("                                <th>Tgl Post</th>\n");
      out.write("                                <th>Post By</th>\n");
      out.write("                                <th>Aksi</th>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td align=\"center\">1. </td>\n");
      out.write("                                <td>Pembagian Sembako di Kantor Wali Nagari Padang Lua</td>\n");
      out.write("                                <td align=\"center\">Foto</td>\n");
      out.write("                                <td align=\"center\">29-Sep-2017</td>\n");
      out.write("                                <td align=\"center\">Admin</td>\n");
      out.write("                                <td align=\"center\"><a class=\"btn-table\" href=\"\">Hapus</a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <?php $n++; } ?>\n");
      out.write("                        </table>\n");
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
