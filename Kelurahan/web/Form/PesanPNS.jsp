<%-- 
    Document   : PesanPNS
    Created on : Dec 28, 2019, 6:20:02 PM
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
                        <h3 style="margin-left: 0; margin-bottom: 20px;">Pesan Masuk </h3>
                       
                        <table border="1px" width="100%" cellspacing="0" cellpadding="5px">
                            <tr>
                                <th>NIK</th>
                                <th>Nama Lengkap</th>
                                <th>Isi Pesan</th>
                                <th>Aksi</th>
                            </tr>
                            <tr>
                                <td align="center">1471110811740001</td>
                                <td>Ricko Adrianto</td>
                                <td>Bagaimana buat akun???</td>
                                <td align="center"><a class="btn-table" href="">Balas</a></td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="../Template/Footer.jsp"/>
    </body>
</html>


