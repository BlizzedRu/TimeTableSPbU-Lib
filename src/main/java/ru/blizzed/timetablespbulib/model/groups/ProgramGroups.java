package ru.blizzed.timetablespbulib.model.groups;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ProgramGroups {

    @SerializedName("Id")
    private int id;

    @SerializedName("Groups")
    private List<Group> groups;

    public int getId() {
        return id;
    }

    public List<Group> getGroups() {
        return groups;
    }

}