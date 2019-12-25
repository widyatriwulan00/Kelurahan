<%-- 
    Document   : Domisili
    Created on : Nov 14, 2019, 9:20:10 PM
    Author     : Windows 10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Domisili</title>
    </head>
    <body>
        <form action="" method="POST">
            <table>
                <tr>
                    <td>Nama</td>
                    <td>:</td>
                    <td><input type="text" name="nama" required></td>
                </tr>
                <tr>
                    <td>Jenis Kelamin</td>
                    <td>:</td>
                    <td><input type="radio" name="kelamin" value="Laki-laki" checked>Laki-laki
                        <input type="radio" name="kelamin" value="Perempuan">Perempuan</td>
                </tr>
                <tr>
                    <td>Tempat, Tanggal Lahir</td>
                    <td>:</td>
                    <td><input type="text" name="tempat" required>, <input type="date" name="tanggal" required></td>
                </tr>
                <tr>
                    <td>Warganegara</td>
                    <td>:</td>
                    <td><input type="text" name="warganegara" required></td>
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
                            <option value="Kong Hu Cu">Kong Hu Cu</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Pekerjaan</td>
                    <td>:</td>
                    <td><input type="text" name="pekerjaan" required></td>
                </tr>
                <tr>
                    <td>NIK</td>
                    <td>:</td>
                    <td><input type="text" name="nik" required></td>
                </tr>
                <tr>
                    <td>Alamat</td>
                    <td>:</td>
                    <td><input type="text" name="alamat" required></td>
                </tr>
                <tr>
                    <td colspan="3"><input type="submit"></td>
                </tr>
            </table>
        </form>
    </body>
</html>