<%-- 
    Document   : Login
    Created on : Nov 14, 2019, 7:47:25 PM
    Author     : Windows 10
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistem Administrasi Kelurahan Sukaramai</title>
        <link href="../Template/Style.css" rel="stylesheet" type="text/css"/>
        <script>
            function visibility()
            {
                var x = document.getElementById("password");
                if (x.type === "password")
                    x.type = "text";
                else
                    x.type = "password";
            }
        </script>
    </head>
    <body>
        <div class="container">
            <jsp:include page="../Template/Header.jsp"/>
            <div class="section">
                <jsp:include page="../Template/Menu.jsp"/>
                <div class="center">
                    <div class="content">
                        <h3 style="margin: 0;">Login</h3><br>
                        <form action="../OlahLogin" method="POST">
                            <table>
                                <tr>
                                    <td><input type="text" name="nik" placeholder="Nomor Induk Kependudukan" required></td>
                                </tr>
                                <tr>
                                    <td><input type="password" style="width: 83%;  margin-bottom: 10px;    padding-left: 0;
                                               padding-top: 5px;    padding-bottom: 5px;    padding-right: 0;" name="password" id="password" placeholder="Password" required>
                                        <input type="button" onclick="visibility()" value="Lihat"></td>
                                </tr>
                                <tr>
                                    <td><input type="submit" value="Login"></td>
                                </tr>
                                <tr>
                                    <td><a href="SignUp.jsp">Belum Punya Akun?</a> | 
                                        <a href="../Interface/index.jsp">Kembali ke Halaman Utama</a></td>
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
