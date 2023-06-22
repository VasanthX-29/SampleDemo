package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserRepo;
import com.example.entity.User;


@Service
public class AppService {
	
	
	@Autowired
	UserRepo repo;
	
	
	public User saveUser(User u)
	{
		return repo.save(u);
	}
	
	public User checkUser(String uemail, String upwd)
	{
		return repo.findUser(uemail, upwd);
	}
	
	
	public List<User> getall()
	{
		return repo.findAll();
	}
	
	
    public String deletebyid(int id)
	{
		repo.deleteById(id);
		return "deleted id of"+id;
	}
	
	public User updateUserPwd(String newpwd, String email, int id)
	{
		User u=repo.findById(id).orElse(null);
		u.setPassword(newpwd);
		return repo.save(u);
	}
	
	

}
