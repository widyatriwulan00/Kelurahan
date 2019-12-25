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
        <script>
        function visibility(y)
        {
            if(y===1)   var x=document.getElementById("password");
            else        var x=document.getElementById("verifikasi");
            if(x.type==="password") x.type="text";
            else    x.type="password";
        }
        </script>
        <title>Sign Up Pegawai Negeri Sipil</title>
    </head>
    <body>
        <form action="" method="POST">
            <table>
                <tr>
                    <td><input type="text" name="nip" placeholder="Nomor Induk Pegawai" required></td>
                </tr>
                <tr>
                    <td><input type="text" name="nama" placeholder="Nama Pegawai" required></td>
                </tr>
                <tr>
                    <td><input type="password" name="password" id="password" placeholder="Password" required>
                        <input type="button" onclick="visibility(1)" value="Lihat"></td>
                </tr>
                <tr>
                    <td><input type="password" name="verifikasi" id="verifikasi" placeholder="Verifikasi Password" required>
                        <input type="button" onclick="visibility(2)" value="Lihat"></td>
                </tr>
                <tr>
                    <td><input type="submit"></td>
                </tr>
                <tr>
                    <td><a href="LoginPNS.jsp">Sudah Punya Akun?</a></td>
                </tr>
            </table>
        </form>
    </body>
</html>