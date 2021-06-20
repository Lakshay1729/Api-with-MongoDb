package com.example.demo.document;



import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection="new")
@Data
public class Users {
	@Id
	private Object id;
	private String name;
	private String description;
	private String image;
	public Users(String name,String description) {
		id=new ObjectId();
		this.name=name;
		this.description=description;
		
	}
	public Users() {
		id=new ObjectId();
	}
	
}
