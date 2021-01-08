package org.linlinjava.litemall.admin.util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author hejiongyu@nome.com
 */
public class DateUtil {

    public static String convertToString (Date date, String pattern){
        if(date == null){
            return "";
        }
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        return format.format(date);
    }

    public static String convertToString (Date date){
        return convertToString(date,"yyyy-MM-dd");
    }

    public static String convertToChineseString (Date date){
        String ret = convertToString(date,"yyyy-MM-dd");
        ret = ret.replaceFirst("-","年");
        return ret.replaceFirst("-","月") + "日";
    }

    public static String getSysYear() {
        Calendar date = Calendar.getInstance();
        String year = String.valueOf(date.get(Calendar.YEAR));
        return year;
    }

    public static String getSysMonth() {
        Calendar date = Calendar.getInstance();
        String month = String.valueOf(date.get(Calendar.MONTH));
        return month;
    }

    //java获取当前月的天数
    public static int getDayOfMonth(){
        Calendar aCalendar = Calendar.getInstance(Locale.CHINA);
        int day=aCalendar.getActualMaximum(Calendar.DATE);
        return day;
    }

    public static LocalDateTime getFirstDayTimeOfMonth(){
        //本月的第一天
        LocalDateTime firstDayTime = LocalDateTime.of(Integer.parseInt(getSysYear()),Integer.parseInt(getSysMonth()), 1, 0, 0, 0);
        return firstDayTime;
    }

    public static LocalDateTime getEndDayTimeOfMonth(){
        //本月的最后一天
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        LocalDateTime endDayTime = LocalDateTime.of(Integer.parseInt(getSysYear()),Integer.parseInt(getSysMonth()),calendar.getActualMaximum(Calendar.DAY_OF_MONTH) , 23, 59, 59);
        return endDayTime;
    }

    public static void main(String[] args) {
        String a = convertToChineseString(new Date());
        System.out.println(a);
    }
}
