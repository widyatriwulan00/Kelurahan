<%-- 
    Document   : EditAkun
    Created on : Dec 28, 2019, 4:44:41 PM
    Author     : Widya
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
                        <h3 style="margin: 0;">Edit Akun</h3><br>
                        <form action="../Admin/DataPengguna" method="POST">
                            <table>
                                 <tr>
                                    <td colspan="2">No. KK </td>
                                    <td>:</td>
                                    <td><input type="text" name="noKK"  ></td>
                                 </tr>
                                <tr>
                                    <td colspan="2">Password lama</td>
                                    <td>:</td>
                                    <td><input type="password" style="width: 75%;  margin-bottom: 10px;    padding-left: 0;
                                               padding-top: 5px;    padding-bottom: 5px;    padding-right: 0;" name="password" id="password"  required>
                                        <input type="button" onclick="visibility()" value="Lihat"></td>
                                </tr>
                                <tr>
                                    <td colspan="2">Password Baru</td>
                                    <td>:</td>
                                    <td><input type="password" style="width: 75%;  margin-bottom: 10px;    padding-left: 0;
                                               padding-top: 5px;    padding-bottom: 5px;    padding-right: 0;" name="passwordB" id="password"  required>
                                        <input type="button" onclick="visibility()" value="Lihat"></td>
                                </tr>
                                <tr>
                                    <td colspan="2">Nama </td>
                                    <td>:</td>
                                    <td><input type="text" name="nama"></td>
                                </tr>
                                <tr>
                                    <td colspan="2">No HP </td>
                                    <td>:</td>
                                    <td><input type="text" name="noHP"></td>
                                </tr>
                                <tr>
                                    <td colspan="2">Foto</td>
                                 </tr>
                                <tr>
                                    <td><input type="file" class="form-control" name="foto"></td>
                                </tr>
                                    <td><input type="submit" value="Edit Akun"></td>
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
