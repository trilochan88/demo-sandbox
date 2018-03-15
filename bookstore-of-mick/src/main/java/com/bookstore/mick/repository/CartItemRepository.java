package com.bookstore.mick.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.mick.domain.CartItem;
import com.bookstore.mick.domain.ShoppingCart;

public interface CartItemRepository extends CrudRepository<CartItem, Long> {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
}
