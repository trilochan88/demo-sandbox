package com.bookstore.mick.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.mick.domain.UserPayment;

public interface UserPaymentRepository extends CrudRepository<UserPayment,Long> {

}
