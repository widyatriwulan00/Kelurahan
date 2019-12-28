<%-- 
    Document   : Kelahiran
    Created on : Nov 14, 2019, 9:20:46 PM
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
                        <h3 style="margin: 0;">Formulir Kelahiran</h3><br>
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
                                    <td><input type="date" name="tglIbu" required>, Umur <input type="number" width="15%" name="umurIbu" min="10" required></td>
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
                                    <td>6. </td>
                                    <td>Kewarganegaraan</td>
                                    <td>:</td>
                                    <td><input type="radio" name="kewarganegaraanIbu" value="WNI" checked>WNI
                                        <input type="radio" name="kewarganegaraanIbu" value="WNA">WNA</td>
                                </tr>
                                <tr>
                                    <td>7. </td>
                                    <td>Kebangsaan</td>
                                    <td>:</td>
                                    <td><input type="text" name="kebangsaanIbu" required></td>
                                </tr>
                                <tr>
                                    <td>8. </td>
                                    <td>Tgl Pencatatan Perkawinan</td>
                                    <td>:</td>
                                    <td><input type="date" name="tglKawin"></td>
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
                                    <td><input type="date" name="tglAyah" required>, Umur <input type="number" width="15%" name="umurAyah" min="10" required></td>
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
                                    <td>6. </td>
                                    <td>Kewarganegaraan</td>
                                    <td>:</td>
                                    <td><input type="radio" name="kewarganegaraanAyah" value="WNI" checked>WNI
                                        <input type="radio" name="kewarganegaraanAyah" value="WNA">WNA</td>
                                </tr>
                                <tr>
                                    <td>7. </td>
                                    <td>Kebangsaan</td>
                                    <td>:</td>
                                    <td><input type="text" name="kebangsaanAyah" required></td>
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
                                    <td>Umur</td>
                                    <td>:</td>
                                    <td><input type="number" width="15%" name="umurPelapor" min="10" required> Tahun</td>
                                </tr>
                                <tr>
                                    <td>4. </td>
                                    <td>Jenis Kelamin</td>
                                    <td>:</td>
                                    <td><input type="radio" name="kelaminPelapor" value="Laki-laki">Laki-laki
                                        <input type="radio" name="kelaminPelapor" value="Perempuan">Perempuan</td>
                                </tr>
                                <tr>
                                    <td>5. </td>
                                    <td>Pekerjaan</td>
                                    <td>:</td>
                                    <td><input type="text" name="pekerjaanPelapor" required></td>
                                </tr>
                                <tr>
                                    <td>6. </td>
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
                                    <td>Umur</td>
                                    <td>:</td>
                                    <td><input type="number" width="15%" name="umurSaksi1" min="10" required> Tahun</td>
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
                                    <td>Umur</td>
                                    <td>:</td>
                                    <td><input type="number" width="15%" name="umurSaksi2" min="10" required> Tahun</td>
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