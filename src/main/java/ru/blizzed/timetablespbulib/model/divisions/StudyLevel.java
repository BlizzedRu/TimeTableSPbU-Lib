package ru.blizzed.timetablespbulib.model.divisions;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class StudyLevel {

    @SerializedName("StudyLevelName")
    private String studyLevelName;

    @SerializedName("StudyLevelNameEnglish")
    private String studyLevelNameEnglish;

    @SerializedName("HasCourse6")
    private boolean hasCourse;

    @SerializedName("StudyProgramCombinations")
    private List<StudyProgramCombination> studyProgramCombinations;

    public String getStudyLevelName() {
        return studyLevelName;
    }

    public String getStudyLevelNameEnglish() {
        return studyLevelNameEnglish;
    }

    public boolean isHasCourse() {
        return hasCourse;
    }

    public List<StudyProgramCombination> getStudyProgramCombinations() {
        return studyProgramCombinations;
    }

}