<%-- 
    Document   : DataPNS
    Created on : Dec 28, 2019, 5:52:03 PM
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
                        <h3 style="margin-left: 0; margin-bottom: 20px;">Data PNS</h3>
                        <a class="btn-table" style="max-width: 150px; text-align: center;" href="../Form/TambahAkunPNS.jsp">Tambah Akun</a>
                        <table border="1px" width="100%" cellspacing="0" cellpadding="5px">
                            <tr>
                                <th>NIP</th>
                                <th>Nama </th>
                                <th>Jabatan</th>
                                <th>Password</th>
                                <th>Edit</th>
                            </tr>
                            <tr>
                                <td align="center">1471110811740001</td>
                                <td>Ricko Adrianto</td>
                                <td>PNS1</td>
                                <td>123</td>
                                <td align="center"><a class="btn-table" href="../Form/EditAkunPNS.jsp">Edit</a></td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="../Template/Footer.jsp"/>
    </body>
</html>
