package com.cartmax.buynow.repository;

import org.aspectj.apache.bcel.classfile.Module.Uses;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cartmax.buynow.model.User;

//import com.more.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	//@Query("SELECT u FROM user2 u WHERE u.email = ?1")
	User findByEmail(String email);
	/*
	 * S save(User user);
	 */

}
