package dev.prometheus_dev.controller;

import dev.prometheus_dev.jpa.LogRepository;
import dev.prometheus_dev.jpa.LogTable;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/db")
public class TestController {

    private LogRepository repository;

    @GetMapping
    public String test(){
        repository.save(new LogTable("hello"));
        return "ok";
    }
}
