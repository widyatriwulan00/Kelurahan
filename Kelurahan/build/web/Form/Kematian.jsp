<%-- 
    Document   : Kematian
    Created on : Nov 14, 2019, 9:20:54 PM
    Author     : Windows 10
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
                        <h3 style="margin: 0;">Formulir Kematian</h3><br>
                        <form action="" method="POST">
                            <table>
                                <tr>
                                    <td colspan="2">Pemerintahan Kelurahan</td>
                                    <td>:</td>
                                    <td><input type="text" name="kelurahan" required></td>
                                </tr>
                                <tr>
                                    <td colspan="2">Kecamatan</td>
                                    <td>:</td>
                                    <td><input type="text" name="kecamatan"></td>
                                </tr>
                                <tr>
                                    <td colspan="2">Kabupaten/Kota</td>
                                    <td>:</td>
                                    <td><input type="text" name="kota"></td>
                                </tr>
                                <tr>
                                    <td colspan="2">Kode Wilayah</td>
                                    <td>:</td>
                                    <td><input type="text" name="kodeWilayah"></td>
                                </tr>
                                <tr>
                                    <th colspan="4">SURAT KETERANGAN KELAHIRAN</th>
                                </tr>
                                <tr>
                                    <th colspan="4">(WARGA NEGARA INDONESIA)</th>
                                </tr>
                                <tr>
                                    <td colspan="2">Nama Kepala Keluarga</td>
                                    <td>:</td>
                                    <td><input type="text" name="namaKepala"></td>
                                </tr>
                                <tr>
                                    <td colspan="2">Nomor Kartu Keluarga</td>
                                    <td>:</td>
                                    <td><input type="text" name="kk"></td>
                                </tr>


                                <tr>
                                    <th colspan="4" align="left">JENAZAH</th>
                                </tr>
                                <tr>
                                    <td>1. </td>
                                    <td>NIK</td>
                                    <td>:</td>
                                    <td><input type="text" name="nikJenazah" required></td>
                                </tr>
                                <tr>
                                    <td>2. </td>
                                    <td>Nama lengkap</td>
                                    <td>:</td>
                                    <td><input type="text" name="namaJenazah" required></td>
                                </tr>
                                <tr>
                                    <td>3. </td>
                                    <td>Jenis kelamin</td>
                                    <td>:</td>
                                    <td><input type="radio" name="kelaminJenazah" value="Laki-laki" checked>Laki-laki
                                        <input type="radio" name="kelaminJenazah" value="Perempuan">Perempuan</td>
                                </tr>
                                <tr>
                                    <td>4. </td>
                                    <td>Tanggal Lahir / Umur</td>
                                    <td>:</td>
                                    <td><input type="date" name="tglLahir" required>, Umur <input type="number" name="umurJenazah" min="1" required></td>
                                </tr>
                                <tr>
                                    <td>5. </td>
                                    <td>Tempat lahir</td>
                                    <td>:</td>
                                    <td><input type="text" name="tempatLahir" required></td>
                                </tr>
                                <tr>
                                    <td>6. </td>
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
                                    <td>7. </td>
                                    <td>Pekerjaan</td>
                                    <td>:</td>
                                    <td><input type="text" name="pekerjaanJenazah" required></td>
                                </tr>
                                <tr>
                                    <td>8. </td>
                                    <td>Alamat</td>
                                    <td>:</td>
                                    <td><input type="text" name="alamatJenazah" required><br>
                                        <table>
                                            <tr>
                                                <td>a.</td><td>Kelurahan</td><td><input type="text" name="kelurahanJenazah" required></td>
                                                <td>c.</td><td>Kab/Kota</td><td><input type="text" name="kotaJenazah" required></td>
                                            </tr>
                                            <tr>
                                                <td>b.</td><td>Kecamatan</td><td><input type="text" name="kecamatanJenazah" required></td>
                                                <td>d.</td><td>Provinsi</td><td><input type="text" name="provinsiJenazah" required></td>
                                            </tr>
                                        </table>
                                    </td>
                                </tr>
                                <tr>
                                    <td>9. </td>
                                    <td>Anak ke</td>
                                    <td>:</td>
                                    <td><input type="number" name="ke" min="1" required></td>
                                </tr>
                                <tr>
                                    <td>10. </td>
                                    <td>Tanggal kematian</td>
                                    <td>:</td>
                                    <td><input type="date" name="tglKematian" required></td>
                                </tr>
                                <tr>
                                    <td>11. </td>
                                    <td>Pukul</td>
                                    <td>:</td>
                                    <td><input type="number" name="jam" min="0" max="23" required>
                                        <input type="number" name="menit" min="0" max="59" required></td>
                                </tr>
                                <tr>
                                    <td>12. </td>
                                    <td>Sebab kematian</td>
                                    <td>:</td>
                                    <td>
                                        <select name="sebabKematian">
                                            <option value="Sakit biasa / tua">Sakit biasa / tua</option>
                                            <option value="Wabah Penyakit">Wabah Penyakit</option>
                                            <option value="Kecelakaan">Kecelakaan</option>
                                            <option value="Kriminalitas">Kriminalitas</option>
                                            <option value="Bunuh Diri">Bunuh Diri</option>
                                            <option value="Lainnya">Lainnya</option>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <td>13. </td>
                                    <td>Tempat kematian</td>
                                    <td>:</td>
                                    <td><input type="text" name="tempatKematian" required></td>
                                </tr>
                                <tr>
                                    <td>14. </td>
                                    <td>Yang menerangkan</td>
                                    <td>:</td>
                                    <td>
                                        <select name="yangMenerangkan">
                                            <option value="Dokter">Dokter</option>
                                            <option value="Tenaga Kesehatan">Tenaga Kesehatan</option>
                                            <option value="Kepolisian">Kepolisian</option>
                                            <option value="Lainnya">Lainnya</option>
                                        </select>
                                    </td>
                                </tr>


                                <tr>
                                    <th colspan="4" align="left">IBU</th>
                                </tr>
                                <tr>
                                    <td>1. </td>
                                    <td>NIK</td>
                                    <td>:</td>
                                    <td><input type="text" name="nikIbu" required></td>
                                </tr>
                                <tr>
                                    <td>2. </td>
                                    <td>Nama lengkap</td>
                                    <td>:</td>
                                    <td><input type="text" name="namaIbu" required></td>
                                </tr>
                                <tr>
                                    <td>3. </td>
                                    <td>Tanggal Lahir / Umur</td>
                                    <td>:</td>
                                    <td><input type="date" name="tglIbu" required>, Umur <input type="number" name="umurIbu" min="10" required></td>
                                </tr>
                                <tr>
                                    <td>4. </td>
                                    <td>Pekerjaan</td>
                                    <td>:</td>
                                    <td><input type="text" name="pekerjaanIbu" required></td>
                                </tr>
                                <tr>
                                    <td>5. </td>
                                    <td>Alamat</td>
                                    <td>:</td>
                                    <td><input type="text" name="alamatIbu" required><br>
                                        <table>
                                            <tr>
                                                <td>a.</td><td>Kelurahan</td><td><input type="text" name="kelurahanIbu" required></td>
                                                <td>c.</td><td>Kab/Kota</td><td><input type="text" name="kotaIbu" required></td>
                                            </tr>
                                            <tr>
                                                <td>b.</td><td>Kecamatan</td><td><input type="text" name="kecamatanIbu" required></td>
                                                <td>d.</td><td>Provinsi</td><td><input type="text" name="provinsiIbu" required></td>
                                            </tr>
                                        </table>
                                    </td>
                                </tr>


                                <tr>
                                    <th colspan="4" align="left">AYAH</th>
                                </tr>
                                <tr>
                                    <td>1. </td>
                                    <td>NIK</td>
                                    <td>:</td>
                                    <td><input type="text" name="nikAyah" required></td>
                                </tr>
                                <tr>
                                    <td>2. </td>
                                    <td>Nama lengkap</td>
                                    <td>:</td>
                                    <td><input type="text" name="namaAyah" required></td>
                                </tr>
                                <tr>
                                    <td>3. </td>
                                    <td>Tanggal Lahir / Umur</td>
                                    <td>:</td>
                                    <td><input type="date" name="tglAyah" required>, Umur <input type="number" name="umurAyah" min="10" required></td>
                                </tr>
                                <tr>
                                    <td>4. </td>
                                    <td>Pekerjaan</td>
                                    <td>:</td>
                                    <td><input type="text" name="pekerjaanAyah" required></td>
                                </tr>
                                <tr>
                                    <td>5. </td>
                                    <td>Alamat</td>
                                    <td>:</td>
                                    <td><input type="text" name="alamatAyah" required><br>
                                        <table>
                                            <tr>
                                                <td>a.</td><td>Kelurahan</td><td><input type="text" name="kelurahanAyah" required></td>
                                                <td>c.</td><td>Kab/Kota</td><td><input type="text" name="kotaAyah" required></td>
                                            </tr>
                                            <tr>
                                                <td>b.</td><td>Kecamatan</td><td><input type="text" name="kecamatanAyah" required></td>
                                                <td>d.</td><td>Provinsi</td><td><input type="text" name="provinsiAyah" required></td>
                                            </tr>
                                        </table>
                                    </td>
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
                                    <td>2. </td>
                                    <td>Nama lengkap</td>
                                    <td>:</td>
                                    <td><input type="text" name="namaPelapor" required></td>
                                </tr>
                                <tr>
                                    <td>3. </td>
                                    <td>Tanggal Lahir / Umur</td>
                                    <td>:</td>
                                    <td><input type="date" name="tglPelapor">, <input type="number" name="umurPelapor" min="10" required> Tahun</td>
                                </tr>
                                <tr>
                                    <td>4. </td>
                                    <td>Pekerjaan</td>
                                    <td>:</td>
                                    <td><input type="text" name="pekerjaanPelapor" required></td>
                                </tr>
                                <tr>
                                    <td>5. </td>
                                    <td>Alamat</td>
                                    <td>:</td>
                                    <td><input type="text" name="alamatPelapor" required><br>
                                        <table>
                                            <tr>
                                                <td>a.</td><td>Kelurahan</td><td><input type="text" name="kelurahanPelapor" required></td>
                                                <td>c.</td><td>Kab/Kota</td><td><input type="text" name="kotaPelapor" required></td>
                                            </tr>
                                            <tr>
                                                <td>b.</td><td>Kecamatan</td><td><input type="text" name="kecamatanPelapor" required></td>
                                                <td>d.</td><td>Provinsi</td><td><input type="text" name="provinsiPelapor" required></td>
                                            </tr>
                                        </table>
                                    </td>
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
                                    <td>2. </td>
                                    <td>Nama lengkap</td>
                                    <td>:</td>
                                    <td><input type="text" name="namaSaksi1" required></td>
                                </tr>
                                <tr>
                                    <td>3. </td>
                                    <td>Tanggal Lahir / Umur</td>
                                    <td>:</td>
                                    <td><input type="date" name="tglSaksi1">, <input type="number" name="umurSaksi1" min="10" required> Tahun</td>
                                </tr>
                                <tr>
                                    <td>4. </td>
                                    <td>Pekerjaan</td>
                                    <td>:</td>
                                    <td><input type="text" name="pekerjaanSaksi1" required></td>
                                </tr>
                                <tr>
                                    <td>5. </td>
                                    <td>Alamat</td>
                                    <td>:</td>
                                    <td><input type="text" name="alamatSaksi1" required><br>
                                        <table>
                                            <tr>
                                                <td>a.</td><td>Kelurahan</td><td><input type="text" name="kelurahanSaksi1" required></td>
                                                <td>c.</td><td>Kab/Kota</td><td><input type="text" name="kotaSaksi1" required></td>
                                            </tr>
                                            <tr>
                                                <td>b.</td><td>Kecamatan</td><td><input type="text" name="kecamatanSaksi1" required></td>
                                                <td>d.</td><td>Provinsi</td><td><input type="text" name="provinsiSaksi1" required></td>
                                            </tr>
                                        </table>
                                    </td>
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
                                    <td>2. </td>
                                    <td>Nama lengkap</td>
                                    <td>:</td>
                                    <td><input type="text" name="namaSaksi2" required></td>
                                </tr>
                                <tr>
                                    <td>3. </td>
                                    <td>Tanggal Lahir / Umur</td>
                                    <td>:</td>
                                    <td><input type="date" name="tglSaksi2">, <input type="number" name="umurSaksi2" min="10" required> Tahun</td>
                                </tr>
                                <tr>
                                    <td>4. </td>
                                    <td>Pekerjaan</td>
                                    <td>:</td>
                                    <td><input type="text" name="pekerjaanSaksi2" required></td>
                                </tr>
                                <tr>
                                    <td>5. </td>
                                    <td>Alamat</td>
                                    <td>:</td>
                                    <td><input type="text" name="alamatSaksi2" required><br>
                                        <table>
                                            <tr>
                                                <td>a.</td><td>Kelurahan</td><td><input type="text" name="kelurahanSaksi2" required></td>
                                                <td>c.</td><td>Kab/Kota</td><td><input type="text" name="kotaSaksi2" required></td>
                                            </tr>
                                            <tr>
                                                <td>b.</td><td>Kecamatan</td><td><input type="text" name="kecamatanSaksi2" required></td>
                                                <td>d.</td><td>Provinsi</td><td><input type="text" name="provinsiSaksi2" required></td>
                                            </tr>
                                        </table>
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="4"><input type="submit" value="Kirim"></td>
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