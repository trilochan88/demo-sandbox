package com.bookstore.mick.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.mick.domain.BookToCartItem;
import com.bookstore.mick.domain.CartItem;

public interface BookToCartItemRepository extends CrudRepository<BookToCartItem, Long> {
void deleteByCartItem(CartItem cartItem);
}
