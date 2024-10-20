 <%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<c:choose>
<c:when test="${!empty empData}">
<table border="1" bgcolor="cyan" align="center">
<tr style="color:green;background-color-color:yellow">
<th>empno</th><th>ename</th><th>job</th><th>sal</th><th>Operations</th>
</tr>

<c:forEach var="emp" items="${empData}">
<tr>
<td>${emp.empno}</td>
<td>${emp.ename}</td>
<td>${emp.job}</td>
<td>${emp.sal}</td>
<td><a href="edit?no=${emp.empno}"><img src="images/edit.jpg" width="30px" height="35px"/></a>         
	&nbsp;&nbsp;&nbsp;
	<a href="delect?no=${emp.empno}" onclick="return confirm('Do u want to delect the employee')">
		<img src="images/delect.jpg" width="30px" height="35px"/></a>
	
</td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h1 style="color:red;text-align:center">Records not Found </h1>
</c:otherwise>
</c:choose>
<center>
 	<h1 style="color:green">${resultmsg}</h1>
    <a href="./">home<img src="images/home.jpg" width="150px" height="150px"/></a>
	<br><br>
	<a href="register">register Employye<img src="images/register.jpg" width="175px" height="175px"/></a>
	