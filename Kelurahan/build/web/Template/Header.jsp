<%-- 
    Document   : Header
    Created on : Nov 19, 2019, 10:07:09 AM
    Author     : Windows 10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String nik = (String) session.getAttribute("nik");
    String nip = (String) session.getAttribute("nip");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Style.css" rel="stylesheet" type="text/css"/>
        <title>Sistem Administrasi Kelurahan Sukaramai</title>
    </head>
    <body>
        <div class="header">
            <br>
            <h1>Sistem Administrasi Kelurahan Sukaramai</h1>
            <h2><small></small></h2>
        </div>
        <div class="nav">
            <%
                if (nip == null) {
            %>
            <ul>
                <li><a href="../Interface/index.jsp">Beranda</a></li>
                <li><a href="../Interface/Profil.jsp">Profil</a></li>
                <li><a href="../Interface/VisiMisi.jsp">Visi & Misi</a></li>
                <li><a href="../Interface/Pesan.jsp">Bantuan</a></li>
                <li class="dropdown">
                    <a href="javascript:void(0)" class="dropbtn">Formulir Layanan</a>
                    <div class="dropdown-content">
                        <a href="../Form/Domisili.jsp">Formulir Domisili</a>
                        <a href="../Form/Kelahiran.jsp">Formulir Kelahiran</a>
                        <a href="../Form/Kematian.jsp">Formulir Kematian</a>
                        <a href="../Form/Penghasilan.jsp">Formulir Penghasilan</a>
                        <a href="../Form/Usaha.jsp">Formulir Usaha</a>
                    </div>
                </li>

                <li><a href="../Interface/Pencarian.jsp">Pencarian</a></li>
                    <%
                        }
                    %>
                    <%if (nip==null && nik == null) {
                    %>
                <li style="float: right;margin-right: 15px;
                    font-size: 15px;
                    border: 2px solid #e7e7e7;
                    border-radius: 2px;
                    margin-top:2.5px;">
                    <a href="../Form/SignUp.jsp" style="padding-top:10px;padding-bottom:10px">Daftar</a></li>

                <li style="float: right;
                    font-size: 15px;
                    border: 2px solid #e7e7e7;
                    border-radius: 2px;
                    margin-top:2.5px;
                    margin-right:10px;">
                    <a href="../Form/Login.jsp" style="padding-top:10px;padding-bottom:10px">Masuk</a></li>
                    <%
                    } else {
                    %>
                <ul><li style="float: right;"><a href="../Fungsi/Logout.jsp">Logout</a></li></ul>
                    <%
                        }
                    %>
            </ul>
        </div>
    </body>
</html>
