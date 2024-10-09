package com.democorp.dummy.data.entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PreUpdate;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BasicShiet {

    @Column(name = "CREATED_DATE", nullable = false, updatable = false)
    private LocalDateTime createdDate;

    @Column(name = "LAST_UPDATE")
    private LocalDateTime lastUpdate;

    public BasicShiet() {
        LocalDateTime nowLocalDateTime = LocalDateTime.now();
        this.lastUpdate = nowLocalDateTime;
        this.createdDate = nowLocalDateTime;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    @PreUpdate
    public void onPreUpdate() {
        this.lastUpdate = LocalDateTime.now();
    }
}
