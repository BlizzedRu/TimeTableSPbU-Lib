package ru.blizzed.timetablespbulib.methods;

import ru.blizzed.timetablespbulib.ApiCaller;
import ru.blizzed.timetablespbulib.model.educators.EducatorSchedule;
import ru.blizzed.timetablespbulib.model.educators.EducatorSearchResult;

public class EducatorsApiMethod extends ApiMethod<EducatorsCaller> {

    public EducatorsApiMethod(EducatorsCaller caller) {
        super(caller);
    }

    /**
     * Gets an educator's events for the current study term
     *
     * @param id educator id
     * @return {@link ApiCaller} to call TimeTable API
     */
    public ApiCaller<EducatorSchedule> getSchedule(int id) {
        return new ApiCaller<>(getCaller().getSchedule(id));
    }

    /**
     * Gets educators by searching their's last name or a part of last name
     *
     * @param query query to search
     * @return {@link ApiCaller} to call TimeTable API
     */
    public ApiCaller<EducatorSearchResult> search(String query) {
        return new ApiCaller<>(getCaller().search(query));
    }

}
