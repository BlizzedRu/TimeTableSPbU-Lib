package ru.blizzed.timetablespbulib.model.educators;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EducatorSearchResult {

    @SerializedName("EducatorLastNameQuery")
    private String educatorLastNameQuery;

    @SerializedName("Educators")
    private List<Educator> educators;

    public String getEducatorLastNameQuery() {
        return educatorLastNameQuery;
    }

    public List<Educator> getEducators() {
        return educators;
    }

}