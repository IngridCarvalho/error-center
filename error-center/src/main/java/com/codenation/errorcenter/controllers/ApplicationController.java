package com.codenation.errorcenter.controllers;

import com.codenation.errorcenter.entity.Application;
import com.codenation.errorcenter.error.ResourceNotFoundException;
import com.codenation.errorcenter.impl.ApplicationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/application")
public class ApplicationController {

	@Autowired
	private ApplicationServiceImpl applicationService;

	@PostMapping
	public ResponseEntity<Application> create(@RequestBody Application application) {
		return new ResponseEntity<Application>(this.applicationService.save(application), HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Application>> findAll() {
		return new ResponseEntity<List<Application>>(this.applicationService.findAll(), HttpStatus.OK);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Application> findById(@PathVariable("id") Long id) {
		this.verifyIfApplicationExists(id);
		return new ResponseEntity<Application>(this.applicationService.findById(id).get(), HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Application> update(@RequestBody Application application) {
		return new ResponseEntity<Application>(this.applicationService.save(application), HttpStatus.ACCEPTED);
	}

	@ResponseStatus(HttpStatus.OK)
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable("id") Long id) {
		this.verifyIfApplicationExists(id);
		this.applicationService.delete(id);
	}

	private void verifyIfApplicationExists(Long id) {
		if(!this.applicationService.findById(id).isPresent()) {
			throw new ResourceNotFoundException("Application not found for Id:" + id);
		}
	}
}
