package com.codenation.errorcenter.controllers;

import com.codenation.errorcenter.entity.EventLog;
import com.codenation.errorcenter.error.ResourceNotFoundException;
import com.codenation.errorcenter.impl.EventLogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@CrossOrigin(origins = "http://localhost:3000/", maxAge = 3600)
@RestController
@RequestMapping("api/v1")
public class EventLogController {

	@Autowired
	private EventLogServiceImpl eventLogService;

	@GetMapping(path = "event-log")
	public Page<EventLog> findAll(Pageable pageable) {
		return eventLogService.findAll(pageable);
	}

	@GetMapping(path = "event-log/{id}")
	public ResponseEntity<EventLog> findById(@PathVariable("id") Long id) {
		this.verifyIfEventLogExists(id);
		return new ResponseEntity<EventLog>(eventLogService.findById(id).get(), HttpStatus.OK);
	}

	@PostMapping(path = "event-log")
	public ResponseEntity<EventLog> create(@Valid @RequestBody EventLog eventLog) {
		return new ResponseEntity<EventLog>(eventLogService.save(eventLog), HttpStatus.CREATED);
	}

	private void verifyIfEventLogExists(Long id) {
		if(!this.eventLogService.findById(id).isPresent()) {
			throw new ResourceNotFoundException("Error Log not found for Id:" + id);
		}
	}

}
