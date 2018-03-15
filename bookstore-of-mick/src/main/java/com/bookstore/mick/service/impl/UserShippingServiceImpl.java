package com.bookstore.mick.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bookstore.mick.domain.UserShipping;
import com.bookstore.mick.repository.UserShippingRepository;
import com.bookstore.mick.service.UserShippingService;

public class UserShippingServiceImpl implements UserShippingService {
	@Autowired
	private UserShippingRepository userShippingRepository;

	@Override
	public UserShipping findById(Long id) {
		return userShippingRepository.findOne(id);
	}

	@Override
	public void removeById(Long id) {
		userShippingRepository.delete(id);

	}

}
