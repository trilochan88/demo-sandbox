package com.bookstore.mick.service;

import com.bookstore.mick.domain.UserShipping;

public interface UserShippingService {
	UserShipping findById(Long id);

	void removeById(Long id);
}
