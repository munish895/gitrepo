<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp" %>
<table class="table table-hover">
		<!-- <table class="table table-bordered table-striped"> -->
			<thead>
				<tr>
					
					<th>ProductID</th>
					
					<th>Product Name</th>
				     <th>Image</th>
					
					<th>Price</th>
					<th>Quantity</th>
					<th>Description</th>
					<!-- <th>Category</th> -->
					<!-- <th>Supplier</th>
                    <th>Other Links </th> -->
				</tr>
			</thead>
			<c:forEach var="product" items="${Product}">
			<tr>
					<td>${product.productId}</td>
					<td>${product.productDescription}</td>
					<td>${product.productName}</td>
			        <td><img src="<c:url value="/resources/images/${product.productId}.jpg" />" 
			        alt="image" width=50px hspace="0"></td> 				
					
					<td>${product.productPrice}</td>
					<td>${product.productQuantity}</td>
					<%-- <td>${product.category.description}</td> --%>
					<%-- <td>${product.supplier.supplierDetails}</td> --%>
					
	<td><c:url var="url" value="/showProduct/${product.productId}"></c:url>				
   <a href="${url}" ><span class="glyphicon glyphicon-info-sign"></span></a>
   
 <security:authorize access="hasRole('ROLE_ADMIN')">

<c:url var="delete" value="MyCart/admin/product/deleteproduct/${product.productId }"></c:url>
<a href="${delete }"><span class="glyphicon glyphicon-trash"></span></a>


<c:url var="edit" value="/MyCart/admin/updateProduct/${product.productId }"></c:url>
<a href="${edit }"><span class="glyphicon glyphicon-pencil"></span></a>

</security:authorize></td>
				</tr>
			</c:forEach>
		</table>

<%@ include file="footer.jsp" %>