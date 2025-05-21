package hw10;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public final class TransformTime {
    public static long toMilliSec (LocalDate birthDay) {
        return birthDay
                .atStartOfDay(ZoneId.of("UTC"))
                .toInstant()
                .toEpochMilli();
    }

    public static LocalDate toLocalDate (long date){
        return Instant.ofEpochMilli(date)
                .atZone(ZoneId.of("UTC"))
                .toLocalDate();
    }

    public static String dateToString (long date) {
        LocalDate localDate = toLocalDate(date);
        return localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public  static long stringToLong (String date) {
        return toMilliSec(LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
