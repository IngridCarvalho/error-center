package com.codenation.errorcenter.controllers;

import com.codenation.errorcenter.entity.User;
import com.codenation.errorcenter.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class UserController {

	@Autowired
	private UserServiceImpl userService;

	@PostMapping(path = "user")
	public ResponseEntity<User> create(@RequestBody User user) {
		return new ResponseEntity<User>(this.userService.save(user), HttpStatus.CREATED);
	}
}
