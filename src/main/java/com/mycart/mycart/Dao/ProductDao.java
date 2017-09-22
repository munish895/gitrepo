package com.mycart.mycart.Dao;
import java.util.List;

import com.mycart.mycart.model.Product;

public interface ProductDao {
	public List<Product> getAllProduct();
	public Product getProductById(int productId);
	public boolean addProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(int productId);
}
