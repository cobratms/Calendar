package com.cobratms.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * Event.java - linked to a specific user-defined calendar.
 * Provides information about the event, its date and duration.
 *
 * @author cobratms
 * @version  1.0
 */
@Entity
@Table(name = "events")
public class Event {

    //region Attributes
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private long eventId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "calendar_id", referencedColumnName="calendar_id")
    private Calendar calendar;

    @Column(name = "period_start")
    private LocalDateTime startPeriod;

    @Column(name = "period_end")
    private LocalDateTime endPeriod;
    //endregion

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", calendar=" + calendar +
                ", startPeriod=" + startPeriod +
                ", endPeriod=" + endPeriod +
                '}';
    }

    //region Getters&Setters
    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public LocalDateTime getStartPeriod() {
        return startPeriod;
    }

    public void setStartPeriod(LocalDateTime startPeriod) {
        this.startPeriod = startPeriod;
    }

    public LocalDateTime getEndPeriod() {
        return endPeriod;
    }

    public void setEndPeriod(LocalDateTime endPeriod) {
        this.endPeriod = endPeriod;
    }
    //endregion
}
