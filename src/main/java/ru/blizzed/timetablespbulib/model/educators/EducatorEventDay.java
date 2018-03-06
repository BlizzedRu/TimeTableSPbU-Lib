
package ru.blizzed.timetablespbulib.model.educators;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class EducatorEventDay {

    @SerializedName("Day")
    private String day;

    @SerializedName("DayString")
    private String dayString;

    @SerializedName("DayStudyEventsCount")
    private int dayStudyEventsCount;

    @SerializedName("DayStudyEvents")
    private List<EducatorDayStudyEvent> educatorDayStudyEvents;

    public String getDay() {
        return day;
    }

    public String getDayString() {
        return dayString;
    }

    public int getDayStudyEventsCount() {
        return dayStudyEventsCount;
    }

    public List<EducatorDayStudyEvent> getEducatorDayStudyEvents() {
        return educatorDayStudyEvents;
    }

}
