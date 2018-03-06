package ru.blizzed.timetablespbulib.utils;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class TimeUtils {

    public static String convertTime(Instant instant, String format) {
        return new SimpleDateFormat(format).format(Date.from(instant));
    }

}
