

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;



/**
 * @author ml71280
 *
 *         This is util class for parsing date
 *
 */
public class DateUtil {

    private DateUtil() {

    }

    /**
     *
     * This method returns date from string input and format provided
     *
     * @author ml71280
     * @param inputDate
     * @param format
     * @return
     * @throws Db2DataSyncException
     */
    public static Date getDateFromString(String inputDate, String format) {

        Date date = null;
        try {
            DateFormat df = new SimpleDateFormat(format);
            date = df.parse(inputDate);

        } catch (Exception e) {
            //throw new Db2DataSyncException("Exception while parsing date format, Exception is -- " + e.getMessage(),
              //      DataSyncLiterals.ERROR_CD_APPLICATION_ERROR, e);
        }
        return date;

    }

    public static String convertCalenderToStringDate(Calendar inputDate, String foramt) {

        return new SimpleDateFormat(foramt).format(inputDate.getTime());
    }

    public static Calendar convertCSTtoUTC(Calendar source) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(source.getTime());
        TimeZone fromTimeZone = TimeZone.getTimeZone("CST");
        TimeZone toTimeZone = TimeZone.getTimeZone("UTC");

        calendar.add(Calendar.MILLISECOND, fromTimeZone.getRawOffset() * -1);
        if (fromTimeZone.inDaylightTime(calendar.getTime())) {
            calendar.add(Calendar.MILLISECOND, fromTimeZone.getDSTSavings() * -1);
        }

        calendar.add(Calendar.MILLISECOND, toTimeZone.getRawOffset());
        if (toTimeZone.inDaylightTime(calendar.getTime())) {
            calendar.add(Calendar.MILLISECOND, toTimeZone.getDSTSavings());
        }
        return calendar;

    }

    public static Calendar getCurrentTimeUtc() {
        Calendar ret = Calendar.getInstance();
        ret.setTimeZone(TimeZone.getTimeZone("UTC"));
        return ret;
    }

    
    public static Calendar convertStringToCalendar(String dateString) {

        //SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss.SSSSSS");
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yy HH.mm.ss");
        Date date = null;
        try {
            date = formatter.parse(dateString);

        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Error converting String date to Calendar.");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        return calendar;
    }

    
}
