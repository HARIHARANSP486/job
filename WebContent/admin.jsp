<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.display {
	position: absolute;
	top: 37%;
	left: 22%;
}

body {
	text-align: center;
	padding-top: 230px;
}

form {
	display: inline-block;
}
</style>
</head>
<body bgcolor="white">
	<form method="post" action="AddJobServelt">
		
		
		<table>
			<tbody>
				<tr align="center">
					<td style="color: black" colspan="2" style="padding-top:50px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<h2>ENTER THE DETAILS ABOUT JOB:</h2></td>
					<tr>
								<td></td>
								<td></td>
							</tr>
				</tr>

							<tr align="left">
								<td>ADMIN ID:</td>
								<td><input type="number" name="adminId"></td>
							</tr>
							<tr>
								<td></td>
								<td></td>
							</tr>
							<tr align="left">
							<td>ADMIN NAME:</td>
							<td><input type="text" name="adminName"></td>
							</tr>
							<tr>
								<td></td>
								<td></td>
							</tr>
							<tr align="left">
							<td>VACANCY DEPT:</td>
							<td><input type="text" name="vacancyDept"></td>
							</tr>
							<tr>
								<td></td>
								<td></td>
							</tr>
							<tr align="left">
							<td>VACANCY DETAILS:</td>
							<td><input type="text" name="vacancyDetails"></td>
							</tr>
							<tr>
								<td></td>
								<td></td>
							</tr>
							<tr align="left">
							<td>JOB LOCATION:</td>
							<td><input type="text" name="jobLocation"></td>
							</tr>
							<tr>
								<td></td>
								<td></td>
							</tr>
							<tr align="left">
							<td>COMPANY NAME:</td>
							<td><input type="text" name="companyName"></td>
							</tr>
							<tr>
								<td></td>
								<td></td>
							</tr>
							<tr align="left">
							<td>PHONE NUMBER:</td>
							<td><input type="number" name="phoneNumber"></td>
							</tr>
							<tr>
								<td></td>
								<td>
									<button style="width: 100px;" type="submit">Add</button>
								</td>
							</tr>
							</table>
							</form>
							
							

</body>
</html>