package com.codenation.errorcenter.service;

import com.codenation.errorcenter.entity.User;
import com.codenation.errorcenter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Optional;

@Component
public class CustomUserDetailService implements UserDetailsService {

	private final UserRepository userRepository;

	@Autowired
	public CustomUserDetailService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		User user = Optional.ofNullable(userRepository.findByUserName(userName))
			.orElseThrow(() -> new UsernameNotFoundException("User not found"));

		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), Arrays.asList(new SimpleGrantedAuthority("ADMIN")));
	}
}
