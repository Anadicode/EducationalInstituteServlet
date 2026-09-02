<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
 <%@ page import="java.util.List" %>
 <%@ page import="Model.Batch" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


  <%
    List<Batch> batchs =
         (List<Batch>) request.getAttribute("batchs");

    for (var e : batchs) {
%>

       <span><%= e.getBName() %></span>
       <span><%= e.getBId() %></span>
       <span><%= e.getBStatus() %></span>
       <form action="<%= application.getContextPath() %>/batch" method="post">
        <input type="hidden" name="delete" value="<%= e.getBId() %>">
        <input type="submit" value="change status">
      </form>
       <br>

<%
    }
%>

</body>
</html>