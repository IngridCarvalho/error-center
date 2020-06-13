package com.codenation.errorcenter.service;

import com.codenation.errorcenter.entity.User;

public interface UserService {

	User findByUsername(String username);

	User save(User user);

}
