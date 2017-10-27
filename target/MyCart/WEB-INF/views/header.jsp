<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>My Cart</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">MyCart</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="home">Home</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Product <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Clothing</a></li>
            <li><a href="#">Electronics</a></li>
            <li><a href="#">Furniture</a></li>
           <li><a href="ProductList">Show Product</a></li> 
          </ul>
        </li>
         <c:url value="/mycart/admin/addProduct" var="url"/>                    
                     <c:if test="${pageContext.request.userPrincipal.name!=null }">
			<security:authorize access="hasRole('ROLE_ADMIN')">
					<a href="${url}">ADD PRODUCT</a>
					</security:authorize>
					</c:if>
					</li>
		 <%--           <li>
					<c:if test="${pageContext.request.userPrincipal.name!=null }">
			<security:authorize access="hasRole('ROLE_ADMIN')">
					 <c:url value="/admin/getcategory" var="url"/>
					<a href="${url}">ADD Category</a>
					</security:authorize>
					</c:if>
					</li>--%>
        <li><a href="#">Feedback</a></li>
         <li><security:authorize access="hasRole('ROLE_USER')">
         <li><a href="<c:url value="/Cart/getCart"></c:url>"> Add To Cart</a></li>
         </security:authorize></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">		
				<li>
			<c:if test="${pageContext.request.userPrincipal.name!=null }">
			<a href="">Welcome ${pageContext.request.userPrincipal.name }</a>
			</c:if>
			</li>
			
			<c:if test="${pageContext.request.userPrincipal.name==null }">
			<c:url value="/RegistrationForm" var="url5"></c:url>
			<li><a href="${url }"><span class="glyphicon glyphicon-user"></span> Sign up</a></li>
			<c:url value="/Login" var="Login"></c:url>
		    <li><a href="${Login }"><span class="glyphicon glyphicon-log-in"></span> Log In</a></li>	
		    </c:if>
		    <c:url value="/j_spring_security_logout" var="logoutUrl"></c:url>
		    <c:if test="${pageContext.request.userPrincipal.name!=null }">
		    <li><a href="${logoutUrl }">logout</a></li>
		    </c:if>
				</ul>
     <%--  <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="Login"><span class="glyphicon glyphicon-log-in"></span> Log In</a></li>
      </ul>--%>
    </div>
</nav>

