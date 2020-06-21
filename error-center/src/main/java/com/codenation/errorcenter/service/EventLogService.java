package com.codenation.errorcenter.service;

import com.codenation.errorcenter.entity.EventLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface EventLogService {

	Page<EventLog> findAll(Pageable pageable);

	Optional<EventLog> findById(Long id);

	EventLog save(EventLog eventLog);

	void delete(EventLog eventLog);
}
