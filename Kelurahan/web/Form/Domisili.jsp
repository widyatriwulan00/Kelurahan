<%-- 
    Document   : Domisili
    Created on : Nov 14, 2019, 9:20:10 PM
    Author     : Windows 10
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
                        <h3 style="margin: 0;">Formulir Domisili</h3><br>
                        <form action="" method="POST">
                            <table>
                                <tr>
                                    <td>Nama</td>
                                    <td>:</td>
                                    <td><input type="text" name="nama" required></td>
                                </tr>
                                <tr>
                                    <td>Jenis Kelamin</td>
                                    <td>:</td>
                                    <td><input type="radio" name="kelamin" value="Laki-laki" checked>Laki-laki
                                        <input type="radio" name="kelamin" value="Perempuan">Perempuan</td>
                                </tr>
                                <tr>
                                    <td>Tempat, Tanggal Lahir</td>
                                    <td>:</td>
                                    <td><input type="text" style="width: 50%" name="tempat" required>, <input type="date" name="tanggal" required></td>
                                </tr>
                                <tr>
                                    <td>Warganegara</td>
                                    <td>:</td>
                                    <td><input type="text" name="warganegara" required></td>
                                </tr>
                                <tr>
                                    <td>Agama</td>
                                    <td>:</td>
                                    <td>
                                        <select name="agama">
                                            <option value="Islam">Islam</option>
                                            <option value="Hindu">Hindu</option>
                                            <option value="Buddha">Buddha</option>
                                            <option value="Kristen Protestan">Kristen Protestan</option>
                                            <option value="Katolik">Katolik</option>
                                            <option value="Kong Hu Cu">Kong Hu Cu</option>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Pekerjaan</td>
                                    <td>:</td>
                                    <td><input type="text" name="pekerjaan" required></td>
                                </tr>
                                <tr>
                                    <td>NIK</td>
                                    <td>:</td>
                                    <td><input type="text" name="nik" required></td>
                                </tr>
                                <tr>
                                    <td>Alamat</td>
                                    <td>:</td>
                                    <td><input type="text" name="alamat" required></td>
                                </tr>
                                <tr>
                                    <td colspan="3"><input type="submit" value="Kirim"></td>
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
