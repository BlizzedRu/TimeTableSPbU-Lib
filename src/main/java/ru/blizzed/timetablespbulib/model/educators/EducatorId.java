
package ru.blizzed.timetablespbulib.model.educators;

import com.google.gson.annotations.SerializedName;

public class EducatorId {

    @SerializedName("Item1")
    private int item1;

    @SerializedName("Item2")
    private String item2;

    public int getItem1() {
        return item1;
    }

    public String getItem2() {
        return item2;
    }

}
