package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
	
	@Query("select u from User u where u.email=?1 and u.password=?2 ")
	public User findUser(String uname, String pwd);

}
