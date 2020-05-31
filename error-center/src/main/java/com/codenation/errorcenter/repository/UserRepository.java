package com.codenation.errorcenter.repository;

import com.codenation.errorcenter.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
