package com.bookstore.mick.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.mick.domain.User;



public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
	User findByEmail(String email);
}
