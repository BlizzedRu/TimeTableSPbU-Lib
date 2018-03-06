package ru.blizzed.timetablespbulib.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EventsPage {

    @SerializedName("PreviousWeekMonday")
    private String previousWeekMonday;

    @SerializedName("NextWeekMonday")
    private String nextWeekMonday;

    @SerializedName("IsPreviousWeekReferenceAvailable")
    private boolean isPreviousWeekReferenceAvailable;

    @SerializedName("IsNextWeekReferenceAvailable")
    private boolean isNextWeekReferenceAvailable;

    @SerializedName("IsCurrentWeekReferenceAvailable")
    private boolean isCurrentWeekReferenceAvailable;

    @SerializedName("WeekDisplayText")
    private String weekDisplayText;

    @SerializedName("WeekMonday")
    private String weekMonday;

    @SerializedName("Days")
    private List<Day> days;

    public String getPreviousWeekMonday() {
        return previousWeekMonday;
    }

    public String getNextWeekMonday() {
        return nextWeekMonday;
    }

    public boolean isPreviousWeekReferenceAvailable() {
        return isPreviousWeekReferenceAvailable;
    }

    public boolean isNextWeekReferenceAvailable() {
        return isNextWeekReferenceAvailable;
    }

    public boolean isCurrentWeekReferenceAvailable() {
        return isCurrentWeekReferenceAvailable;
    }

    public String getWeekDisplayText() {
        return weekDisplayText;
    }

    public String getWeekMonday() {
        return weekMonday;
    }

    public List<Day> getDays() {
        return days;
    }
}
