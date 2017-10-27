package com.mycart.mycart.contoller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.*;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContext;

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
   @RequestMapping("/mycart/admin/addProduct")
   public ModelAndView getaddProduct(Product product) 
   {
   boolean addproducts = productService.addProduct(product);
   return new ModelAndView("AddProduct","Product", addproducts );
   }
   
   @RequestMapping("/MyCart/admin/updateProduct/${product.productId }")
   public ModelAndView getupdateProduct(Product product) 
   {
   boolean updateproducts = productService.updateProduct(product);
   return new ModelAndView("UpdateProduct","Product", updateproducts );
   }
   @RequestMapping("/MyCart/admin/product/deleteproduct/${product.productId }")
   public ModelAndView getdeleteProduct(int productId) 
   {
   boolean deleteproducts = productService.deleteProduct(productId);
   return new ModelAndView("ProductList","Product", deleteproducts );
   }
   
   
   @RequestMapping(value="/mycart/admin/addProduct",method=RequestMethod.POST) 
   public ModelAndView insertProduct(@ModelAttribute("insertProductCommand") Product product, HttpServletRequest request, BindingResult result) 
   { 
    String filename=null; 
    boolean res = true; 
    ServletContext context=getServletContext(); 
    String path=context.getRealPath("./resources/"+product.getProductId()+".jpg"); 
    System.out.println("Path = "+path); 
    System.out.println("File name = "+product.getImage().getOriginalFilename()); 
    File f=new File(path); 
    if(!product.getImage().isEmpty()) 
    { 
     try 
     { 
      //filename=p.getImage().getOriginalFilename(); 
      byte[] bytes=product.getImage().getBytes(); 
      BufferedOutputStream bs=new BufferedOutputStream(new FileOutputStream(f)); 
      bs.write(bytes); 
      bs.close(); 
      System.out.println("Image uploaded"); 
      res=productService.addProduct(product); ; 
      System.out.println("Data Inserted"); 
     } 
     catch(Exception ex) 
     { 
      System.out.println(ex.getMessage()); 
     } 
    } 
    else 
    { 
     res=false; 
    } 
    if(res= true) 
    { 
     //List<Product> products = ps.getAllProduct(); 
     //model.addAttribute("products", products ); 
     return new ModelAndView("index","", null); 
      
    } 
    else 
    { 
     return new ModelAndView("error","",null); 
    } 
   }

private ServletContext getServletContext() {
	// TODO Auto-generated method stub
	return null;
} 
    
   }
