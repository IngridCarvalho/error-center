package com.codenation.errorcenter.controllers;

import com.codenation.errorcenter.entity.ErrorLog;
import com.codenation.errorcenter.error.ResourceNotFoundException;
import com.codenation.errorcenter.impl.ErrorLogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/error-log")
public class ErrorLogController {

	@Autowired
	private ErrorLogServiceImpl errorLogService;

	@GetMapping
	public List<ErrorLog> findAll(Pageable pageable) {
		return errorLogService.findAll(pageable);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ErrorLog> findById(@PathVariable("id") Long id) {
		this.verifyIfErrorLogExists(id);
		return new ResponseEntity<ErrorLog>(errorLogService.findById(id).get(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<ErrorLog> create(@RequestBody ErrorLog errorLog) {
		return new ResponseEntity<ErrorLog>(errorLogService.save(errorLog), HttpStatus.CREATED);
	}

	private void verifyIfErrorLogExists(Long id) {
		if(!this.errorLogService.findById(id).isPresent()) {
			throw new ResourceNotFoundException("Error Log not found for Id:" + id);
		}
	}
}

