package ru.blizzed.timetablespbulib;

import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.blizzed.timetablespbulib.methods.*;
import ru.blizzed.timetablespbulib.model.ApiError;

import java.io.IOException;
import java.lang.annotation.Annotation;

public class TimeTableApi {

    private static final String ROOT_URL = "https://timetable.spbu.ru/api/v1/";

    private static TimeTableApi instance;

    private Retrofit retrofit;

    private AddressesApiMethod addressesApiMethod;
    private DivisionsApiMethod divisionsApiMethod;
    private EducatorsApiMethod educatorsApiMethod;
    private ExtracurDivisionsApiMethod extracurDivisionsApiMethod;
    private GroupsApiMethod groupsApiMethod;

    private TimeTableApi() {
        retrofit = new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static AddressesApiMethod addresses() {
        if (getInstance().addressesApiMethod == null)
            instance.addressesApiMethod = new AddressesApiMethod(instance.createService(AddressesCaller.class));
        return instance.addressesApiMethod;
    }

    public static DivisionsApiMethod divisions() {
        if (getInstance().divisionsApiMethod == null)
            instance.divisionsApiMethod = new DivisionsApiMethod(instance.createService(DivisionsCaller.class));
        return instance.divisionsApiMethod;
    }

    public static EducatorsApiMethod educators() {
        if (getInstance().educatorsApiMethod == null)
            instance.educatorsApiMethod = new EducatorsApiMethod(instance.createService(EducatorsCaller.class));
        return instance.educatorsApiMethod;
    }

    public static ExtracurDivisionsApiMethod extracurDivisions() {
        if (getInstance().extracurDivisionsApiMethod == null)
            instance.extracurDivisionsApiMethod = new ExtracurDivisionsApiMethod(instance.createService(ExtracurDivisionsCaller.class));
        return instance.extracurDivisionsApiMethod;
    }

    public static GroupsApiMethod groups() {
        if (getInstance().groupsApiMethod == null)
            instance.groupsApiMethod = new GroupsApiMethod(instance.createService(GroupsCaller.class));
        return instance.groupsApiMethod;
    }

    static TimeTableApi getInstance() {
        if (instance == null)
            instance = new TimeTableApi();
        return instance;
    }

    ApiError parseApiError(ResponseBody responseBody) throws IOException {
        Converter<ResponseBody, ApiError> converter = retrofit.responseBodyConverter(ApiError.class, new Annotation[0]);
        return converter.convert(responseBody);
    }

    private <T> T createService(Class<T> service) {
        return retrofit.create(service);
    }

}
