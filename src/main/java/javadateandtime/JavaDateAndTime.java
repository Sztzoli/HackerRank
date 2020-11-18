package javadateandtime;



import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;

import static java.util.Calendar.*;

public class JavaDateAndTime {

    public static String findDay(int month, int day, int year) {
        Calendar calendar= Calendar.getInstance();
        calendar.set(year,month-1,day);
        return calendar.getDisplayName(DAY_OF_WEEK,LONG,Locale.US).toUpperCase();
    }
    public static String findDayLocale(int month, int day, int year) {
        LocalDate localDate=LocalDate.of(year,month,day);
        return localDate.getDayOfWeek().getDisplayName(TextStyle.FULL,Locale.US).toUpperCase();
    }


    public static void main(String[] args) {


        System.out.println(findDay(11,18,2020));
        System.out.println(findDayLocale(11,18,2020));

    }




}
