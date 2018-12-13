<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
 
   <c:forEach var="livre" items="${livres}">
   
    <tr>
      <td><c:out value="${livre.intitule}" /></td><td>  
      <td><c:out value="${livre.isbn}" /></td> 
      <td><c:out value="${livre.auteur}" /> <td><a href="modifiervoiture.jsp?id=${voiture.getId()}">Edit</a></td><td> <a href="efacervoiture.jsp?id=${voiture.getId()}">Delete</a></td></td> 
   </tr>
  </c:forEach>
</table>

</body>
</html>