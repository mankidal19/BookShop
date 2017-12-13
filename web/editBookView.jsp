<%-- 
    Document   : editBookView
    Created on : Dec 12, 2017, 9:58:14 AM
    Author     : PCUSER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="UTF-8">
      <title>Edit Book</title>
   </head>
    <frameset rows="*" cols="220,*" frameborder="NO" border="0" framespacing="0">
  <frame src="leftFrame.jsp" name="leftFrame" scrolling="auto" noresize>
   
  <frameset rows="200,*" frameborder="NO" border="0" framespacing="0">
    <frame src="topFrame.jsp" name="topFrame" scrolling="auto" noresize>
    </frameset>
  </frameset>
 
   <body>
      <h3>Edit Book</h3>
       
      <p style="color: red;">${errorString}</p>
       
      <form method="POST" action="${pageContext.request.contextPath}/editBook">
         <table border="0">
            <tr>
               <td>Item ID</td>
               <td><input type="text" name="id" value="${book.itemID}" readonly=""/></td>
            </tr>
            <tr>
               <td>Short Description</td>
               <td><input type="text" name="shortDescription" value="${book.shortDescription}" /></td>
            </tr>
            <tr>
               <td>Long Description</td>
               <td><input type="text" name="longDescription" value="${book.longDescription}" /></td>
            </tr>
            <tr>
               <td>Type</td>
               <td><input type="text" name="type" value="${book.bookType}" /></td>
            </tr>
            <tr>
               <td>Price</td>
               <td><input type="text" name="price" value="${book.cost}" /></td>
            </tr>
            <tr>
               <td colspan="2">                   
                   <input type="submit" value="Submit" />
                   <a href="viewBooks">Cancel</a>
               </td>
            </tr>
         </table>
      </form>
       
       
   </body>
</html>
