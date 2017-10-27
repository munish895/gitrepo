package com.mycart.mycart.Dao;

import com.mycart.mycart.model.Cart;
import com.mycart.mycart.model.CartItem;

public interface CartItemDao {

	void addCartItem(CartItem cartItem);
	void removecartItem(int cartitemId);
	public void removeAllCartItem(int cartId);
	public Cart getCart(int cartId);
	
}