package com.example.eventmanagementsystem.service;

import com.example.eventmanagementsystem.base.BaseService;
import com.example.eventmanagementsystem.entity.Event;
import com.example.eventmanagementsystem.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService extends BaseService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Event createEvent(Event event) {
        validateEntity(event);
        return eventRepository.save(event);
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }
}
