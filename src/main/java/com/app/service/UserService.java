package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.app.dao.UserRepository;
import com.app.model.User;

@Service
@Profile(value = {"dev","uat","prod"})
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public List<User> getUsers(){
		return userRepository.findAll();
	}

}
