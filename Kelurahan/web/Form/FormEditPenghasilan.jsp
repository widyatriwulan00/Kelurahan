<%-- 
    Document   : FormEditPenghasilan
    Created on : Dec 28, 2019, 7:08:06 PM
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
                        <h3 style="margin: 0;">Edit Formulir Penghasilan</h3><br>
                        <form action="" method="POST">
                            <table>
                                 <tr>
                                    <td>NIK</td>
                                    <td>:</td>
                                    <td><input type="text" name="nik" required></td>
                                </tr>
                             
                                    <td>Nama Usaha</td>
                                    <td>:</td>
                                    <td><input type="text" name="usaha" required></td>
                                </tr>
                                <tr>
                                    <td>Penghasilan</td>
                                    <td>:</td>
                                    <td>Rp <input type="number" name="penghasilan" min="500000" required></td>
                                </tr>
                                <tr>
                                    <td colspan="3"><input type="submit" value="Edit"></td>
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

