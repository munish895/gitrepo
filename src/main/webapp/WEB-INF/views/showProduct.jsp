<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp" %>
<c:if test="${not Empty error}">
<div class="error">${error}
</div>
</c:if>
<h3>Product Information</h3>
<table>
<tr> <td>ProductId</td><td>${product.productId}</td></tr>
<tr> <td>Description</td><td>${product.productDescription}</td></tr>
<tr> <td>ProductName</td><td>${product.productName}</td></tr>
<tr> <td>Price</td><td>${product.productPrice}</td></tr>
<tr> <td>Quantity</td><td>${product.productQuantity}</td></tr>
</table>
<c:url value="/getAllProduct" var="urll"></c:url>
<a herf="${url}"> Back To Product</a>
<%@ include file="footer.jsp" %>