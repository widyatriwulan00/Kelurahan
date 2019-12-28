<%-- 
    Document   : EditPenduduk
    Created on : Dec 28, 2019, 4:44:30 PM
    Author     : Widya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistem Administrasi Kelurahan Sukaramai</title>
        <link href="../Template/Style.css" rel="stylesheet" type="text/css"/>
          <script>
            function visibility()
            {
                var x = document.getElementById("password");
                if (x.type === "password")
                    x.type = "text";
                else
                    x.type = "password";
            }
        </script>
    </head>
    <body>
        <div class="container">
            <jsp:include page="../Template/Header.jsp"/>
            <div class="section">
                <jsp:include page="../Template/Menu.jsp"/>
                <div class="center">
                    <div class="content">
                        <h3 style="margin: 0;">Edit Penduduk</h3><br>
                        <form action="../Admin/DataPenduduk.jsp" method="POST">
                            <table>
                                <tr>
                                    <td colspan="2">NIK </td>
                                    <td>:</td>
                                    <td><input type="text" name="nik"  ></td>
                                 </tr>
                                 <tr>
                                    <td colspan="2">No. KK </td>
                                    <td>:</td>
                                    <td><input type="text" name="no_kk"  ></td>
                                 </tr>
                                <tr>
                                    <td colspan="2">Nama </td>
                                    <td>:</td>
                                    <td><input type="text" name="nama_penduduk"></td>
                                </tr>
                                <tr>
                                    <td colspan="2">Jenis Kelamin </td>
                                    <td>:</td>
                                    <td><input type="text" name="jenis_kelamin"></td>
                                </tr>
                                <tr>
                                    <td colspan="2">Tempat Lahir</td>
                                    <td>:</td>
                                    <td><input type="text" name="tempat_lahir"></td>
                                </tr>
                                <tr>
                                    <td colspan="2">Tanggal Lahir</td>
                                    <td>:</td>
                                    <td><input type="Date" name="tanggal_lahir"></td>
                                </tr>
                                <tr>
                                    <td colspan="2">Agama</td>
                                    <td>:</td>
                                    <td><input type="text" name="agama"></td>
                                </tr>
                                <tr>
                                    <td colspan="2">Pendidikan</td>
                                    <td>:</td>
                                    <td><input type="text" name="pendidikan"></td>
                                </tr>
                                <tr>
                                    <td colspan="2">Pekerjaan</td>
                                    <td>:</td>
                                    <td><input type="text" name="pekerjaan"></td>
                                </tr>
                                <tr>
                                    <td colspan="2">Status Pernikahan</td>
                                    <td>:</td>
                                    <td><input type="text" name="status_pernikahan"></td>
                                </tr>
                                <tr>
                                    <td colspan="2">Status Hubungan Keluarga</td>
                                    <td>:</td>
                                    <td><input type="text" name="status_hub_kel"></td>
                                </tr>
                                <tr>
                                    <td colspan="2">Nama Ayah</td>
                                    <td>:</td>
                                    <td><input type="text" name="nama_ayah"></td>
                                </tr>
                                <tr>
                                    <td colspan="2">Nama Ibu</td>
                                    <td>:</td>
                                    <td><input type="text" name="nama_ibu"></td>
                                </tr>
                                <tr>
                                    <td colspan="2">Anak Ke- </td>
                                    <td>:</td>
                                    <td><input type="text" name="anak_ke"></td>
                                </tr>
                                    <td><input type="submit" value="Edit"></td>
                                </tr>
                            </table>
                        </form>
                        
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="../Template/Footer.jsp"/>
    </body>
</html>
