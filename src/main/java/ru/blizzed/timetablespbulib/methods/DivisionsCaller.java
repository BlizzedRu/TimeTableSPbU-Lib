package ru.blizzed.timetablespbulib.methods;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import ru.blizzed.timetablespbulib.model.divisions.StudyDivision;
import ru.blizzed.timetablespbulib.model.divisions.StudyLevel;
import ru.blizzed.timetablespbulib.model.groups.ProgramGroups;

import java.util.List;

public interface DivisionsCaller {

    /*
     * Gets a given study program's student groups for the current study year
     */
    @GET("progams/{id}/groups")
    Call<ProgramGroups> getProgramGroups(@Path("id") int id);

    /*
     * Gets study divisions
     */
    @GET("study/divisions")
    Call<List<StudyDivision>> getAll();

    /*
     * Gets study programs with levels for a given study division
     */
    @GET("study/divisions/{alias}/programs/levels")
    Call<List<StudyLevel>> getProgramLevels(@Path("alias") String alias);

}
