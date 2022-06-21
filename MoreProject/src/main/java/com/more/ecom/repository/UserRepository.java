package com.more.ecom.repository;

import org.aspectj.apache.bcel.classfile.Module.Uses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.more.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByEmail(String email);
	/*
	 * S save(User user);
	 */

}
