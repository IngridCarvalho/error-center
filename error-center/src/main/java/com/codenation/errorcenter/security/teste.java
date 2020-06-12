package com.codenation.errorcenter.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class teste {
	public static void main(String[] args) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

		System.out.println(passwordEncoder.encode("123456"));
	}
}
