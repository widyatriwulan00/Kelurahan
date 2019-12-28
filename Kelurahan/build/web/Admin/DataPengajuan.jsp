<%-- 
    Document   : DataPengajuan
    Created on : Nov 19, 2019, 9:16:55 PM
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
                        <h3 style="margin-left: 0; margin-bottom: 20px;">Data Pengajuan</h3>
                        <table border="1px" width="100%" cellspacing="0" cellpadding="5px">
                            <tr>
                                <th>No</th>
                                <th>Nama</th>
                                <th>Pengajuan</th>
                                <th>Tanggal</th>
                                <th>Status</th>
                                <th>Catatan</th>
                                <th>Aksi</th>
                            </tr>
                            <tr>
                                <td align="center">1.</td>
                                <td>Ricko Adrianto</td>
                                <td>Surat Kelahiran</td>
                                <td>17-Nov-2017</td>
                                <td>Diproses</td>
                                <td>Sedang melakukan pengecekan</td>
                                <td align="center"><a class="btn-table" href="">Tolak</a>
                                <a class="btn-table" href="">Selesai</a></td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="../Template/Footer.jsp"/>
    </body>
</html>
