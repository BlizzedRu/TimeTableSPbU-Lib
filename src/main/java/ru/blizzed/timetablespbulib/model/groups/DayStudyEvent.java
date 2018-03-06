package ru.blizzed.timetablespbulib.model.groups;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import ru.blizzed.timetablespbulib.model.EventLocation;
import ru.blizzed.timetablespbulib.model.educators.EducatorId;

public class DayStudyEvent {

    @SerializedName("StudyEventsTimeTableKindCode")
    private int studyEventsTimeTableKindCode;

    @SerializedName("Start")
    private String start;

    @SerializedName("End")
    private String end;

    @SerializedName("Subject")
    private String subject;

    @SerializedName("TimeIntervalString")
    private String timeIntervalString;

    @SerializedName("DateWithTimeIntervalString")
    private String dateWithTimeIntervalString;

    @SerializedName("DisplayDateAndTimeIntervalString")
    private String displayDateAndTimeIntervalString;

    @SerializedName("LocationsDisplayText")
    private String locationsDisplayText;

    @SerializedName("EducatorsDisplayText")
    private String educatorsDisplayText;

    @SerializedName("HasEducators")
    private boolean hasEducators;

    @SerializedName("IsCancelled")
    private boolean isCancelled;

    @SerializedName("ContingentUnitName")
    private String contingentUnitName;

    @SerializedName("DivisionAndCourse")
    private String divisionAndCourse;

    @SerializedName("IsAssigned")
    private boolean isAssigned;

    @SerializedName("TimeWasChanged")
    private boolean timeWasChanged;

    @SerializedName("LocationsWereChanged")
    private boolean locationsWereChanged;

    @SerializedName("EducatorsWereReassigned")
    private boolean educatorsWereReassigned;

    @SerializedName("ElectiveDisciplinesCount")
    private int electiveDisciplinesCount;

    @SerializedName("IsElective")
    private boolean isElective;

    @SerializedName("HasTheSameTimeAsPreviousItem")
    private boolean hasTheSameTimeAsPreviousItem;

    @SerializedName("ContingentUnitsDisplayTest")
    private String contingentUnitsDisplayTest;

    @SerializedName("IsStudy")
    private boolean isStudy;

    @SerializedName("AllDay")
    private boolean allDay;

    @SerializedName("WithinTheSameDay")
    private boolean withinTheSameDay;

    @SerializedName("EventLocations")
    private List<EventLocation> eventLocations;

    @SerializedName("EducatorIds")
    private List<EducatorId> educatorIds;

    public int getStudyEventsTimeTableKindCode() {
        return studyEventsTimeTableKindCode;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public String getSubject() {
        return subject;
    }

    public String getTimeIntervalString() {
        return timeIntervalString;
    }

    public String getDateWithTimeIntervalString() {
        return dateWithTimeIntervalString;
    }

    public String getDisplayDateAndTimeIntervalString() {
        return displayDateAndTimeIntervalString;
    }

    public String getLocationsDisplayText() {
        return locationsDisplayText;
    }

    public String getEducatorsDisplayText() {
        return educatorsDisplayText;
    }

    public boolean isHasEducators() {
        return hasEducators;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public String getContingentUnitName() {
        return contingentUnitName;
    }

    public String getDivisionAndCourse() {
        return divisionAndCourse;
    }

    public boolean isAssigned() {
        return isAssigned;
    }

    public boolean isTimeWasChanged() {
        return timeWasChanged;
    }

    public boolean isLocationsWereChanged() {
        return locationsWereChanged;
    }

    public boolean isEducatorsWereReassigned() {
        return educatorsWereReassigned;
    }

    public int getElectiveDisciplinesCount() {
        return electiveDisciplinesCount;
    }

    public boolean isElective() {
        return isElective;
    }

    public boolean isHasTheSameTimeAsPreviousItem() {
        return hasTheSameTimeAsPreviousItem;
    }

    public String getContingentUnitsDisplayTest() {
        return contingentUnitsDisplayTest;
    }

    public boolean isStudy() {
        return isStudy;
    }

    public boolean isAllDay() {
        return allDay;
    }

    public boolean isWithinTheSameDay() {
        return withinTheSameDay;
    }

    public List<EventLocation> getEventLocations() {
        return eventLocations;
    }

    public List<EducatorId> getEducatorIds() {
        return educatorIds;
    }

}