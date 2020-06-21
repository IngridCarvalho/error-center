package com.codenation.errorcenter.service;

import com.codenation.errorcenter.entity.ErrorLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ErrorLogService {

	Page<ErrorLog> findAll(Pageable pageable);

	Optional<ErrorLog> findById(Long id);

	ErrorLog save(ErrorLog save);
}
