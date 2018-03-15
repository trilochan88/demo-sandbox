package com.bookstore.mick.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bookstore.mick.domain.UserPayment;
import com.bookstore.mick.repository.UserPaymentRepository;
import com.bookstore.mick.service.UserPaymentService;

public class UserPaymentServiceImpl implements UserPaymentService {
	@Autowired
	private UserPaymentRepository userPaymentRepository;

	@Override
	public UserPayment findById(Long id) {
		return userPaymentRepository.findOne(id);
	}

	@Override
	public void removeById(Long id) {
		userPaymentRepository.delete(id);

	}

}
