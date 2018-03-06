package ru.blizzed.timetablespbulib.model.groups;

import com.google.gson.annotations.SerializedName;
import ru.blizzed.timetablespbulib.model.EventsPage;

public class GroupEvents extends EventsPage {

    @SerializedName("StudentGroupId")
    private int studentGroupId;

    @SerializedName("StudentGroupDisplayName")
    private String studentGroupDisplayName;

    @SerializedName("TimeTableDisplayName")
    private String timeTableDisplayName;

    public int getStudentGroupId() {
        return studentGroupId;
    }

    public String getStudentGroupDisplayName() {
        return studentGroupDisplayName;
    }

    public String getTimeTableDisplayName() {
        return timeTableDisplayName;
    }

}