package com.codenation.errorcenter.repository;

import com.codenation.errorcenter.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {

}
