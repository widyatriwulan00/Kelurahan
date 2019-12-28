<%-- 
    Document   : Pencarian
    Created on : Nov 19, 2019, 10:54:56 AM
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
            function search()
            {
                var nik = document.getElementById("nik");
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
                        <h3 style="margin: 0;">Pencarian Kelurahan Sukaramai</h3><br>
                        <input type="text" style="width:50%" id="nik" placeholder="Masukkan NIK">
                        <input type="button" onclick="search()" value="Cari">
                        <br><br>
                        <h3 style="margin: 0;">Kartu Keluarga</h3><br>
                        <table border="1" style="width:100%">
                            <tr>
                                <th style="width:40%">Nomor Induk Kependudukan</th>
                                <th style="width:30%">Nama</th>
                                <th style="width:30%">Status</th>
                            </tr>
                            <tr>
                                <td>3171080411020002</td>
                                <td>Hilman Aditya Fachrezy</td>
                                <td>Sudah Bisa Diambil</td>
                            </tr>
                        </table>
                        <br><br>
                        <h3 style="margin: 0;">Kartu Tanda Penduduk</h3><br>
                        <table border="1" style="width:100%">
                            <tr>
                                <th style="width:40%">Nomor Induk Kependudukan</th>
                                <th style="width:30%">Nama</th>
                                <th style="width:30%">Status</th>
                            </tr>
                            <tr>
                                <td>1401080411020002</td>
                                <td>Ricko Adrianto</td>
                                <td>Sudah Bisa Diambil</td>
                            </tr>
                        </table>
                        <br>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="../Template/Footer.jsp"/>
    </body>
</html>

<!--
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.Statement;
        import java.sql.ResultSet;
        import java.sql.SQLException;
        import java.util.ArrayList;
       
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
       
        String dbUrl="jdbc:derby://localhost:1527/Kelurahan";
        String pwd="root";
        String login="root";
        String sql="";
       
        try
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con=DriverManager.getConnection(dbUrl, login, pwd);
            st=con.createStatement();
            rs=st.executeQuery(sql);
           
            while/if(rs.next())
            {
           
            }
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
        finally
        {
            try
            {
                rs.close();
                st.close();
                con.clearWarnings();
                return ;
            }
            catch(SQLException e){
                e.printStackTrace();
                return ;
            }
        }
-->
</body>
</html>
