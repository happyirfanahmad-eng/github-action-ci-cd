package com.democlass.github_action_ci_cd.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {

        return ResponseEntity.ok("Hello, Welcome to Spring Boot!");
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Map<String, Object>> getStudent(
            @PathVariable Long id) {

        Map<String, Object> response = new HashMap<>();

        response.put("id", id);
        response.put("firstName", "Irfan");
        response.put("lastName", "Ahmad");
        response.put("course", "Java");

        return ResponseEntity.ok(response);
    }

    @PostMapping("/student")
    public ResponseEntity<Map<String, Object>> createStudent(
            @RequestBody Map<String, Object> request) {

        Map<String, Object> response = new HashMap<>();

        response.put("message", "Student created successfully");
        response.put("student", request);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
