package com.codenation.errorcenter.impl;

import com.codenation.errorcenter.entity.ErrorLog;
import com.codenation.errorcenter.repository.ErrorLogRepository;
import com.codenation.errorcenter.service.ErrorLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ErrorLogServiceImpl implements ErrorLogService {

	@Autowired
	private ErrorLogRepository errorLogRepository;

	@Override
	public List<ErrorLog> findAll(Pageable pageable) {
		return this.errorLogRepository.findAll(pageable).getContent();
	}

	@Override
	public Optional<ErrorLog> findById(Long id) {
		return this.errorLogRepository.findById(id);
	}

	@Override
	public ErrorLog save(ErrorLog save) {
		return this.errorLogRepository.save(save);
	}
}
