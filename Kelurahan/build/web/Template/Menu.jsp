<%-- 
    Document   : Menu
    Created on : Nov 19, 2019, 10:37:47 AM
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
        <title>JSP Page</title>
    </head>
    <body>
        <div class="left">
            <div class="menu">
                <%
                    if (nik != null) {
                %>
                <h3 style="margin:0 0 10px 0;">Active</h3>
                NIK : <b><%=nik%></b><br>
                Nama : <b>Ricko Adrianto</b><br>
                <%
                } else if (nip != null) {
                %>
                <h3 style="margin:0 0 10px 0;">Active</h3>
                NIP : <b><%=nip%></b><br>
                Nama : <b>Admin</b><br>
                <%
                    }
                %>
            </div>

            <div class="menu">
                <%
                    if (nip != null) {
                %>
                <h3 style="margin:0 0 10px 0;">Menu Admin</h3>
                <ul>
                    <li><a href="../Admin/Informasi.jsp">Informasi</a></li>
                    <li><a href="../Admin/DataPengguna.jsp">Data Pengguna</a></li>
                    <li><a href="../Admin/DataPengajuan.jsp">Data Pengajuan</a></li>
                    <li><a href="../Admin/DataPenduduk.jsp">Data Penduduk</a></li>
                    <li><a href="../Admin/DataPNS.jsp">Data PNS</a></li>
                    <li><a href="../Admin/InfoData.jsp">Info Data</a></li>
                    <li><a href="../Form/PesanPNS.jsp">Pesan</a></li>
                </ul>
                <%
                } else {
                %>
                <h3 style="margin:0 0 10px 0;">Formulir Layanan</h3>
                <ul>
                    <li><a href="../Form/Domisili.jsp">Formulir Domisili</a></li>
                    <li><a href="../Form/Kelahiran.jsp">Formulir Kelahiran</a></li>
                    <li><a href="../Form/Kematian.jsp">Formulir Kematian</a></li>
                    <li><a href="../Form/Penghasilan.jsp">Formulir Penghasilan</a></li>
                    <li><a href="../Form/Usaha.jsp">Formulir Usaha</a></li>
                </ul>
                <%
                    }
                %>
            </div>

            <div class="menu">
                <h3 style="margin: 0;">Surat Pengajuan Disetujui</h3>
                Surat Pengajuan yang telah disetujui dapat dijemput ke kantor lurah
                <hr>
                <h5 style="margin: 0;"></h5>
                <p></p>
            </div>
        </div>
    </body>
</html>
