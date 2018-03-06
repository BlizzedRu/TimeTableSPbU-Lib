package ru.blizzed.timetablespbulib.model.divisions;

import com.google.gson.annotations.SerializedName;

public class Division {

    @SerializedName("Alias")
    private String alias;

    @SerializedName("Name")
    private String name;

    public String getAlias() {
        return alias;
    }

    public String getName() {
        return name;
    }

}
