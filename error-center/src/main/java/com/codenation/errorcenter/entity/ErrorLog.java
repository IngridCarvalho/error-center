package com.codenation.errorcenter.entity;

import com.codenation.errorcenter.enumerator.Level;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
public class ErrorLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotEmpty(message = "Description is require")
    @Size(max = 200)
    private String description;

    @NotNull
    @NotEmpty(message = "Description is require")
    @Size(max = 255)
    private String eventLog;

    @CreatedDate
    private LocalDateTime eventData;

    @NotNull
    private Integer quantity;

    @Enumerated(EnumType.STRING)
    private Level level;

    @ManyToOne
    private Application application;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEventLog() {
        return eventLog;
    }

    public void setEventLog(String eventLog) {
        this.eventLog = eventLog;
    }

    public LocalDateTime getEventData() {
        return eventData;
    }

    public void setEventData(LocalDateTime eventData) {
        this.eventData = eventData;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }
}
