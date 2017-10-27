package com.mycart.mycart.service;

import com.mycart.mycart.model.Cart;
import com.mycart.mycart.model.CartItem;

public interface CartItemService {

	void addCartItem(CartItem cartItem);
	void removeCartItem(int cartItemId);
	void removeAllCartItems(int cartId);
	Cart getCart(int cartId);
}
