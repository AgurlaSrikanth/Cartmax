package com.cartmax.ecom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cartmax.ecom.model.User;
import com.cartmax.ecom.repository.CartMaxUserRepository;

@Service
public class CartMaxServiceImpl implements CartMaxService {

	@Autowired
	CartMaxUserRepository cartMaxUserRepository;

	@Override
	public String login(User user) {

		User dbUser = cartMaxUserRepository.findByEmail(user.getEmail());

		if ((dbUser != null)) {
			if (dbUser.getPassword().equals(user.getPassword())) {
				return "Logged in successfully";
			} else {
				return "Incorrect password";
			}
		} else {
			return "User does not exists";
		}

	}

	@Override
	public String register(User user) {
		User dbUser = cartMaxUserRepository.findByEmail(user.getEmail());
		if ((dbUser == null)) {
			cartMaxUserRepository.save(user);
		} else
			return "user exist";
		return user.getName() + "  successfully registered";
	}

}
