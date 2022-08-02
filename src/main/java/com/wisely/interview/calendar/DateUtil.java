package com.wisely.interview.calendar;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateUtil {
    /**
     * 根据传入日期获取当月所有天的集合
     * @param date
     * @return List<String>
     */
    public static List<String> getAllTheDateOftheMonths(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        List<String> list = new ArrayList<>();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DATE, 1);
        int month = cal.get(Calendar.MONTH);
        while(cal.get(Calendar.MONTH) == month){
            list.add(format.format(cal.getTime()));
            cal.add(Calendar.DATE, 1);
        }
        return list;
    }

    /**
     * 根据传入日期获取周几
     * @param date
     * @return int
     */
    public static Integer dateToIntWeek(Date date) {

        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Integer[] weekDays = {7, 1, 2, 3, 4, 5, 6};
        Calendar cal = Calendar.getInstance();
        try {
            cal.setTime(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //一周的第几天
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        return weekDays[w];
    }

    public static Date getMonFirstDate(Date date){
        //获取当前月第一天：
        Calendar ca = Calendar.getInstance();
        ca.setTime(date);
        // ca.add(Calendar.MONTH, 0); 此方法可以获取前n月或后n月
        ca.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
        ca.set(Calendar.HOUR, 0);
        ca.set(Calendar.MINUTE, 0);
        ca.set(Calendar.SECOND, 0);

        return ca.getTime();
    }

    public static Date getMonEndDate(Date date) {
        //获取当前月最后一天
        Calendar ca = Calendar.getInstance();
        ca.setTime(date);
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
        ca.set(Calendar.HOUR, 23);
        ca.set(Calendar.MINUTE, 59);
        ca.set(Calendar.SECOND, 59);

        return  ca.getTime();
    }

    /**
     * 获取年份
     */
    public static int getYear(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }

    /**
     * 获取月份
     */
    public static int getMonth(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH)+1;
    }

    /**
     * 获取当月的几号
     */
    public static int getDay(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DATE);
    }
}
