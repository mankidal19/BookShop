<%-- 
    Document   : viewBookList
    Created on : Dec 12, 2017, 9:11:52 AM
    Author     : PCUSER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <title>Book List</title>
 </head>
 
 <frameset rows="*" cols="220,*" frameborder="NO" border="0" framespacing="0">
  <frame src="leftFrame.jsp" name="leftFrame" scrolling="auto" noresize>
 
  <frameset rows="200,*" frameborder="NO" border="0" framespacing="0">
    <frame src="topFrame.jsp" name="topFrame" scrolling="auto" noresize>
   </frameset>
  </frameset>
 
 <body>
 
    <h3>Book List</h3>
 
    <p style="color: red;">${errorString}</p>
 
    <table border="1" cellpadding="5" cellspacing="1" >
       <tr>
          <th>Item ID</th>
          <th>Description</th>
          <th>Price</th>
          <th>Type</th>
          <th>Action</th>
       </tr>
       <c:forEach items="${bookList}" var="book">
          <tr>
             <td>${book.itemID}</td>
             <td>${book.shortDescription}</td>
             <td>${book.cost}</td>
             <td>${book.bookType}</td>
             <td>
                <a href="editBook?code=${book.itemID}">Edit</a>
             </td>
             <td>
                <a href="deleteBook?code=${book.itemID}">Delete</a>
             </td>
          </tr>
       </c:forEach>
    </table>
 
 </body>
</html>
