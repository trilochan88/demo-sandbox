package com.bookstore.mick.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bookstore.mick.domain.CartItem;
import com.bookstore.mick.domain.ShoppingCart;
import com.bookstore.mick.repository.ShoppingCartRepository;
import com.bookstore.mick.service.CartItemService;
import com.bookstore.mick.service.ShoppingCartService;

public class ShoppingCartServiceImpl implements ShoppingCartService {
	@Autowired
	private CartItemService cartItemService;
	@Autowired
	private ShoppingCartRepository shoppingCartRepository;

	@Override
	public ShoppingCart updateShoppingCart(ShoppingCart shoppingCart) {
		BigDecimal cartTotal = new BigDecimal(0);
		List<CartItem> cartItemList = cartItemService.findByShoppoingCart(shoppingCart);
		for (CartItem cartItem : cartItemList) {
			if (cartItem.getBook().getInStockNumber() > 0) {
				cartItemService.updateCartItem(cartItem);
				cartTotal = cartTotal.add(cartItem.getSubtotal());
			}
		}

		shoppingCart.setGrandTotal(cartTotal);
		shoppingCartRepository.save(shoppingCart);
		return shoppingCart;
	}

}
