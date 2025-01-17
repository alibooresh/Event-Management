package com.example.eventmanagementsystem.repository;

import com.example.eventmanagementsystem.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
