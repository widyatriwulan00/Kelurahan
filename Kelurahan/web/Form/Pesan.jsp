<%-- 
    Document   : Pesan
    Created on : Dec 28, 2019, 6:19:11 PM
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
                        <h3 style="margin: 0;"> Mengirim Pesan </h3><br>
                        <p>Jika anda merasa bingung, anda dapat mengirim pesan.</p>
     
                        <form action="" method="POST">
                            <table>
                                <tr>
                                    <td> Pesan </td>
                                    <td>:</td>
                                    <td><textarea rows="10"  name="pesan" id="pesan" placeholder="Isi Pesan"></textarea></td>
                                </tr>
                                 <tr>
                                    <td><input type="submit" value="Kirim Pesan"></td>
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

