package com.codenation.errorcenter.service;

import com.codenation.errorcenter.entity.User;

public interface UserService {

	User findByUserName(String userName);

	User save(User user);

}
