package ru.blizzed.timetablespbulib.methods;

import ru.blizzed.timetablespbulib.ApiCaller;
import ru.blizzed.timetablespbulib.model.TimeTableType;
import ru.blizzed.timetablespbulib.model.groups.GroupEvents;
import ru.blizzed.timetablespbulib.utils.TimeUtils;

import java.time.Instant;

public class GroupsApiMethod extends ApiMethod<GroupsCaller> {

    private static final String DATE_PATTERN = "yyyy-MM-dd";

    public GroupsApiMethod(GroupsCaller caller) {
        super(caller);
    }

    /**
     * Gets a given student group's events for the current week
     *
     * @param id student group's id
     * @return {@link ApiCaller} to call TimeTable API
     */
    public ApiCaller<GroupEvents> getEvents(int id) {
        return new ApiCaller<>(getCaller().getEvents(id));
    }

    /**
     * Gets a given student group's events for the current week
     *
     * @param id   student group's id
     * @param type type of timetable (all, primary, attestation etc)
     * @return {@link ApiCaller} to call TimeTable API
     */
    public ApiCaller<GroupEvents> getEvents(int id, TimeTableType type) {
        return new ApiCaller<>(getCaller().getEvents(id, type.getIndex()));
    }

    /**
     * Gets a given student group's events for a week starting from a specified datetime until the end of the week
     *
     * @param id   student group's id
     * @param from datetime the events start from
     * @return {@link ApiCaller} to call TimeTable API
     */
    public ApiCaller<GroupEvents> getEvents(int id, Instant from) {
        return new ApiCaller<>(getCaller().getEvents(id, TimeUtils.convertTime(from, DATE_PATTERN)));
    }

    /**
     * Gets a given student group's events for the current week
     *
     * @param id   student group's id
     * @param from datetime the events start from
     * @param type type of timetable (all, primary, attestation etc)
     * @return {@link ApiCaller} to call TimeTable API
     */
    public ApiCaller<GroupEvents> getEvents(int id, Instant from, TimeTableType type) {
        return new ApiCaller<>(getCaller().getEvents(id, TimeUtils.convertTime(from, DATE_PATTERN), type.getIndex()));
    }

    /**
     * Gets events for a specified date range
     *
     * @param id   student group's id
     * @param from datetime the events start from
     * @param to   datetime the events end
     * @return {@link ApiCaller} to call TimeTable API
     */
    public ApiCaller<GroupEvents> getEvents(int id, Instant from, Instant to) {
        return new ApiCaller<>(getCaller().getEvents(id, TimeUtils.convertTime(from, DATE_PATTERN), TimeUtils.convertTime(to, DATE_PATTERN)));
    }

    /**
     * Gets events for a specified date range
     *
     * @param id   student group's id
     * @param from datetime the events start from
     * @param to   datetime the events end
     * @param type type of timetable (all, primary, attestation etc)
     * @return {@link ApiCaller} to call TimeTable API
     */
    public ApiCaller<GroupEvents> getEvents(int id, Instant from, Instant to, TimeTableType type) {
        return new ApiCaller<>(getCaller().getEvents(id, TimeUtils.convertTime(from, DATE_PATTERN), TimeUtils.convertTime(to, DATE_PATTERN), type.getIndex()));
    }


}
