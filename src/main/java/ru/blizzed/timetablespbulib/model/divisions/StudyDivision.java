package ru.blizzed.timetablespbulib.model.divisions;

import com.google.gson.annotations.SerializedName;

public class StudyDivision extends Division {

    @SerializedName("Oid")
    private String oid;

    public String getOid() {
        return oid;
    }

}