package ru.blizzed.timetablespbulib.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Day {

    @SerializedName("Day")
    private String day;

    @SerializedName("DayString")
    private String dayString;

    @SerializedName("DayEvents")
    private List<Event> dayEvents;

    public String getDay() {
        return day;
    }

    public String getDayString() {
        return dayString;
    }

    public List<Event> getDayEvents() {
        return dayEvents;
    }

}
