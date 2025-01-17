package com.example.eventmanagementsystem.repository;

import com.example.eventmanagementsystem.entity.EventAttendee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventAttendeeRepository extends JpaRepository<EventAttendee, Integer> {
}
