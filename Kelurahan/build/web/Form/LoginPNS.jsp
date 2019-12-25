<%-- 
    Document   : LoginPNS
    Created on : Nov 14, 2019, 8:02:07 PM
    Author     : Windows 10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script>
        function visibility()
        {
            var x=document.getElementById("password");
            if(x.type==="password") x.type="text";
            else    x.type="password";
        }
        </script>
        <title>Login Pegawai Negeri Sipil</title>
    </head>
    <body>
        <form action="" method="POST">
            <table>
                <tr>
                    <td><input type="text" name="nip" placeholder="Nomor Induk Pegawai" required></td>
                </tr>
                <tr>
                    <td><input type="password" name="password" id="password" placeholder="Password" required>
                        <input type="button" onclick="visibility()" value="Lihat"></td>
                </tr>
                <tr>
                    <td><input type="submit"></td>
                </tr>
                <tr>
                    <td><a href="SignUpPNS.jsp">Belum Punya Akun?</a></td>
                </tr>
            </table>
        </form>
    </body>
</html>
