<%-- 
    Document   : index
    Created on : Nov 19, 2019, 9:57:33 AM
    Author     : Windows 10
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String nik=(String) session.getAttribute("nik");
%>
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
                        <h3 style="margin: 0;">Lokasi Kelurahan Sukaramai</h3><br>
                        <h3 style="margin: 0;">Informasi</h3>
                        <%
                            if (nik != null) {
                        %>
                        <table border="1px" width="100%" cellspacing="0" cellpadding="5px">
                            <tr>
                                <th>Pengajuan</th>
                                <th>Tanggal</th>
                                <th>Status</th>
                                <th>Catatan</th>
                            </tr>
                            <tr>
                                <td>Surat Kelahiran</td>
                                <td>17-Nov-2017</td>
                                <td>Diproses</td>
                                <td>Sedang melakukan pengecekan</td>
                            </tr>
                        </table>
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
