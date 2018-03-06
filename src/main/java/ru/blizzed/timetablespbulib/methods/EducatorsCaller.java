package ru.blizzed.timetablespbulib.methods;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import ru.blizzed.timetablespbulib.model.educators.EducatorSchedule;
import ru.blizzed.timetablespbulib.model.educators.EducatorSearchResult;

public interface EducatorsCaller {

    /*
     * Gets an educator's events for the current study term
     */
    @GET("educators/{id}/events")
    Call<EducatorSchedule> getSchedule(@Path("id") int id);

    /*
     * Gets educators by searching their's last name or a part of last name
     */
    @GET("educators/search/{query}")
    Call<EducatorSearchResult> search(@Path("query") String query);

}
