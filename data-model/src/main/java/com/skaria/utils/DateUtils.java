package com.skaria.utils;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    public static final String ISO_DATE_TIME_STANDARD = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
    public static DateTimeFormatter standardDateTimeFormatter;

    static {
        standardDateTimeFormatter = DateTimeFormatter.ofPattern(ISO_DATE_TIME_STANDARD);
    }

    public static String nowStandardUtc(){
        return OffsetDateTime.now(ZoneId.of("UTC")).format(standardDateTimeFormatter);
    }
}
