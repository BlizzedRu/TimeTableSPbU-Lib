package ru.blizzed.timetablespbulib.model;

import com.google.gson.annotations.SerializedName;

public class EventLocation {

    @SerializedName("IsEmpty")    
    private boolean isEmpty;

    @SerializedName("DisplayName")    
    private String displayName;

    @SerializedName("HasGeographicCoordinates")    
    private boolean hasGeographicCoordinates;

    @SerializedName("Latitude")
    private long latitude;

    @SerializedName("Longitude")
    private long longitude;

    @SerializedName("LatitudeValue")
    private String latitudeValue;

    @SerializedName("LongitudeValue")
    private String longitudeValue;

    public boolean isEmpty() {
        return isEmpty;
    }

    public String getDisplayName() {
        return displayName;
    }

    public boolean isHasGeographicCoordinates() {
        return hasGeographicCoordinates;
    }

    public long getLatitude() {
        return latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public String getLatitudeValue() {
        return latitudeValue;
    }

    public String getLongitudeValue() {
        return longitudeValue;
    }

}