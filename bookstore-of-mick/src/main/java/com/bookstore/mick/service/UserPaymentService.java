package com.bookstore.mick.service;

import com.bookstore.mick.domain.UserPayment;

public interface UserPaymentService {
	UserPayment findById(Long id);

	void removeById(Long id);
}
