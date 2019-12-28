<%-- 
    Document   : Footer
    Created on : Nov 19, 2019, 10:25:16 AM
    Author     : Windows 10
--%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.*"%>
<%
    SimpleDateFormat formatter = new SimpleDateFormat("YYYY");
    Date d=new Date();
    String tahun=formatter.format(d);
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../Template/Style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="footer"><i><center>Copyright &copy; Kelurahan Sukaramai - <%=tahun%> All Right Reserved</center></i></div>
    </body>
</html>
