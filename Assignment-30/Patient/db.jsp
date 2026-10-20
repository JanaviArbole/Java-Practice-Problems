<%@ page import="java.sql.*" %>
<%
    String url = "jdbc:mysql://localhost:3306/hospitalDB";
    String user = "root";
    String password = "Anvi@1234";

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(url, user, password);
%>
