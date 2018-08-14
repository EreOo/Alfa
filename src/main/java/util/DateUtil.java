package util;

import java.util.Calendar;

/**
 * Created Vladimir Shekhavtsov.
 * Create and return correct date format for naming in FileSaver.class.
 */
public class DateUtil {

    public static String getDate() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        return day + "-" + month + "-" + year + "__" + hour + "-" + minute;
    }
}
