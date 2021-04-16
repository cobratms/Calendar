package com.cobratms.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Calendar.java - stores the user's events. The type of calendar is user-defined.
 *
 * @author cobratms
 * @version  1.0
 */
@Entity
@Table(name = "calendars")
public class Calendar {

    //region Attributes
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "calendar_id")
    private long calendarId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "name")
    private String name;
    //endregion

    @OneToMany(mappedBy = "calendar", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Event> events;

    //region Getters&Setters
    public long getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(long calendarId) {
        this.calendarId = calendarId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User userId) {
        this.user = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //endregion

    @Override
    public String toString() {
        return "Calendar{" +
                "calendarId=" + calendarId +
                ", user=" + user +
                ", name='" + name + '\'' +
                '}';
    }
}
