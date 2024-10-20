<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

<h1 style="color:red;text-align:center">Register Employye</h1>


<frm:form action="register" modelAttribute="emp" >
<table align="center" border="1" bgcolor="yellow">
<tr>
<td>Employee name</td>
<td><frm:input type="text" path="ename"/></td>
</tr>
<tr>
<td>Employee job</td>
<td><frm:input type="text" path="job"/></td>
</tr>
<tr>
<td>Employee salary</td>  
<td><frm:input type="text" path="sal"/></td>
</tr>
<tr>
<td><input type="submit" value="Add Employye"/></td>
<td><input type="reset" value="cancel"/></td>
</tr>
</table>


</frm:form>