package com.cobratms.domain;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "calendars")
public class Calendar {

    //region Attributes
    @Id
    @Column(name = "calendar_id")
    private long calendarId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;

    @Column(name = "name")
    private String name;
    //endregion

    //region Getters&Setters
    public long getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(long calendarId) {
        this.calendarId = calendarId;
    }

    public User getUserID() {
        return userId;
    }

    public void setUserID(User userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //endregion


}
