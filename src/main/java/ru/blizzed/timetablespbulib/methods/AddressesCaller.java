package ru.blizzed.timetablespbulib.methods;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import ru.blizzed.timetablespbulib.model.addresses.Address;
import ru.blizzed.timetablespbulib.model.addresses.Classroom;
import ru.blizzed.timetablespbulib.model.addresses.ClassroomBusyness;

import java.util.List;
import java.util.Map;

public interface AddressesCaller {

    /*
     * Gets addresses filtered by a given optional criteria
     */
    @GET("addresses")
    Call<List<Address>> getAll();

    @GET("addresses")
    Call<List<Address>> getAll(@QueryMap Map<String, String> queryMap);

    /*
     * Gets classrooms by a given optional criteria
     */
    @GET("addresses/{oid}/classrooms")
    Call<Classroom> getByOid(@Path("oid") String oid);

    @GET("addresses/{oid}/classrooms")
    Call<Classroom> getByOid(@Path("oid") String oid, @QueryMap Map<String, String> queryMap);

    /*
     * Checks whether a given classroom is busy in a specified interval or it's part
     */
    @GET("classrooms/{oid}/isbusy/{start}/{end}")
    Call<ClassroomBusyness> isClassroomBusy(@Path("oid") String oid, @Path("start") String start, @Path("end") String end);

}
