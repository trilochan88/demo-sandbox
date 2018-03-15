package com.bookstore.mick.service;

import java.util.Set;

import com.bookstore.mick.domain.User;
import com.bookstore.mick.domain.UserBilling;
import com.bookstore.mick.domain.UserPayment;
import com.bookstore.mick.domain.UserShipping;
import com.bookstore.mick.domain.security.PasswordResetToken;
import com.bookstore.mick.domain.security.UserRole;

public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);

	void createPasswordResetTokenForUser(final User user, final String token);

	User findByUsername(String username);

	User findByEmail(String email);

	User createUser(User user, Set<UserRole> userRoles) throws Exception;

	User save(User user);

	void updateUserBilling(UserBilling userBilling, UserPayment userPayment, User user);

	void updateUserShipping(UserShipping userShipping, User user);

	void setUserDefaultPayment(Long userPaymentId, User user);

	void setUserDefaultShipping(Long userShippingId, User user);
}
