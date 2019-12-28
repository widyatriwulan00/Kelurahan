<%-- 
    Document   : SignUpPNS
    Created on : Nov 14, 2019, 8:06:19 PM
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
            function visibility(y)
            {
                if (y === 1)
                    var x = document.getElementById("password");
                else
                    var x = document.getElementById("verifikasi");
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
                        <h3 style="margin: 0;">Sign Up PNS</h3><br>
                        <form action="" method="POST">
                            <table>
                                <tr>
                                    <td><input type="text" name="nip" placeholder="Nomor Induk Pegawai" required></td>
                                </tr>
                                <tr>
                                    <td><input type="text" name="nama" placeholder="Nama Pegawai" required></td>
                                </tr>
                                <tr>
                                    <td><input type="password" style="width: 75%;  margin-bottom: 10px;    padding-left: 0;
                                               padding-top: 5px;    padding-bottom: 5px;    padding-right: 0;" name="password" id="password" placeholder="Password" required>
                                        <input type="button" onclick="visibility(1)" value="Lihat"></td>
                                </tr>
                                <tr>
                                    <td><input type="password" style="width: 75%;  margin-bottom: 10px;    padding-left: 0;
                                               padding-top: 5px;    padding-bottom: 5px;    padding-right: 0;" name="verifikasi" id="verifikasi" placeholder="Verifikasi Password" required>
                                        <input type="button" onclick="visibility(2)" value="Lihat"></td>
                                </tr>
                                <tr>
                                    <td><input type="submit" value="Sign Up"></td>
                                </tr>
                                <tr>
                                    <td><a href="LoginPNS.jsp">Sudah Punya Akun?</a></td>
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
