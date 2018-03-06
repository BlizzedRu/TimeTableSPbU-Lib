package ru.blizzed.timetablespbulib.model.educators;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Educator {

    @SerializedName("Id")
    private int id;

    @SerializedName("DisplayName")
    private String displayName;

    @SerializedName("FullName")
    private String fullName;

    @SerializedName("Employments")
    private List<Employment> employments;

    public int getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getFullName() {
        return fullName;
    }

    public List<Employment> getEmployments() {
        return employments;
    }

    public static class Employment {

        @SerializedName("Position")
        private String position;

        @SerializedName("Department")
        private String department;

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

    }

}