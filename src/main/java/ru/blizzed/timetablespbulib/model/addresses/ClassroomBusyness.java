package ru.blizzed.timetablespbulib.model.addresses;

import com.google.gson.annotations.SerializedName;

public class ClassroomBusyness {

    @SerializedName("Oid")
    private String oid;

    @SerializedName("From")
    private String from;

    @SerializedName("To")
    private String to;

    @SerializedName("IsBusy")
    private boolean isBusy;

    public String getOid() {
        return oid;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public boolean isBusy() {
        return isBusy;
    }

}