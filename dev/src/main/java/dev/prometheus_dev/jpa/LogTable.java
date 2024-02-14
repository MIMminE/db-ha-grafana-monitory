package dev.prometheus_dev.jpa;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Data
@Slf4j
@Entity
@NoArgsConstructor
public class LogTable {
    @Id
    @GeneratedValue
    Long id;


    String info;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date createdAt;

    @PrePersist
    protected void onCreate(){
        createdAt = new Date();
    }

    public LogTable(String info) {
        this.info = info;
    }
}
