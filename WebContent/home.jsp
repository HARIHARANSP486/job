<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="font-family: Times New Roman; font-size: 19px">

	<div align="left" style="width: 600px;">
		Your successfully logged in <a href="login.html">Logout</a>
	</div>
	<table>



		<tr>
			<td>
				<div align="center" style="width: 600px">
					<form method="post" action="SearchJobServlet">
						<h2>Search job:</h2>
						<table>
							<tr>
								<td>Enter the department Name :</td>
								<td><input type="text" name="deptname"></td>
							</tr>
						</table>
					</form>
				</div>
			</td>
		</tr>
</table>
</body>
</html>