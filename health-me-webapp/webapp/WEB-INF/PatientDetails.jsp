<%@page import="com.healthme.application.login.entity.Patient"%>
<%@page import="com.healthme.application.login.entity.IPatient"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Patient Details</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<%
	List<IPatient> patientList = new ArrayList<IPatient>();
	IPatient p1 = new Patient(1l,"Abc");
	p1.setBedNo(1l);
	patientList.add(p1);
%>
</head>
<body>

	<h1 align="center">Patient Details</h1>
	<table>


		<tr>
			<th>Patient Id</th>
			<th>Patient Name</th>
			<th>Bed No</th>
		</tr>
		<%
			for (IPatient patient : patientList) {
		%>
		<tr>
			<td><%=patient.getPatientId()%></td>
			<td><%=patient.getPatientName()%></td>
			<td><%=patient.getBedNo()%></td>
		</tr>
		<%
			}
		%>

	</table>

</body>
</html>