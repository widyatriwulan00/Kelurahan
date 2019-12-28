<%-- 
    Document   : FormEditKelahiran
    Created on : Dec 28, 2019, 7:03:41 PM
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
                        <h3 style="margin: 0;">Edit Formulir Kelahiran</h3><br>
                        <form action="" method="POST">
                            <table>
          
                                <tr>
                                    <th colspan="4" align="left">BAYI / ANAK</th>
                                </tr>
                                <tr>
                                    <td>1. </td>
                                    <td>Nama</td>
                                    <td>:</td>
                                    <td><input type="text" name="namaBayi" required></td>
                                </tr>
                                <tr>
                                    <td>2. </td>
                                    <td>Jenis kelamin</td>
                                    <td>:</td>
                                    <td><input type="radio" name="kelaminBayi" value="Laki-laki" checked>Laki-laki
                                        <input type="radio" name="kelaminBayi" value="Perempuan">Perempuan</td>
                                </tr>
                                <tr>
                                    <td>3. </td>
                                    <td>Tempat dilahirkan</td>
                                    <td>:</td>
                                    <td>
                                        <select name="dilahirkan">
                                            <option value="RS/RB">RS/RB</option>
                                            <option value="Puskesmas">Puskesmas</option>
                                            <option value="Polindes">Polindes</option>
                                            <option value="Rumah">Rumah</option>
                                            <option value="Lainnya">Lainnya</option>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <td>4. </td>
                                    <td>Tempat kelahiran</td>
                                    <td>:</td>
                                    <td><input type="text" name="kelahiran" required></td>
                                </tr>
                                <tr>
                                    <td>5. </td>
                                    <td>Hari dan Tanggal lahir</td>
                                    <td>:</td>
                                    <td>
                                        Hari
                                        <select name="hari" style="width: 30%">
                                            <option value="Minggu">Minggu</option>
                                            <option value="Senin">Senin</option>
                                            <option value="Selasa">Selasa</option>
                                            <option value="Rabu">Rabu</option>
                                            <option value="Kamis">Kamis</option>
                                            <option value="Jum'at">Jum'at</option>
                                            <option value="Sabtu">Sabtu</option>
                                        </select>
                                        Tanggal
                                        <input type="date" name="tglBayi">
                                    </td>    
                                </tr>
                                <tr>
                                    <td>6. </td>
                                    <td>Pukul</td>
                                    <td>:</td>
                                    <td><input type="number" name="jam" min="0" max="23" required> :
                                        <input type="number" name="menit" min="0" max="59" required></td>
                                </tr>
                                <tr>
                                    <td>7. </td>
                                    <td>Jenis kelahiran</td>
                                    <td>:</td>
                                    <td>
                                        <select name="jenisKelahiran">
                                            <option value="Tunggal">Tunggal</option>
                                            <option value="Kembar 2">Kembar 2</option>
                                            <option value="Kembar 3">Kembar 3</option>
                                            <option value="Kembar 4">Kembar 4</option>
                                            <option value="Lainnya">Lainnya</option>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <td>8. </td>
                                    <td>Kelahiran ke</td>
                                    <td>:</td>
                                    <td><input type="number" style="width:50%" name="ke" min="1" required></td>
                                </tr>
                                <tr>
                                    <td>9. </td>
                                    <td>Penolong kelahiran</td>
                                    <td>:</td>
                                    <td>
                                        <select name="penolong">
                                            <option value="Dokter">Dokter</option>
                                            <option value="Bidan / Perawat">Bidan / Perawat</option>
                                            <option value="Dukun">Dukun</option>
                                            <option value="Lainnya">Lainnya</option>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <td>10. </td>
                                    <td>Berat bayi</td>
                                    <td>:</td>
                                    <td><input type="number" style="width:15%" name="berat" min="1" step="0.01" required> Kg</td>
                                </tr>
                                <tr>
                                    <td>11. </td>
                                    <td>Panjang bayi</td>
                                    <td>:</td>
                                    <td><input type="number" style="width:15%" name="panjang" min="1" required> cm</td>
                                </tr>


  
                                <tr>
                                    <th colspan="4" align="left">PELAPOR</th>
                                </tr>
                                <tr>
                                    <td>1. </td>
                                    <td>NIK</td>
                                    <td>:</td>
                                    <td><input type="text" name="nikPelapor" required></td>
                                </tr>

                                <tr>
                                    <th colspan="4" align="left">SAKSI I</th>
                                </tr>
                                <tr>
                                    <td>1. </td>
                                    <td>NIK</td>
                                    <td>:</td>
                                    <td><input type="text" name="nikSaksi1" required></td>
                                </tr>
                              
                                <tr>
                                    <th colspan="4" align="left">SAKSI II</th>
                                </tr>
                                <tr>
                                    <td>1. </td>
                                    <td>NIK</td>
                                    <td>:</td>
                                    <td><input type="text" name="nikSaksi2" required></td>
                                </tr>
                                <tr>
                                    <td colspan="4"><input type="submit" value="Edit"></td>
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