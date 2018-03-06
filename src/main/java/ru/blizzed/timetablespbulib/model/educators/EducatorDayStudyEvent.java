package ru.blizzed.timetablespbulib.model.educators;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import ru.blizzed.timetablespbulib.model.EventLocation;

public class EducatorDayStudyEvent {

    @SerializedName("Start")
    private String start;

    @SerializedName("End")
    private String end;

    @SerializedName("Subject")
    private String subject;

    @SerializedName("TimeIntervalString")
    private String timeIntervalString;

    @SerializedName("Dates")
    private List<String> dates;

    @SerializedName("EducatorsDisplayText")
    private String educatorsDisplayText;

    @SerializedName("IsCanceled")
    private boolean isCanceled;

    @SerializedName("StudyEventsTimeTableKindCode")
    private int studyEventsTimeTableKindCode;

    @SerializedName("EducatorIds")
    private List<EducatorId> educatorIds;

    @SerializedName("EventLocations")
    private List<EventLocation> eventLocations;

    @SerializedName("ContingentUnitNames")
    private List<ContingentUnitName> contingentUnitNames;

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

    public List<String> getDates() {
        return dates;
    }

    public String getEducatorsDisplayText() {
        return educatorsDisplayText;
    }

    public boolean isCanceled() {
        return isCanceled;
    }

    public int getStudyEventsTimeTableKindCode() {
        return studyEventsTimeTableKindCode;
    }

    public List<EducatorId> getEducatorIds() {
        return educatorIds;
    }

    public List<EventLocation> getEventLocations() {
        return eventLocations;
    }

    public List<ContingentUnitName> getContingentUnitNames() {
        return contingentUnitNames;
    }

    public static class ContingentUnitName {

        @SerializedName("Item1")
        private String item1;

        @SerializedName("Item2")
        private String item2;

        public String getItem1() {
            return item1;
        }

        public String getItem2() {
            return item2;
        }

    }

}