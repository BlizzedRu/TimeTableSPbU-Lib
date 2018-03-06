package ru.blizzed.timetablespbulib.methods;

import ru.blizzed.timetablespbulib.ApiCaller;
import ru.blizzed.timetablespbulib.model.divisions.Division;
import ru.blizzed.timetablespbulib.model.extracur.ExtracurEvents;
import ru.blizzed.timetablespbulib.utils.TimeUtils;

import java.time.Instant;
import java.util.List;

public class ExtracurDivisionsApiMethod extends ApiMethod<ExtracurDivisionsCaller> {

    public ExtracurDivisionsApiMethod(ExtracurDivisionsCaller caller) {
        super(caller);
    }

    /**
     * Gets extracurricular divisions
     *
     * @return {@link ApiCaller} to call TimeTable API
     */
    public ApiCaller<List<Division>> getAll() {
        return new ApiCaller<>(getCaller().getAll());
    }

    /**
     * Get extracurricular events for a given division
     *
     * @param alias The division's short name code (alias)
     * @return {@link ApiCaller} to call TimeTable API
     */
    public ApiCaller<ExtracurEvents> getEvents(String alias) {
        return new ApiCaller<>(getCaller().getEvents(alias));
    }

    /**
     * Get extracurricular events for a given division
     *
     * @param alias    The division's short name code (alias)
     * @param fromDate the date the events start from
     * @return {@link ApiCaller} to call TimeTable API
     */
    public ApiCaller<ExtracurEvents> getEvents(String alias, Instant fromDate) {
        return new ApiCaller<>(getCaller().getEvents(alias, TimeUtils.convertTime(fromDate, "yyyy-MM-dd")));
    }

}
