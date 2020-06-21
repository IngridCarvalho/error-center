package com.codenation.errorcenter.repository;

import com.codenation.errorcenter.entity.ErrorLog;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ErrorLogRepository extends PagingAndSortingRepository<ErrorLog, Long> {

}
