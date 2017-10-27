package com.mycart.mycart.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycart.mycart.Dao.CartItemDao;
import com.mycart.mycart.model.Cart;
import com.mycart.mycart.model.CartItem;
import com.mycart.mycart.service.CartItemService;



@Service
@Transactional
public class CartItemServiceImpl implements CartItemService {
	@Autowired
	private CartItemDao cartItemDao;
	public void addCartItem(CartItem cartItem) {
		cartItemDao.addCartItem(cartItem);	
	}

	public void removeCartItem(int cartItemId) {
	    cartItemDao.removecartItem(cartItemId);
		
	}

	public void removeAllCartItems(int cartId) {
		cartItemDao.removeAllCartItem(cartId);
		
	}

	public Cart getCart(int cartId) {
		return cartItemDao.getCart(cartId);
	}

	
	
}

