package com.cartmax.buynow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cartmax.buynow.model.User;
import com.cartmax.buynow.repository.UserRepository;

@SpringBootApplication

public class BuyApplication {
	@Autowired UserRepository ob; 
	public static void main(String[] args) {
		SpringApplication.run(BuyApplication.class, args);
	}
	
    public void run(String... args) throws Exception
    {
        // Inserting the data in the mysql table.
        User first = new User(1,"Aayush","12345","aak@gmail.com");
        // ob.save() method
        ob.save(first);
        System.out.println(first);
    }
}
