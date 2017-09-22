package com.mycart.mycart.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycart.mycart.Dao.ProductDao;
import com.mycart.mycart.model.Product;
import com.mycart.mycart.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDao productDao;
	public List<Product> getAllProduct() {
		
		return productDao.getAllProduct();
	}
	public Product getProductById(int productId) {
		
		return productDao.getProductById(productId);
	}
	public boolean addProduct(Product product) {
		
		return false;
	}
	public boolean updateProduct(Product product) {
	
		return false;
	}
	public boolean deleteProduct(int productId) {
		return false;
	}
	
	
	

}
