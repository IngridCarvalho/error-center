package com.codenation.errorcenter.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Description is require")
    @NotNull
    @Size(max = 200)
    private String description;

    @OneToMany(mappedBy = "application")
    private List<ErrorLog> errorLogs;

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public List<ErrorLog> getErrorLogs() {
        return errorLogs;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setErrorLogs(List<ErrorLog> errorLogs) {
        this.errorLogs = errorLogs;
    }
}
