package com.cartmax.buynow.repository;

import org.aspectj.apache.bcel.classfile.Module.Uses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cartmax.buynow.model.User;

//import com.more.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByEmail(String email);
	/*
	 * S save(User user);
	 */

}
