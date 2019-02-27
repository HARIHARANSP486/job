<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="SearchJobServlet">
<h3>List of Jobs in various companies and locations:</h3>
	<table>
		<thead>
			<tr>
				<th>VACANCYDEPT</th>
				<th>VACANCYDETAILS</th>
				<th>JOBLOCATION</th>
				<th>COMPANYNAME</th>
			</tr>
		</thead>
		<tbody>
		<tr>
					<td>${JOB.vacancyDept}</td>
					<td>${JOB.vacancyDetails}</td>
					<td>${JOB.jobLocation }</td>
					<td>${JOB.companyName }</td>
				</tr>
		
</form>
</body>
</html>