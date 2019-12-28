<%-- 
    Document   : SignUp
    Created on : Nov 14, 2019, 8:04:05 PM
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
                        <h3 style="margin: 0;">Sign Up</h3><br>
                        <form action="" method="POST">
                            <table>
                                <tr>
                                    <td>NIK</td>
                                    <td>:</td>
                                    <td><input type="text" name="nik" required></td>
                                </tr>
                                <tr>
                                    <td>Nama</td>
                                    <td>:</td>
                                    <td><input type="text" name="nama" required></td>
                                </tr>
                                <tr>
                                    <td>Tempat, Tanggal Lahir</td>
                                    <td>:</td>
                                    <td><input type="text" style="width: 50%" name="tempat" required>, <input type="date" name="tanggal" required></td>
                                </tr>
                                <tr>
                                    <td>Jenis Kelamin</td>
                                    <td>:</td>
                                    <td><input type="radio" name="kelamin" value="Laki-laki" checked>Laki-laki
                                        <input type="radio" name="kelamin" value="Perempuan">Perempuan</td>
                                </tr>
                                <tr>
                                    <td>Alamat</td>
                                    <td>:</td>
                                    <td><input type="text" name="alamat" required></td>
                                </tr>
                                <tr>
                                    <td>Agama</td>
                                    <td>:</td>
                                    <td>
                                        <select name="agama">
                                            <option value="Islam">Islam</option>
                                            <option value="Hindu">Hindu</option>
                                            <option value="Buddha">Buddha</option>
                                            <option value="Kristen Protestan">Kristen Protestan</option>
                                            <option value="Katolik">Katolik</option>
                                            <option value="Lainnya">Lainnya</option>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Status</td>
                                    <td>:</td>
                                    <td>
                                        <select name="Status">
                                            <option value="Nikah">Nikah</option>
                                            <option value="Tidak Nikah">Tidak Nikah</option>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Pekerjaan</td>
                                    <td>:</td>
                                    <td><input type="text" name="pekerjaan" required></td>
                                </tr>
                                <tr>
                                    <td>RT/RW</td>
                                    <td>:</td>
                                    <td><input type="number" name="rt" min="1" max="999" value="1">/<input type="number" name="rw" min="1" max="999" value="1"></td>
                                </tr>
                                <tr>
                                    <td>Password</td>
                                    <td>:</td>
                                    <td><input type="password" style="width: 83%;  margin-bottom: 10px;    padding-left: 0;
                                               padding-top: 5px;    padding-bottom: 5px;    padding-right: 0;" name="password" id="password" required>
                                        <input type="button" onclick="visibility(1)" value="Lihat"></td>
                                </tr>
                                <tr>
                                    <td>Verifikasi</td>
                                    <td>:</td>
                                    <td><input type="password" style="width: 83%;  margin-bottom: 10px;    padding-left: 0;
                                               padding-top: 5px;    padding-bottom: 5px;    padding-right: 0;" name="verifikasi" id="verifikasi" required>
                                        <input type="button" onclick="visibility(2)" value="Lihat"></td>
                                </tr>
                                <tr>
                                    <td colspan="3"><input type="submit" value="Sign Up"></td>
                                </tr>
                                <tr>
                                    <td colspan="3"><a href="Login.jsp">Sudah Punya Akun?</a> | 
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
