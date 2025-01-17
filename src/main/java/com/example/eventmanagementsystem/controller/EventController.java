package com.example.eventmanagementsystem.controller;

import com.example.eventmanagementsystem.base.BaseController;
import com.example.eventmanagementsystem.entity.Event;
import com.example.eventmanagementsystem.service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController extends BaseController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping
    public ResponseEntity<Event> createEvent(@RequestBody Event event) {
        return createResponse(eventService.createEvent(event));
    }

    @GetMapping
    public ResponseEntity<List<Event>> getAllEvents() {
        return createResponse(eventService.getAllEvents());
    }
}
