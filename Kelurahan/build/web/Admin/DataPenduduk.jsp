<%-- 
    Document   : DataPenduduk
    Created on : Dec 28, 2019, 3:48:18 PM
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
                <div class="center" style="overflow: auto">
                    <div class="content">
                        <h3 style="margin-left: 0; margin-bottom: 20px;">Data Penduduk</h3>
                        <a class="btn-table" style="max-width: 150px; text-align: center;" href="../Form/TambahPenduduk.jsp">Tambah Penduduk</a>
                        <table border="1px" width="100%" cellspacing="0" cellpadding="5px">
                            <tr>
                                <th>NIK</th>
                                <th>No KK </th>
                                <th>Nama Lengkap</th>
                                <th>Jenis Kelamin</th>
                                <th>Tempat Lahir</th>
                                <th>Tanggal Lahir</th>
                                <th>Agama</th>
                                <th>Pendidikan</th>
                                <th>Pekerjaan</th>
                                <th>Status Pernikahan</th>
                                <th>Status HubunganKeluarga</th>
                                <th>Nama Ayah</th>
                                <th>Nama Ibu</th>
                                <th>Anak ke </th>
                                <th>Aksi</th>
                                
                            </tr>
                            <tr>
                                <td align="center">1471110811740001</td>
                                <td>1234556</td>
                                <td>Ricko Adrianto</td>
                                <th>Perempuan</th>
                                <th>Pekanbaru</th>
                                <th>25-03-2000</th>
                                <th>Budha</th>
                                <th>Siswi</th>
                                <th>Siswi</th>
                                <th>Belum Menikah</th>
                                <th>-</th>
                                <th>www</th>
                                <th>yy</th>
                                <th>1</th>
                                <td align="center"><a class="btn-table" href="../Form/EditPenduduk.jsp">Edit</a></td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="../Template/Footer.jsp"/>
    </body>
</html>

