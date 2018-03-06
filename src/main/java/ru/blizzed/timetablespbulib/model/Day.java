package ru.blizzed.timetablespbulib.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Day {

    @SerializedName("Day")
    private String day;

    @SerializedName("DayString")
    private String dayString;

    @SerializedName(value = "DayEvents", alternate = "DayStudyEvents")
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
