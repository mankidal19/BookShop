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

 
   <body bgcolor="E9F946">
      <h3>Edit Book</h3>
       
      <p style="color: red;">${errorString}</p>
       
      <form id="editBook" name="editBook" method="POST" action="${pageContext.request.contextPath}/editBook">
         <table border="0">
            <tr>
               <td>Item ID</td>
               <td><input type="text" name="itemID" value="${book.itemID}" readonly=""/></td>
            </tr>
            <tr>
               <td>Short Description</td>
               <td><textarea form="editBook" cols="50" rows="3" name="shortDescription" />${book.shortDescription}</textarea></td>
            </tr>
            <tr>
               <td>Long Description</td>
               <td><textarea form="editBook" cols="50" rows="5" name="longDescription" />${book.longDescription}</textarea></td>
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
                   <a href="/viewBooks">Cancel</a>
               </td>
            </tr>
         </table>
      </form>
       
       
   </body>
</html>
