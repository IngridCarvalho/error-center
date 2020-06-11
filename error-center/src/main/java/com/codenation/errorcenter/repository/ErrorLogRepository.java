package com.codenation.errorcenter.repository;

import com.codenation.errorcenter.entity.ErrorLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ErrorLogRepository extends JpaRepository<ErrorLog, Long> {

	Page<ErrorLog> findAll(Pageable pageable);
}
