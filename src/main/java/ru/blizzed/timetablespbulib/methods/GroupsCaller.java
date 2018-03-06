package ru.blizzed.timetablespbulib.methods;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import ru.blizzed.timetablespbulib.model.groups.GroupEvents;

public interface GroupsCaller {

    /*
     * Gets a given student group's events for the current week
     */
    @GET("groups/{id}/events")
    Call<GroupEvents> getEvents(@Path("id") int id);

    @GET("groups/{id}/events")
    Call<GroupEvents> getEvents(@Path("id") int id, @Query("timetable") int timetable);

    /*
     * Gets a given student group's events for a week starting from a specified datetime until the end of the week
     */
    @GET("groups/{id}/events/{from}")
    Call<GroupEvents> getEvents(@Path("id") int id, @Path("from") String from);

    @GET("groups/{id}/events/{from}")
    Call<GroupEvents> getEvents(@Path("id") int id, @Path("from") String from, @Query("timetable") int timetable);

    /*
     * Gets events for a specified date range
     */
    @GET("groups/{id}/events/{from}/{to}")
    Call<GroupEvents> getEvents(@Path("id") int id, @Path("from") String from, @Path("to") String to);

    @GET("groups/{id}/events/{from}/{to}")
    Call<GroupEvents> getEvents(@Path("id") int id, @Path("from") String from, @Path("to") String to, @Query("timetable") int timetable);

}
