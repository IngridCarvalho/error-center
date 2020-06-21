package com.codenation.errorcenter.entity;

import org.springframework.data.annotation.CreatedDate;
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

	@CreatedDate
	@Column(name = "created_date", nullable = false, updatable = false)
	private LocalDateTime eventData;

	@ManyToOne
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
