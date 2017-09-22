<%@include file="header.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<div class="container">
		<div class="row">
			<div class="form-horizontal">
				<c:url value="/admin/updateProduct/${productId}" var="abc"></c:url>
				<form:form action="${productId}" commandName="product"  >

					 <div class="form-group">
						<label class="col-md-4 control-label" for="productId">Product Id</label>
						<div class="col-md-6">
							<form:input path="productId" class="form-control" />
						</div>
					</div> 

					<div class="form-group">
						<label class="col-md-4 control-label" for="productName">Product Name</label>
						<div class="col-md-6">
							<form:input path="productName" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-4 control-label" for="productPrice">Price</label>
						<div class="col-md-6">
							<form:input path="productPricerice" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-4 control-label" for="productQuantity">Quantity</label>
						<div class="col-md-6">
							<form:input path="productQuantity" class="form-control" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-md-4 control-label" for="productDescription">Description</label>
						<div class="col-md-6">
							<form:input path="productDescription" class="form-control" />
						</div>
					</div>

			 <!-- <div class="form-group">
					<input type="file" name="image">
					</div>
 
 
 
					<div class="form-group">
						Select Category
							<c:forEach items="${categories}" var="c">
							
							<form:radiobutton path="category.id" value="${c.id}"/>${c.categoryName}
							
							</c:forEach> 
						</div>-->
 
 
					
					<div class="form-group">
						<label class="col-md-4 control-label" for="singlebutton"></label>
						<div class="col-md-4">
							<button  id="submit" name="submit" class="btn btn-primary">Add Product</button>
						</div>
					</div>
					
					
		
				</form:form>
			</div>
		</div>
	</div>
	<%@include file="footer.jsp" %>