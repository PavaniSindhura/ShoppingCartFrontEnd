<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shopping Cart</title>
</head>
<body>
<h2> Welcome to Shopping Cart</h2>
${message} <br>
<a href="Login"> Login Here</a>
<a href="Register"> New User</a>
<hr color="blue">
<c:if test="${ UserClickRegisterHere}==true">
<jsp:include page="Registration.jsp"></jsp:include> >
</c:if>
<c:if test="$


{ UserClickLoginHere}==true">
<jsp:include page="Login.jsp"></jsp:include> >
</c:if>




</body>
</html>