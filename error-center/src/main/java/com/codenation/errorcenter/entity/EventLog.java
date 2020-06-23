package com.codenation.errorcenter.entity;

import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
public class EventLog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@NotEmpty(message = "Description is require")
	@Size(max = 255)
	private String log;

	@LastModifiedDate
	private LocalDateTime eventData;

	@ManyToOne
	@JoinColumn(name="error_log_id", referencedColumnName="id")
	private ErrorLog errorLog;

	public Long getId() {
		return id;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public LocalDateTime getEventData() {
		return eventData;
	}

	public ErrorLog getErrorLog() {
		return errorLog;
	}

	public void setErrorLog(ErrorLog errorLog) {
		this.errorLog = errorLog;
	}
}
