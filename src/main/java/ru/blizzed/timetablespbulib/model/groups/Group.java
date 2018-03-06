
package ru.blizzed.timetablespbulib.model.groups;

import com.google.gson.annotations.SerializedName;

public class Group {

    @SerializedName("StudentGroupId")
    private int studentGroupId;

    @SerializedName("StudentGroupName")
    private String studentGroupName;

    @SerializedName("StudentGroupStudyForm")
    private String studentGroupStudyForm;

    @SerializedName("StudentGroupProfiles")
    private String studentGroupProfiles;

    @SerializedName("PublicDivisionAlias")
    private String publicDivisionAlias;

    public int getStudentGroupId() {
        return studentGroupId;
    }

    public String getStudentGroupName() {
        return studentGroupName;
    }

    public String getStudentGroupStudyForm() {
        return studentGroupStudyForm;
    }

    public String getStudentGroupProfiles() {
        return studentGroupProfiles;
    }

    public String getPublicDivisionAlias() {
        return publicDivisionAlias;
    }

}
