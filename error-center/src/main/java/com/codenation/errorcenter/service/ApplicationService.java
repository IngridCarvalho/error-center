package com.codenation.errorcenter.service;

import com.codenation.errorcenter.entity.Application;

import java.util.List;
import java.util.Optional;

public interface ApplicationService {

	List<Application> findAll();

	Optional<Application> findById(Long id);

	Application save(Application application);

	void delete(Long id);

}
