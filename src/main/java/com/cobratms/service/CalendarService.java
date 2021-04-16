package com.cobratms.service;

import com.cobratms.domain.Calendar;
import com.cobratms.repository.CalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalendarService {

    private CalendarRepository calendarRepository;

    @Autowired
    public CalendarService(CalendarRepository calendarRepository) {
        this.calendarRepository = calendarRepository;
    }

    public void saveNewCalendar(Calendar calendar) {
        calendarRepository.save(calendar);
    }
}
