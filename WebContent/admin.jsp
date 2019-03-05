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
	top: 30%;
	left: 22%;
}

body {
	text-align: center;
	padding-top: 150px;
}

form {
	display: inline-block;
}
</style>
</head>
<body BGCOLOR="PINK">
	<form method="post" action="AddJobServlet">
		
		
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
								<td><b>ADMIN ID:</b></td>
								<td><input type="number" name="adminId" required></td>
							</tr>
							<tr>
								<td></td>
								<td></td>
							</tr>
							<tr align="left">
							<td><b>ADMIN NAME:</b></td>
							<td><input type="text" name="adminName" required></td>
							</tr>
							<tr>
								<td></td>
								<td></td>
							</tr>
							<tr align="left">
					<td class="select"><b>VACANCY DEPT :</b></td>
					<td><select name="vacancyDept" required>
					<option value="B.E - Computer Science Engineering">B.E - Computer Science Engineering</option>
					<option value="B.E - Information Technology">B.E - Information Technology</option>
					<option value="B.E - Electronics and Communication Engineering">B.E - Electronics and Communication Engineering</option>
					<option value="B.E - Electrical and Electronics  Engineering">B.E - Electrical and Electronics  Engineering</option>
					<option value="B.E - Mechanical Engineering">B.E - Mechanical Engineering</option>
					<option value="B.E-  Mining Engineering">B.E - Mining Engineering</option>
					<option value="B.E- Automobile Engineering">B.E - Automobile Engineering</option>
					<option value="B.E- Civil Engineering">B.E - Civil Engineering</option>
					<option value="B.E- OTHERS">B.E - Other Department</option>
					<option value="B.Sc- Computer Science">B.Sc - Computer Science</option>
					<option value="B.Sc- Information Technology">B.Sc - Information Technology</option>
					<option value="B.Sc- OTHERS">B.Sc - Others</option>
					<option value="M.Sc- Computer Science">M.Sc - Computer Science</option>
					<option value="M.Sc- Information Technology">M.Sc - Information Technology</option>
					<option value="M.Sc- OTHERS">M.sc - Others</option>
					<option value="B.C.A">B.C.A</option>
					<option value="M.C.A">M.C.A</option>
					<option value="OTHERS">OTHERS COURSES</option>
					
					
					
					
					
					</select></td>
				</tr>
							<tr>
								<td></td>
								<td></td>
							</tr>
							<tr align="left">
							<td><b>VACANCY DETAILS:</B></td>
							<td><input type="text" name="vacancyDetails" required></td>
							</tr>
							<tr>
								<td></td>
								<td></td>
							</tr>
							<tr align="left">
							<td><b>JOB LOCATION:</b></td>
							<td><input type="text" name="jobLocation" required></td>
							</tr>
							<tr>
								<td></td>
								<td></td>
							</tr>
							<tr align="left">
							<td><b>COMPANY NAME:</b></td>
							<td><input type="text" name="companyName" required></td>
							</tr>
							<tr>
								<td></td>
								<td></td>
							</tr>
							<tr align="left">
							<td><b>REFERENCE NUMBER:</b></td>
							<td><input type="number" name="phoneNumber" required></td>
							</tr>
							</tbody>
							</table>
							<table>
							<tbody>
							<tr>
								<td></td><br>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button style="width: 100px;" type="submit">Add</button>
								</td>
							</tr>
							<tbody>
							</table>
							</form>
							
							

</body>
</html>