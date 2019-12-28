<%-- 
    Document   : OlahLoginPNS
    Created on : Nov 19, 2019, 9:24:27 PM
    Author     : Windows 10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String nip = (String)request.getParameter("nip");
            session.setAttribute("nip", nip);
        %>
    </body>
    <script>
        alert("Anda Telah Login!!");
        location.href="../Admin/Informasi.jsp";
    </script>
</html>
