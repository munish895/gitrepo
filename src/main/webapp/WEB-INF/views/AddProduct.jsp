<%@include file="header.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<div class="container">
<div class="row">
<div class="form-horizontal">
<form:form action="/mycart/admin/addProduct" commandName="product" enctype="multipart/form-data" >
	<%-- <div class="form-group">
		<label class="col-md-4 control-label" for="ProductId">Product Id</label>
						<div class="col-md-6">
							<form:input path="ProductId" class="form-control" />
						</div>
					</div> --%>

					<div class="form-group">
						<label class="col-md-4 control-label" for="ProductName">Product Name</label>
						<div class="col-md-6">
							<form:input path="ProductName" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-4 control-label" for="ProductPrice">Price</label>
						<div class="col-md-6">
							<form:input path="ProductPrice" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-4 control-label" for="ProductQuantity">Quantity</label>
						<div class="col-md-6">
							<form:input path="ProductQuantity" class="form-control" />
						</div>
						
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label" for="ProductDescription">Description</label>
						<div class="col-md-6">
							<form:input path="productDescription" class="form-control" />
						</div>
					</div>

			  <div class="form-group">
					<input type="file" name="image">
					</div> 

					<div class="form-group">
						Select Category
							<c:forEach items="${categories}" var="c">
							
							<form:radiobutton path="category.id" value="${category.id}"/>${category.categoryName}
							
							</c:forEach> 
						</div>		
				
					
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