package ru.blizzed.timetablespbulib.methods;

import ru.blizzed.timetablespbulib.ApiCaller;
import ru.blizzed.timetablespbulib.model.divisions.StudyDivision;
import ru.blizzed.timetablespbulib.model.divisions.StudyLevel;
import ru.blizzed.timetablespbulib.model.groups.ProgramGroups;

import java.util.List;

public class DivisionsApiMethod extends ApiMethod<DivisionsCaller> {

    public DivisionsApiMethod(DivisionsCaller caller) {
        super(caller);
    }

    /**
     * Gets a given study program's student groups for the current study year
     *
     * @param id program id
     * @return {@link ApiCaller} to call TimeTable API
     */
    public ApiCaller<ProgramGroups> getProgramGroups(int id) {
        return new ApiCaller<>(getCaller().getProgramGroups(id));
    }

    /**
     * Gets study divisions
     *
     * @return {@link ApiCaller} to call TimeTable API
     */
    public ApiCaller<List<StudyDivision>> getAll() {
        return new ApiCaller<>(getCaller().getAll());
    }

    /**
     * Gets study programs with levels for a given study division
     *
     * @param alias the division's short name code (alias)
     * @return {@link ApiCaller} to call TimeTable API
     */
    public ApiCaller<List<StudyLevel>> getProgramLevels(String alias) {
        return new ApiCaller<>(getCaller().getProgramLevels(alias));
    }

}
