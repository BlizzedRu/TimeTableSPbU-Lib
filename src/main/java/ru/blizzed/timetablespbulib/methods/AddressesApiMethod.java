package ru.blizzed.timetablespbulib.methods;

import ru.blizzed.timetablespbulib.ApiCaller;
import ru.blizzed.timetablespbulib.model.addresses.Address;
import ru.blizzed.timetablespbulib.model.addresses.Classroom;
import ru.blizzed.timetablespbulib.model.addresses.ClassroomBusyness;
import ru.blizzed.timetablespbulib.utils.TimeUtils;

import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressesApiMethod extends ApiMethod<AddressesCaller> {

    public AddressesApiMethod(AddressesCaller caller) {
        super(caller);
    }

    /**
     * Gets all available addresses
     *
     * @return {@link ApiCaller} to call TimeTable API
     */
    public ApiCaller<List<Address>> getAll() {
        return new ApiCaller<>(getCaller().getAll());
    }


    /**
     * Gets addresses filtered by a given optional criteria
     *
     * @param seatingType type of seating. More at {@link Address.Type}
     * @param minCapacity minimal classroom capacity
     * @param equipments  desired classroom equipment
     * @return {@link ApiCaller} to call TimeTable API
     */
    public ApiCaller<List<Address>> getAll(Address.Type seatingType, int minCapacity, List<String> equipments) {
        return new ApiCaller<>(getCaller().getAll(generateQueryMap(seatingType, minCapacity, equipments)));
    }

    /**
     * Gets classrooms by given oid
     *
     * @param oid oid of desired classroom
     * @return {@link ApiCaller} to call TimeTable API
     */
    public ApiCaller<Classroom> getByOid(String oid) {
        return new ApiCaller<>(getCaller().getByOid(oid));
    }

    /**
     * Gets classrooms by given oid
     *
     * @param seatingType type of seating. More at {@link Address.Type}
     * @param minCapacity minimal classroom capacity
     * @param equipments  desired classroom equipment
     * @param oid         oid of desired classroom
     * @return {@link ApiCaller} to call TimeTable API
     */
    public ApiCaller<Classroom> getByOid(String oid, Address.Type seatingType, int minCapacity, List<String> equipments) {
        return new ApiCaller<>(getCaller().getByOid(oid, generateQueryMap(seatingType, minCapacity, equipments)));
    }

    /**
     * Checks whether a given classroom is busy in a specified interval or it's par
     *
     * @param oid  oid of desired classroom
     * @param from time from
     * @param to   time to
     * @return {@link ApiCaller} to call TimeTable API
     */
    public ApiCaller<ClassroomBusyness> isClassroomBusy(String oid, Instant from, Instant to) {
        String timePattern = "yyyyMMddHHmm";
        return new ApiCaller<>(getCaller().isClassroomBusy(oid, TimeUtils.convertTime(from, timePattern), TimeUtils.convertTime(to, timePattern)));
    }

    private Map<String, String> generateQueryMap(Address.Type seatingType, int minCapacity, List<String> equipments) {
        Map<String, String> queryMap = new HashMap<>();
        queryMap.put("seating", String.valueOf(seatingType.getIndex()));
        queryMap.put("capacity", String.valueOf(minCapacity));
        queryMap.put("equipment", String.join(",", equipments));
        return queryMap;
    }

}
