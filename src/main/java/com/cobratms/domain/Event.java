package com.cobratms.domain;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "events")
public class Event {

    //region Attributes
    @Id
    @Column(name = "event_id")
    private long eventId;

    @ManyToOne
    @JoinColumn(name = "calendar_id")
    private Calendar calendarId;

    @Column(name = "period_start")
    private Date startPeriod;

    @Column(name = "period_end")
    private Date endPeriod;

    @Column(name = "event_date")
    private Date date;

    @Column(name = "time_start")
    private Time timeStart;

    @Column(name = "time_end")
    private Time timeEnd;
    //endregion

    //region Getters&Setters
    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public Calendar getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(Calendar calendarId) {
        this.calendarId = calendarId;
    }

    public Date getStartPeriod() {
        return startPeriod;
    }

    public void setStartPeriod(Date startPeriod) {
        this.startPeriod = startPeriod;
    }

    public Date getEndPeriod() {
        return endPeriod;
    }

    public void setEndPeriod(Date endPeriod) {
        this.endPeriod = endPeriod;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Time timeStart) {
        this.timeStart = timeStart;
    }

    public Time getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Time timeEnd) {
        this.timeEnd = timeEnd;
    }
    //endregion
}
