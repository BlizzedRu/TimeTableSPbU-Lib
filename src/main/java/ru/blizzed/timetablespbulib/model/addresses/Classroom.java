package ru.blizzed.timetablespbulib.model.addresses;

import com.google.gson.annotations.SerializedName;

public class Classroom extends BaseAddress {

    @SerializedName("SeatingType")
    private int seatingType;

    @SerializedName("Capacity")
    private int capacity;

    @SerializedName("AdditionalInfo")
    private String additionalInfo;

    public int getSeatingType() {
        return seatingType;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

}
