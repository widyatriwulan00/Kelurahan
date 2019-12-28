package org.apache.jsp.Form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FormEditKematian_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                        <h3 style=\"margin: 0;\">Edit Formulir Kematian</h3><br>\n");
      out.write("                        <form action=\"\" method=\"POST\">\n");
      out.write("                            <table>\n");
      out.write("                                \n");
      out.write("                                <tr>\n");
      out.write("                                    <th colspan=\"4\">SURAT KETERANGAN KELAHIRAN</th>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th colspan=\"4\">(WARGA NEGARA INDONESIA)</th>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <th colspan=\"4\" align=\"left\">JENAZAH</th>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>1. </td>\n");
      out.write("                                    <td>NIK</td>\n");
      out.write("                                    <td>:</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"nikJenazah\" required></td>\n");
      out.write("                                </tr>\n");
      out.write("                         \n");
      out.write("                                <tr>\n");
      out.write("                                    <td>10. </td>\n");
      out.write("                                    <td>Tanggal kematian</td>\n");
      out.write("                                    <td>:</td>\n");
      out.write("                                    <td><input type=\"date\" name=\"tglKematian\" required></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>11. </td>\n");
      out.write("                                    <td>Pukul</td>\n");
      out.write("                                    <td>:</td>\n");
      out.write("                                    <td><input type=\"number\" name=\"jam\" min=\"0\" max=\"23\" required>\n");
      out.write("                                        <input type=\"number\" name=\"menit\" min=\"0\" max=\"59\" required></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>12. </td>\n");
      out.write("                                    <td>Sebab kematian</td>\n");
      out.write("                                    <td>:</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <select name=\"sebabKematian\">\n");
      out.write("                                            <option value=\"Sakit biasa / tua\">Sakit biasa / tua</option>\n");
      out.write("                                            <option value=\"Wabah Penyakit\">Wabah Penyakit</option>\n");
      out.write("                                            <option value=\"Kecelakaan\">Kecelakaan</option>\n");
      out.write("                                            <option value=\"Kriminalitas\">Kriminalitas</option>\n");
      out.write("                                            <option value=\"Bunuh Diri\">Bunuh Diri</option>\n");
      out.write("                                            <option value=\"Lainnya\">Lainnya</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>13. </td>\n");
      out.write("                                    <td>Tempat kematian</td>\n");
      out.write("                                    <td>:</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"tempatKematian\" required></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>14. </td>\n");
      out.write("                                    <td>Yang menerangkan</td>\n");
      out.write("                                    <td>:</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <select name=\"yangMenerangkan\">\n");
      out.write("                                            <option value=\"Dokter\">Dokter</option>\n");
      out.write("                                            <option value=\"Tenaga Kesehatan\">Tenaga Kesehatan</option>\n");
      out.write("                                            <option value=\"Kepolisian\">Kepolisian</option>\n");
      out.write("                                            <option value=\"Lainnya\">Lainnya</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>15 </td>\n");
      out.write("                                    <td>No KK</td>\n");
      out.write("                                    <td>:</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"nokk\" required></td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <th colspan=\"4\" align=\"left\">PELAPOR</th>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>1. </td>\n");
      out.write("                                    <td>NIK</td>\n");
      out.write("                                    <td>:</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"nikPelapor\" required></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th colspan=\"4\" align=\"left\">SAKSI I</th>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>1. </td>\n");
      out.write("                                    <td>NIK</td>\n");
      out.write("                                    <td>:</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"nikSaksi1\" required></td>\n");
      out.write("                                </tr>\n");
      out.write("                               \n");
      out.write("                                <tr>\n");
      out.write("                                    <th colspan=\"4\" align=\"left\">SAKSI II</th>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>1. </td>\n");
      out.write("                                    <td>NIK</td>\n");
      out.write("                                    <td>:</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"nikSaksi2\" required></td>\n");
      out.write("                                </tr>\n");
      out.write("                               \n");
      out.write("                                   \n");
      out.write("                                <tr>\n");
      out.write("                                    <td colspan=\"4\"><input type=\"submit\" value=\"Edit\"></td>\n");
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
