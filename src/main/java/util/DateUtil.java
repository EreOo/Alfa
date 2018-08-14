package util;

import java.util.Calendar;

/**
 * Created Vladimir Shekhavtsov.
 * Create and return correct date format for naming in FileSaver.class.
 */
public final class DateUtil {

    private DateUtil() {
    }

    public static String getDate() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        // JANUARY is 0, because +1 for real month number.
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        return day + "-" + month + "-" + year + "__" + hour + "-" + minute;
    }
}
