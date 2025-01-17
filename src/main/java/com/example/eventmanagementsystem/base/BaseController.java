package com.example.eventmanagementsystem.base;

import org.springframework.http.ResponseEntity;

public abstract class BaseController {

    protected <T> ResponseEntity<T> createResponse(T data) {
        return ResponseEntity.ok(data);
    }

    protected ResponseEntity<String> createErrorResponse(String message) {
        return ResponseEntity.badRequest().body(message);
    }
}
