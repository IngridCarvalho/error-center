package com.codenation.errorcenter.service;

import com.codenation.errorcenter.entity.ErrorLog;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ErrorLogService {

	List<ErrorLog> findAll(Pageable pageable);

	Optional<ErrorLog> findById(Long id);

	ErrorLog save(ErrorLog save);
}
