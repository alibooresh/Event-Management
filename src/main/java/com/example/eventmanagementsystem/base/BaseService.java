package com.example.eventmanagementsystem.base;

public abstract class BaseService<T> {

    public void validateEntity(T entity) {
        if (entity == null) {
            throw new IllegalArgumentException("entity is null");
        }
    }
}
