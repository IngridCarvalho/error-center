package com.codenation.errorcenter.repository;

import com.codenation.errorcenter.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<Log, Long> {
}
