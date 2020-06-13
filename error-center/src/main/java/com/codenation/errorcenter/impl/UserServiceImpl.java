package com.codenation.errorcenter.impl;

import com.codenation.errorcenter.entity.User;
import com.codenation.errorcenter.repository.UserRepository;
import com.codenation.errorcenter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User findByUsername(String username) {
		return this.userRepository.findByUsername(username);
	}

	@Override
	public User save(User user) {
		return this.userRepository.save(user);
	}
}
