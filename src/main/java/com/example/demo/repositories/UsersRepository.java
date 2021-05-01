package com.example.demo.repositories;
 
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.document.Users;


public interface UsersRepository extends MongoRepository<Users,Object>{
	Users findByName(String name) ;
	@Query(value="{'name':$0}", delete=true)
	void deleteByName(String name);
}
