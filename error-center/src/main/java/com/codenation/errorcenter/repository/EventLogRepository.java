package com.codenation.errorcenter.repository;

import com.codenation.errorcenter.entity.EventLog;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventLogRepository extends PagingAndSortingRepository<EventLog, Long> {
}
