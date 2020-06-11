package com.codenation.errorcenter.impl;

import com.codenation.errorcenter.entity.Application;
import com.codenation.errorcenter.repository.ApplicationRepository;
import com.codenation.errorcenter.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationServiceImpl implements ApplicationService {

	@Autowired
	private ApplicationRepository applicationRepository;

	@Override
	public List<Application> findAll() {
		return this.applicationRepository.findAll();
	}

	@Override
	public Optional<Application> findById(Long id) {
		return this.applicationRepository.findById(id);
	}

	@Override
	public Application save(Application application) {
		return this.applicationRepository.save(application);
	}

	@Override
	public void delete(Long id) {
		this.applicationRepository.deleteById(id);
	}
}
