package com.mycart.mycart.contoller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mycart.mycart.model.Product;
import com.mycart.mycart.service.ProductService;

@Controller
public class ProductController 
{
	
   @Autowired
  
   private ProductService productService;

   @RequestMapping("/ProductList")
   public ModelAndView getAllProducts() 
   {
   List<Product> products = productService.getAllProduct();
   return new ModelAndView("ProductList","Product", products );
   }
   
   @RequestMapping("/showProduct/{productId}")
   public ModelAndView getProductById(int productId) 
   {
   Product productbyId = productService.getProductById( productId);
   return new ModelAndView("showProduct","Product", productbyId  );
   }
   @RequestMapping("admin/product/addProduct")
   public ModelAndView getaddProduct(Product product) 
   {
   boolean addproducts = productService.addProduct(product);
   return new ModelAndView("AddProduct","Product", addproducts );
   }
   
   @RequestMapping("/updateProduct/${productId}")
   public ModelAndView getupdateProduct(Product product) 
   {
   boolean updateproducts = productService.addProduct(product);
   return new ModelAndView("UpdateProduct","Product", updateproducts );
   }
   }
