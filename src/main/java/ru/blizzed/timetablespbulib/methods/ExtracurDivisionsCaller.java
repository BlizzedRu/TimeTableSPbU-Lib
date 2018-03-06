package ru.blizzed.timetablespbulib.methods;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import ru.blizzed.timetablespbulib.model.divisions.Division;
import ru.blizzed.timetablespbulib.model.extracur.ExtracurEvents;

import java.util.List;

public interface ExtracurDivisionsCaller {

    /*
     * Gets extracurricular divisions
     */
    @GET("extracur/divisions")
    Call<List<Division>> getAll();

    /*
     * Get extracurricular events for a given division
     */
    @GET("extracur/divisions/{alias}/events")
    Call<ExtracurEvents> getEvents(@Path("alias") String alias);

    @GET("extracur/divisions/{alias}/events")
    Call<ExtracurEvents> getEvents(@Path("alias") String alias, @Query("fromDate") String fromDate);

}
