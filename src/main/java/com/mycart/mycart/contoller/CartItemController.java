package com.mycart.mycart.contoller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycart.mycart.model.Cart;
import com.mycart.mycart.model.CartItem;
import com.mycart.mycart.model.Customer;
import com.mycart.mycart.model.Product;
import com.mycart.mycart.service.CartItemService;
import com.mycart.mycart.service.CustomerService;
import com.mycart.mycart.service.ProductService;



@Controller
public class CartItemController {

	@Autowired
	private ProductService productService;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private CartItemService cartItemService;
	
	
	@RequestMapping("/Cart/Add to Cart/{productId}")
	public String addCartItem(@PathVariable int productId,@RequestParam int units,@RequestParam(value="error", required = false)
	String error,Model model){
		Product product=productService.getProductById(productId);
		System.out.println("units" +units);
		System.out.println("quantity" +product.getProductQuantity());
		
		if(units<=product.getProductQuantity()){
		User user=(User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username=user.getUsername();
		Customer customer=customerService.getCustomerByUsername(username);
		Cart cart=customer.getCart();
		List<CartItem> cartItems=cart.getCartItems();
		System.out.println(cart.getCartItems().size());
	
	for(CartItem cartItem:cartItems){
		
		System.out.println(cartItem.getProduct().getProductId());
		System.out.println(productId);
		if(cartItem.getProduct().getProductId()==productId){
			cartItem.setQuantity(units);
			cartItem.setTotalPrice(product.getProductPrice()*units);
			cartItemService.addCartItem(cartItem);
		return "redirect:/Cart/getCart";
		}
	}
	
	CartItem cartItem=new CartItem();
	cartItem.setQuantity(units);
	cartItem.setTotalPrice(product.getProductPrice()* units);
	cartItem.setProduct(product);
	 cartItem.setCart(cart);
	 cartItemService.addCartItem(cartItem);
	 return "redirect:/Cart/getCart";
	 }
		else{
			if(error != null){
				model.addAttribute("error", "Out of Stock");
				}
			
			return "redirect:/all/Product/showProduct/{productId}";
		}
	}
	
	@RequestMapping("Cart/getCart")
	public String getCart(Model model){
		User user=(User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	
	String username=user.getUsername();
	Customer customer=customerService.getCustomerByUsername(username);
	Cart cart=customer.getCart();
	model.addAttribute("Cart",cart);
	return "cart";
	}
	
	@RequestMapping("/Cart/removecartitem/{cartItemId}")
	public String removeCartItem(@PathVariable int cartItemId){
		cartItemService.removeCartItem(cartItemId);
		return "redirect:/Cart/getCart";
		
	}
	
	@RequestMapping("/Cart/clearcart/{cartId}")
	public String removeAllCartItem(@PathVariable("cartId") int cartId){
		cartItemService.removeAllCartItems(cartId);
		return "redirect:/Cart/getCart";
		
	}
}
