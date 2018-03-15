package com.bookstore.mick.service;

import java.util.List;

import com.bookstore.mick.domain.Book;
import com.bookstore.mick.domain.CartItem;
import com.bookstore.mick.domain.ShoppingCart;
import com.bookstore.mick.domain.User;

public interface CartItemService {
	List<CartItem> findByShoppoingCart(ShoppingCart shoppingCart);

	CartItem updateCartItem(CartItem cartItem);

	CartItem addBookToCartItem(Book book, User user, int qty);

	CartItem findById(Long id);

	void removeCartItem(CartItem cartItem);
}
