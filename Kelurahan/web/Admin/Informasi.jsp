<%-- 
    Document   : Informasi
    Created on : Nov 19, 2019, 9:16:35 PM
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
                        <h3 style="margin-left: 0; margin-bottom: 20px;">Data Informasi</h3>
                        <a class="btn-table" style="max-width: 150px; text-align: center;" href="">Tambah Informasi</a>
                        <table border="1px" width="100%" cellspacing="0" cellpadding="5px">
                            <tr>
                                <th>No</th>
                                <th>Judul</th>
                                <th>Gambar</th>
                                <th>Tgl Post</th>
                                <th>Post By</th>
                                <th>Aksi</th>
                            </tr>
                            <tr>
                                <td align="center">1. </td>
                                <td>Pembagian Sembako di Kantor Lurah</td>
                                <td align="center">Foto</td>
                                <td align="center">29-Sep-2017</td>
                                <td align="center">Admin</td>
                                <td align="center"><a class="btn-table" href="">Hapus</a></td>
                            </tr>
                            <?php $n++; } ?>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="../Template/Footer.jsp"/>
    </body>
</html>
