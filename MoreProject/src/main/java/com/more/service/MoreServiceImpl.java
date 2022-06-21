package com.more.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.more.ecom.repository.UserRepository;
import com.more.model.User;

@Service
public class MoreServiceImpl implements MoreService {

	@Autowired
	UserRepository moreUserRepository;

	@Override
	public String login(User user) {

		User dbUser = moreUserRepository.findByEmail(user.getEmail());

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
		User dbUser = moreUserRepository.findByEmail(user.getEmail());
		if ((dbUser == null)) {
			moreUserRepository.save(user);
		} else
			return "user exist";
		return user.getName() + "  successfully registered";
	}

}
