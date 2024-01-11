<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>

<tr>
<th>Employee id</th>
<th>Employee Name</th>
<th>Employee Sal</th>
<th>actions</th>
</tr>

<c:forEach var="emp" items="${list}">
<tr>
<td>${emp.empid}</td>
<td>${emp.ename}</td>
<td>${emp.sal}</td>
<td>
<a href="deleteemp?eid=${emp.empid}"> Delete </a> ||
<a href="editemp?eid=${emp.empid}"> edit </a>
</td>
</tr>
</c:forEach>

</table>
<br> <br>
<a href="addemp.jsp">Add new Employee</a>

</body>
</html>