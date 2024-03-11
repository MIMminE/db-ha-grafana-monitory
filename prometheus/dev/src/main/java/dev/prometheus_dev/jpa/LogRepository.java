package dev.prometheus_dev.jpa;

import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<LogTable, Long> {
}
