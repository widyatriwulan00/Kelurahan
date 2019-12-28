<%-- 
    Document   : VisiMisi
    Created on : Nov 19, 2019, 10:12:54 AM
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
                        <h3 style="margin: 0;">Visi dan Misi Kelurahan Sukaramai</h3><br>
                        <p>Visi : </p>
                        <ol>
                            Mewujudkan Pelayanan Terbaik Kepada Masyarakat Kelurahan Sukaramai dan Peningkatan Manajemen Pelayanan Prima dan Pembangunan Partisipatif.
                        </ol>
                        <p>Misi : </p>
                        <ol>
                            <li>Meningkatkan Kapabilitas dan Kompetensi Aparatur</li>
                            <li>Memberikan Pelayanan Prima Kepada Masyarakat</li>
                            <li>Penguatan Kelembagaan Organisasi Kemasyarakatan</li>
                            <li>Meningkatkan Peran Serta Masyarakat Dalam Pembangunan</li>
                        </ol>
                        <p>Motto : </p>
                        <ol style="font-weight:bold;">
                            " Kepuasan Masyarakat Adalah Harapan Kami "
                        </ol>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="../Template/Footer.jsp"/>
    </body>
</html>
