<%-- 
    Document   : EditAkunPNS
    Created on : Dec 28, 2019, 5:56:43 PM
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
                        <h3 style="margin: 0;">Edit Akun PNS</h3><br>
                        <form action="../Admin/DataPNS.jsp" method="POST">
                            <table>
                                 <tr>
                                    <td colspan="2">NIP</td>
                                    <td>:</td>
                                    <td><input type="text" name="noKK"  ></td>
                                 </tr>
                                <tr>
                                    <td colspan="2">Password</td>
                                    <td>:</td>
                                    <td><input type="password" style="width: 75%;  margin-bottom: 10px;    padding-left: 0;
                                               padding-top: 5px;    padding-bottom: 5px;    padding-right: 0;" name="password" id="password"  required>
                                        <input type="button" onclick="visibility()" value="Lihat"></td>
                                </tr>
                                
                                <tr>
                                    <td colspan="2">Nama </td>
                                    <td>:</td>
                                    <td><input type="text" name="nama"></td>
                                </tr>
                               <tr>
                                   <td colspan="2">Jabatan</td>
                                    <td>:</td>
                                    <td>
                                        <select name="jabatan">
                                            <option value="PNS1">PNS1</option>
                                            <option value="PNS2">PNS2</option>
                                            <option value="PNS3">PNS3</option>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <td><input type="submit" value="Edit"></td>
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