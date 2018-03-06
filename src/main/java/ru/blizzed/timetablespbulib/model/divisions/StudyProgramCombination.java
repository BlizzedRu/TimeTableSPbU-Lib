package ru.blizzed.timetablespbulib.model.divisions;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class StudyProgramCombination {

    @SerializedName("Name")
    private String name;

    @SerializedName("NameEnglish")
    private String nameEnglish;

    @SerializedName("AdmissionYears")
    private List<AdmissionYear> admissionYears;

    public String getName() {
        return name;
    }

    public String getNameEnglish() {
        return nameEnglish;
    }

    public List<AdmissionYear> getAdmissionYears() {
        return admissionYears;
    }

    public static class AdmissionYear {

        @SerializedName("StudyProgramId")
        private int studyProgramId;

        @SerializedName("YearName")
        private String yearName;

        @SerializedName("YearNumber")
        private int yearNumber;

        @SerializedName("IsEmpty")
        private boolean isEmpty;

        @SerializedName("PublicDivisionAlias")
        private String publicDivisionAlias;

        public int getStudyProgramId() {
            return studyProgramId;
        }

        public String getYearName() {
            return yearName;
        }

        public int getYearNumber() {
            return yearNumber;
        }

        public boolean isEmpty() {
            return isEmpty;
        }

        public String getPublicDivisionAlias() {
            return publicDivisionAlias;
        }

    }

}
