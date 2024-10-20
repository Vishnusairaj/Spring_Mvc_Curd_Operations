<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

<h1 style="color:red;text-align:center">Edit Employye</h1>

<frm:form  modelAttribute="emp">
<table align="center" bgcolor="cyan">

<tr>
<td>Employye Number</td>
<td><frm:input path="empno" readonly="true"/></td>
</tr>
<tr>
<td>Employye Name</td>
<td><frm:input path="ename"/></td>
</tr>
<tr>
<td>Employye job::</td>
<td><frm:input path="job"/></td>
</tr>
<td>Employye Salary</td>
<td><frm:input path="sal"/></td>
<tr>
<td><input type="submit" value="Update Employye"></td>
<td><input type="reset" value="cancel"></td>
</tr>
</table>

</frm:form>