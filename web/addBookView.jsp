<%-- 
    Document   : addBookView
    Created on : Dec 12, 2017, 9:50:15 AM
    Author     : PCUSER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="UTF-8">
      <title>Add Book</title>
   </head>

 
   <body bgcolor="E9F946">
      <h3>Add Book</h3>
       
      <p style="color: red;">${errorString}</p>
       
      <form id="addBook" method="POST" action="${pageContext.request.contextPath}/addBook">
         <table border="0">
            <tr>
               <td>Item ID</td>
               <td><input type="text" name="itemID" value="" /></td>
            </tr>
            <tr>
               <td>Short Description</td>
               <td><textarea form="addBook" cols="50" rows="3" name="shortDescription" /></textarea></td>
            </tr>
            <tr>
               <td>Long Description</td>
               <td><textarea form="addBook" cols="50" rows="5" name="longDescription" /></textarea></td>
            </tr>
            <tr>
               <td>Type</td>
               <td><input type="text" name="type" value="" /></td>
            </tr>
            <tr>
               <td>Price</td>
               <td><input type="text" name="price" value="" /></td>
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