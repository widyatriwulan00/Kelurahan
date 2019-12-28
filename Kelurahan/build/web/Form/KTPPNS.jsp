<%-- 
    Document   : KTP
    Created on : Nov 14, 2019, 9:00:46 PM
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
                        <h3 style="margin: 0;">Input Kartu Tanda Penduduk</h3><br>
                        <form action="" method="POST">
            <table>
                <tr>
                    <td><input type="text" name="nik" placeholder="Nomor Induk Kependudukan"></td>
                </tr>
                <tr>
                    <td><input type="text" name="nama" placeholder="Nama"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Selesai Diproses"></td>
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
