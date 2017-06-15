<%-- 
    Document   : Register
    Created on : Jun 15, 2017, 3:05:00 PM
    Author     : Hp i3 Geforce
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
            String[] DataLogin = (String[]) session.getAttribute("DataLogin");
            ArrayList<MataKuliah> list = (ArrayList<MataKuliah>) session.getAttribute("mtkList");
            MethodMahasiswa mhs = (MethodMahasiswa) session.getAttribute("dataMhs");

            Mahasiswa_Control m = new Mahasiswa_Control();
            int username = Integer.parseInt(DataLogin[0]);
        %>  
    </body>
</html>
