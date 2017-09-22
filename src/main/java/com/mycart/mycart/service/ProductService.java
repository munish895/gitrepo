package com.mycart.mycart.service;
import java.util.List;

import com.mycart.mycart.model.Product;

public interface ProductService {

	public List<Product> getAllProduct();
	public Product getProductById(int productId);
	public boolean addProduct(Product product);

	public boolean deleteProduct(int productId);
}
