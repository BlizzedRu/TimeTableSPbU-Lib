package ru.blizzed.timetablespbulib.model;

import com.google.gson.annotations.SerializedName;

public class Event {

    @SerializedName("Id")
    private int id;

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

    @SerializedName("LocationsDisplayText")
    private String locationsDisplayText;

    @SerializedName("EducatorsDisplayText")
    private String educatorsDisplayText;

    @SerializedName("HasEducators")
    private boolean hasEducators;

    @SerializedName("IsCancelled")
    private boolean isCancelled;

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

    @SerializedName("DisplayDateAndTimeIntervalString")
    private String displayDateAndTimeIntervalString;

    @SerializedName("ViewKind")
    private int viewKind;

    @SerializedName("DivisionAlias")
    private String divisionAlias;

    @SerializedName("RecurrenceIndex")
    private int recurrenceIndex;

    @SerializedName("FullDateWithTimeIntervalString")
    private String fullDateWithTimeIntervalString;

    @SerializedName("Year")
    private int year;

    @SerializedName("ShowYear")
    private boolean showYear;

    @SerializedName("ShowImmediate")
    private boolean showImmediate;

    @SerializedName("IsShowImmediateHidden")
    private boolean isShowImmediateHidden;

    @SerializedName("HasAgenda")
    private boolean hasAgenda;

    @SerializedName("IsRecurrence")
    private boolean isRecurrence;

    @SerializedName("SubkindDisplayName")
    private String subkindDisplayName;

    @SerializedName("OrderIndex")
    private int orderIndex;

    @SerializedName("Location")
    private EventLocation location;

    @SerializedName("IsEmpty")
    private boolean isEmpty;

    @SerializedName("FromDate")
    private String fromDate;

    @SerializedName("FromDateString")
    private String fromDateString;

    @SerializedName("IsPhys")
    private boolean isPhys;

    @SerializedName("ResponsiblePersonContacts")
    private String responsiblePersonContacts;

    public int getId() {
        return id;
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

    public String getDisplayDateAndTimeIntervalString() {
        return displayDateAndTimeIntervalString;
    }

    public int getViewKind() {
        return viewKind;
    }

    public String getDivisionAlias() {
        return divisionAlias;
    }

    public int getRecurrenceIndex() {
        return recurrenceIndex;
    }

    public String getFullDateWithTimeIntervalString() {
        return fullDateWithTimeIntervalString;
    }

    public int getYear() {
        return year;
    }

    public boolean isShowYear() {
        return showYear;
    }

    public boolean isShowImmediate() {
        return showImmediate;
    }

    public boolean isShowImmediateHidden() {
        return isShowImmediateHidden;
    }

    public boolean isHasAgenda() {
        return hasAgenda;
    }

    public boolean isRecurrence() {
        return isRecurrence;
    }

    public String getSubkindDisplayName() {
        return subkindDisplayName;
    }

    public int getOrderIndex() {
        return orderIndex;
    }

    public EventLocation getLocation() {
        return location;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public String getFromDate() {
        return fromDate;
    }

    public String getFromDateString() {
        return fromDateString;
    }

    public boolean isPhys() {
        return isPhys;
    }

    public String getResponsiblePersonContacts() {
        return responsiblePersonContacts;
    }

}