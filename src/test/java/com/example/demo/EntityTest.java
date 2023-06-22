package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import com.example.entity.*;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class EntityTest {

	@Test
	public void testEntity()
	{
		User u=new User();
		
		u.setName("Suban");
		u.setEmail("suban123@yahoo.com");
		u.setPassword("sub123");
		
		assertEquals("Suban", u.getName());
		assertEquals("suban123@yahoo.com", u.getEmail());
		assertEquals("sub123", u.getPassword());
		
		
	}

}
