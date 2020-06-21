package com.codenation.errorcenter.impl;

import com.codenation.errorcenter.entity.EventLog;
import com.codenation.errorcenter.repository.EventLogRepository;
import com.codenation.errorcenter.service.EventLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EventLogServiceImpl implements EventLogService {

	@Autowired
	private EventLogRepository eventLogRepository;

	@Override
	public Page<EventLog> findAll(Pageable pageable) {
		return this.eventLogRepository.findAll(pageable);
	}

	@Override
	public Optional<EventLog> findById(Long id) {
		return this.eventLogRepository.findById(id);
	}

	@Override
	public EventLog save(EventLog eventLog) {
		return eventLogRepository.save(eventLog);
	}

	@Override
	public void delete(EventLog eventLog) {
		this.eventLogRepository.delete(eventLog);
	}
}
