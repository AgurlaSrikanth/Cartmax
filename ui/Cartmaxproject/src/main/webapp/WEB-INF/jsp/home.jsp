<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title> </head>
<body>
<c:set var="name" value="sri"></c:set>
<c:set var="salary" value="${​​​​​5000*8}​​​​​"></c:set>
<font face="Lucida Handwriting" size="36" color="Blue">Welcome
<c:out value="${​​​​​name}​​​​​"/> Your Salary is 
<span style="color:fuchsia; text-decoration: underline;"><c:out value="${​​​​​salary}​​​​​"></c:out> </span>

</font>
<table border="1">
<c:forEach items="${​​​​​participants}​​​​​" var="p">
<tr>
<td>${​​​​​p}​​​​​</td>
</tr>
</c:forEach>
</table>
</body>

</html>

