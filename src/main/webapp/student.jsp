<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ page import="java.util.List" %>
 <%@ page import="Model.Student" %>
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <%
    List<Student> students =
         (List<Student>) request.getAttribute("students");

    for (Student e : students) {
  %>

       <span><%= e.getName() %></span>
       <span>|<%=  e.getAddressString() %></span>
       <span>|<%=  e.getId() %></span>
       <form action="<%= application.getContextPath() %>/student" method="post">
        <input type="hidden" name="delete" value="<%= e.getId() %>">
        <input type="submit" value="Delete">
      </form>


       <br>

<%
    }
%>
  


</body>
</html>