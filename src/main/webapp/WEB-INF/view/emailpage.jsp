<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Email App</title>

<style>
	body{
		background-color: #f2f2f3;
		box-sizing: border-box;
		padding: 20px;
	}
	.form{
		background-color: white;
		display: flex;
		flex-direction: column;
		width: 400px;
		padding-bottom: 10px;
	}
	.input{
		background-color: #f2f2f3;
		color: gray;
		padding: 10px;
		margin: 15px;
		border-radius: 8px;
		border: none;
	}
	.btn{
		background: blue;
		border-radius: 5px;
		width: 60%;
		border: none;
		color: white;
		font-size: 21px;
		margin: auto auto;
		padding: 10px auto;
	}
</style>
</head>
<body>

	<div align="center">
		<form:form action="sendmail" modelAttribute="mail" class="form">
			<form:input path="email" placeholder="enter email address..." class="input"/>
			<form:input path="subject" placeholder="enter subject..." class="input"/>
			<form:textarea rows="7" path="message" placeholder="enter message to be sent..." class="input"/>
			
			<button type="submit" class="btn">Send</button>
		</form:form>
	</div>

</body>
</html>