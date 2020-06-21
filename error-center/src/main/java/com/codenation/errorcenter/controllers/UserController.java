package com.codenation.errorcenter.controllers;

import com.codenation.errorcenter.entity.User;
import com.codenation.errorcenter.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "http://localhost:3000/", maxAge = 3600)
@RestController
@RequestMapping("api/v1")
public class UserController {

	@Autowired
	private UserServiceImpl userService;

	@PostMapping(path = "user")
	public ResponseEntity<User> create(@Valid @RequestBody User user) {
		//encrypts password
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		return new ResponseEntity<User>(this.userService.save(user), HttpStatus.CREATED);
	}
}
