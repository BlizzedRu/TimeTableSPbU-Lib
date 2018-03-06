package ru.blizzed.timetablespbulib.model.addresses;

import com.google.gson.annotations.SerializedName;

public class BaseAddress {

    @SerializedName("Oid")
    private String oid;

    @SerializedName("DisplayName1")
    private String displayName1;

    @SerializedName("wantingEquipment")
    private String wantingEquipment;

    public String getOid() {
        return oid;
    }

    public String getDisplayName1() {
        return displayName1;
    }

    public String getWantingEquipment() {
        return wantingEquipment;
    }

}