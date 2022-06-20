package com.cartmax.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cartmax.ecom.model.User;

@Repository
public interface CartMaxUserRepository extends JpaRepository<User, Integer> {

	User findByEmail(String email);
	/*
	 * S save(User user);
	 */

}
