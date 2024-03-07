package com.jwt.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.example.model.User;

@Service
public class UserService {

	
	private List<User> store = new ArrayList<>();
	
	public UserService() {
		
		store.add(new User(UUID.randomUUID().toString(),"hks","hks@dev.in"));
		store.add(new User(UUID.randomUUID().toString(),"abc","a@dev.in"));
		store.add(new User(UUID.randomUUID().toString(),"def","ab@dev.in"));
		store.add(new User(UUID.randomUUID().toString(),"ghi","abc@dev.in"));
		store.add(new User(UUID.randomUUID().toString(),"aaai","abaa@dev.in"));
		
		
	}
	
	public List<User> getUsers(){
		
		return this.store;
	}
}
