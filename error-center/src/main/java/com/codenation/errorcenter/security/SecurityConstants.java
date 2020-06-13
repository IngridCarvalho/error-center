package com.codenation.errorcenter.security;

public class SecurityConstants {

	//Authorization Bearer
	static final String SECRET = "errorCenter";
	static final String TOKEN_PREFIX = "Bearer ";
	static final String HEADER_STRING = "Authorization";
	static final String SIGN_UP_URL = "/users/sign-up";
	static final Long EXPIRATION_TIME = 86400000L;

}
