package com.cobratms.service;

import com.cobratms.domain.Calendar;
import com.cobratms.domain.Event;
import com.cobratms.repository.CalendarRepository;
import com.cobratms.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    private EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public void saveNewEvent(Event event) {
        eventRepository.save(event);
    }
}
