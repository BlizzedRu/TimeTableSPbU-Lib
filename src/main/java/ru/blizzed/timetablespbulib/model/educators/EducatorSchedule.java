package ru.blizzed.timetablespbulib.model.educators;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class EducatorSchedule {

    @SerializedName("Title")
    private String title;

    @SerializedName("EducatorDisplayText")
    private String educatorDisplayText;

    @SerializedName("EducatorLongDisplayText")
    private String educatorLongDisplayText;

    @SerializedName("DateRangeDisplayText")
    private String dateRangeDisplayText;

    @SerializedName("EducatorMasterId")
    private int educatorMasterId;

    @SerializedName("IsSpringTerm")
    private boolean isSpringTerm;

    @SerializedName("From")
    private String from;

    @SerializedName("To")
    private String to;

    @SerializedName("Next")
    private int next;

    @SerializedName("SpringTermLinkAvailable")
    private boolean springTermLinkAvailable;

    @SerializedName("AutumnTermLinkAvailable")
    private boolean autumnTermLinkAvailable;

    @SerializedName("HasEvents")
    private boolean hasEvents;

    @SerializedName("EducatorEventsDays")
    private List<EducatorEventDay> educatorEventDays;

    public String getTitle() {
        return title;
    }

    public String getEducatorDisplayText() {
        return educatorDisplayText;
    }

    public String getEducatorLongDisplayText() {
        return educatorLongDisplayText;
    }

    public String getDateRangeDisplayText() {
        return dateRangeDisplayText;
    }

    public int getEducatorMasterId() {
        return educatorMasterId;
    }

    public boolean isSpringTerm() {
        return isSpringTerm;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getNext() {
        return next;
    }

    public boolean isSpringTermLinkAvailable() {
        return springTermLinkAvailable;
    }

    public boolean isAutumnTermLinkAvailable() {
        return autumnTermLinkAvailable;
    }

    public boolean isHasEvents() {
        return hasEvents;
    }

    public List<EducatorEventDay> getEducatorEventDays() {
        return educatorEventDays;
    }

}