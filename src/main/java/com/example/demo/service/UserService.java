package com.example.demo.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.document.Users;
import com.example.demo.repositories.UsersRepository;
import com.example.demo.request.UserNewRequest;

@Service
@Transactional
public class UserService {
	@Autowired
	private UsersRepository userRepo;
	@Transactional
	public Integer addUser(UserNewRequest user) throws IOException {
		Users userEntity=new Users();
		userEntity.setName(user.getName());
		userEntity.setDescription(user.getDescription());
		userEntity.setImage(new Binary(BsonBinarySubType.BINARY, user.getImage().getBytes()));
		userRepo.save(userEntity);
		return 200;
	}
	public List<Users> getAllUsers(){
		return userRepo.findAll();
	}
	
	public String deleteByName(String name) throws Exception {
		Users us=new Users();
		if(userRepo.findByName(name)!=null) {
			us=userRepo.findByName(name);
			 userRepo.deleteById(userRepo.findByName(name).getId());
		}
		else {
			throw new Exception("User with this name not there");
		}
		return "Character with name has been deleted: "+us.getName();
	}
	

}
