package com.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.entity.User;
import com.springboot.repo.UserRepo;

@RestController
public class UserController {
	
	@Autowired
	UserRepo userRepo;
	
	
	
	
	@GetMapping("/users")
	public List<User> listAllUser(User user) {
		
		List<User> allUsers = userRepo.findAll();
		return (List<User>) allUsers;
		
	}
	
	
	@GetMapping("/author")

    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("author.html");
        return modelAndView;
    }  
	
	
	@PostMapping("/postUser")
	public ResponseEntity<User> createUser(@RequestBody User user){
		User createdUser = userRepo.save(user);
		return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
	}
	
	@GetMapping("/users/{id}")
	public Optional<User> findUserById(@PathVariable Long id){
		
		Optional<User> userById = userRepo.findById(id);
		
		return userById;
		
	}
	
	
	

}
