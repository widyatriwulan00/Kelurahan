<%-- 
    Document   : OlahLogin
    Created on : Nov 19, 2019, 12:39:25 PM
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
            String nik = (String)request.getParameter("nik");
            session.setAttribute("nik", nik);
        %>
    </body>
    <script>
        alert("Anda Telah Login!!");
        location.href="../Interface/index.jsp";
    </script>
</html>
