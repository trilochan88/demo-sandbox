package com.bookstore.mick.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.mick.domain.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {

}
