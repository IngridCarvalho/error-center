package com.codenation.errorcenter.entity;

import com.codenation.errorcenter.enumerator.Level;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 200)
    private String description;

    @NotNull
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

}
