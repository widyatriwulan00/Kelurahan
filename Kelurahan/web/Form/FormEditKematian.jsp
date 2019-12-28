<%-- 
    Document   : FormEditKematian
    Created on : Dec 28, 2019, 7:07:46 PM
    Author     : Widya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistem Administrasi Kelurahan Sukaramai</title>
        <link href="../Template/Style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <jsp:include page="../Template/Header.jsp"/>
            <div class="section">
                <jsp:include page="../Template/Menu.jsp"/>
                <div class="center">
                    <div class="content">
                        <%
                            String nik = (String) session.getAttribute("nik");
                            if (nik != null) {
                        %>
                        <h3 style="margin: 0;">Edit Formulir Kematian</h3><br>
                        <form action="" method="POST">
                            <table>
                                
                                <tr>
                                    <th colspan="4">SURAT KETERANGAN KELAHIRAN</th>
                                </tr>
                                <tr>
                                    <th colspan="4">(WARGA NEGARA INDONESIA)</th>
                                </tr>

                                <tr>
                                    <th colspan="4" align="left">JENAZAH</th>
                                </tr>
                                <tr>
                                    <td>1. </td>
                                    <td>NIK</td>
                                    <td>:</td>
                                    <td><input type="text" name="nikJenazah" required></td>
                                </tr>
                         
                                <tr>
                                    <td>10. </td>
                                    <td>Tanggal kematian</td>
                                    <td>:</td>
                                    <td><input type="date" name="tglKematian" required></td>
                                </tr>
                                <tr>
                                    <td>11. </td>
                                    <td>Pukul</td>
                                    <td>:</td>
                                    <td><input type="number" name="jam" min="0" max="23" required>
                                        <input type="number" name="menit" min="0" max="59" required></td>
                                </tr>
                                <tr>
                                    <td>12. </td>
                                    <td>Sebab kematian</td>
                                    <td>:</td>
                                    <td>
                                        <select name="sebabKematian">
                                            <option value="Sakit biasa / tua">Sakit biasa / tua</option>
                                            <option value="Wabah Penyakit">Wabah Penyakit</option>
                                            <option value="Kecelakaan">Kecelakaan</option>
                                            <option value="Kriminalitas">Kriminalitas</option>
                                            <option value="Bunuh Diri">Bunuh Diri</option>
                                            <option value="Lainnya">Lainnya</option>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <td>13. </td>
                                    <td>Tempat kematian</td>
                                    <td>:</td>
                                    <td><input type="text" name="tempatKematian" required></td>
                                </tr>
                                <tr>
                                    <td>14. </td>
                                    <td>Yang menerangkan</td>
                                    <td>:</td>
                                    <td>
                                        <select name="yangMenerangkan">
                                            <option value="Dokter">Dokter</option>
                                            <option value="Tenaga Kesehatan">Tenaga Kesehatan</option>
                                            <option value="Kepolisian">Kepolisian</option>
                                            <option value="Lainnya">Lainnya</option>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <td>15 </td>
                                    <td>No KK</td>
                                    <td>:</td>
                                    <td><input type="text" name="nokk" required></td>
                                </tr>


                                <tr>
                                    <th colspan="4" align="left">PELAPOR</th>
                                </tr>
                                <tr>
                                    <td>1. </td>
                                    <td>NIK</td>
                                    <td>:</td>
                                    <td><input type="text" name="nikPelapor" required></td>
                                </tr>
                                <tr>
                                    <th colspan="4" align="left">SAKSI I</th>
                                </tr>
                                <tr>
                                    <td>1. </td>
                                    <td>NIK</td>
                                    <td>:</td>
                                    <td><input type="text" name="nikSaksi1" required></td>
                                </tr>
                               
                                <tr>
                                    <th colspan="4" align="left">SAKSI II</th>
                                </tr>
                                <tr>
                                    <td>1. </td>
                                    <td>NIK</td>
                                    <td>:</td>
                                    <td><input type="text" name="nikSaksi2" required></td>
                                </tr>
                               
                                   
                                <tr>
                                    <td colspan="4"><input type="submit" value="Edit"></td>
                                </tr>
                            </table>
                        </form>
                        <%
                        } else {
                        %>
                        <h3 style="margin: 0;">Silahkan Login terlebih dahulu.</h3>
                        <%
                            }
                        %>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="../Template/Footer.jsp"/>
    </body>
</html>