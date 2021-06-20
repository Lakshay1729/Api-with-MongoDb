//package com.example.demo.resource;
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.document.Users;
//import com.example.demo.request.UserNewRequest;
//import com.example.demo.service.UserService;
//
//import org.springframework.http.MediaType;
//
//@RestController()
//@CrossOrigin(origins = "/**")
//@RequestMapping(value="/rest/users",consumes = MediaType.APPLICATION_JSON_VALUE, 
//produces = MediaType.APPLICATION_JSON_VALUE)
//public class UserResource {
//	@Autowired
//	private UserService userService;
//	
//	@GetMapping("/all")
//	public List<Users> getAll(){
//		return userService.getAllUsers();
//	}
//	
//	@PostMapping("/user/new")
//	public Integer addUser(@Valid @RequestBody UserNewRequest user) {
//	
//		return userService.addUser(user);
//	}
//	@DeleteMapping("/user/delete" )
//	public String deleteUser(@RequestParam String name) throws Exception {
//		
//		return userService.deleteByName(name);
//		
//	}
//}
