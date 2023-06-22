package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.example.service.AppService;



import com.example.entity.*;
@SpringBootTest
public class HandlingUserAuthenticationApplicationTests {

	@Autowired
	AppService service;
		
		@Test
		public void testInsertionofUser() {
			
			//testing the insertion
			
			 User u=new User();
			  u.setName("Shiyam");
			  u.setEmail("shiyam478@gmail.com");
			  u.setPassword("shiyam123");
			 assertNotNull(service.saveUser(u));
			
	
}
		
		@Test
		public void testcheckUser() {
			
			//testing to find whether the user credentials are present or not(Login page)
			
			 assertNotNull(service.checkUser("aki123@gmail.com", "aki123"));
			
	}
		
		@Test
		public void testallUsers() {
			
			List<User> users=service.getall();
			
			 assertFalse(users.isEmpty());
			}
		
		@Test
		public void testUserDeletion() {
			//testing the deletion of a particular user
			
			assertEquals("deleted id of"+452, service.deletebyid(452));
			
			}
		
		@Test
	    public void testPwdUpdate() {
			
			//testing the updation of the user's password
			
			User u=service.updateUserPwd("kel665", "kel@gmail.com", 202);
			assertEquals("kel665", u.getPassword());
			
			}
		
		
}
