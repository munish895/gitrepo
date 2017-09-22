 <%@ include file="header.jsp" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<div>
<c:if test="${not empty msg }">
<div class="msg">${msg }
</div>
</c:if>

<c:if test="${not empty error }">
<div class="error">${error }
</div>
</c:if>

</div>
<c:url value="/j_spring_security_check" var="Login" ></c:url>
<form action="${Login }" method="post">
Enter username <input type="text" name="j_username" class="form-control" required class="input">
<form:errors path="username" cssClass="error" /><br><br>
Enter password <input type="password" name="j_password" class="form-control"><br>
<input type="submit" value="Login">
</form>
</body>

 <%@ include file="footer.jsp" %>