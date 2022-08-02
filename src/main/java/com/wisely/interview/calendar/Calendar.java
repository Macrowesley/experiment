package com.wisely.interview.calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

//public class Calendar {
//    public List<EntityDTO> getCalendar(String date) throws ParseException {
//
//        Date aDate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
//        // 格式化日期
//        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
//        //得到本月第一天
//        String startDate = dt.format(DateUtil.getMonFirstDate(aDate));
//        //得到本月最后一天
//        String endDate = dt.format(DateUtil.getMonEndDate(aDate));
//        // 根据传入日期得到当月所有天的集合（方法(getAllTheDateOftheMonths)在最后）
//        List<String> days = DateUtil.getAllTheDateOftheMonths(aDate);
//
//        // 得到库里的数据，可能不够一个月的所有天数，库里的是年，月，日，匹配年和月
//        QueryWrapper wrapper = new QueryWrapper();
//        wrapper.eq("year",DateUtil.getYear(aDate)).eq("month",DateUtil.getMonth(aDate));
//        List<EntityDTO> list = dateMapper.selectList(wrapper);
//
//
//        // 根据传入日期得到本月第一天是周几(格式为：7, 1, 2, 3, 4, 5, 6)，传入本月第一天
//        int weekDay = DateUtil.dateToIntWeek(new SimpleDateFormat("yyyy-MM-dd").parse(days.get(0)));
//        // 得到前面需要补齐的空格
//        List<String> frontBlackDays = new ArrayList<>();
//        // 获取对日期操作的类对象
//        java.util.Calendar calendar = java.util.Calendar.getInstance();
//
//        if(weekDay != 7){
//            for(int i = 0; i < weekDay; i++){
//                // 设置时间为本月第一天，对它进行偏移
//                calendar.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(days.get(0)));
//                //在本月第一天的基础上获取前x天的日期
//                calendar.add(java.util.Calendar.DATE, -i-1);
//                frontBlackDays.add(dt.format(calendar.getTime()));
//            }
//        }
//
//        // 根据传入日期得到本月最后一天是周几，传入本月最后一天
//        int weekLastDay = DateUtil.dateToIntWeek(DateUtil.getMonEndDate(aDate));
//        // 得到后面需要补齐的空格
//        List<String> endBlackDays = new ArrayList<>();
//        if (weekLastDay != 6){
//            if(weekLastDay == 7){
//                weekLastDay = 0;
//            }
//            int lastDay = 6 - weekLastDay;
//            for (int i = 0; i < lastDay; i++){
//                calendar.setTime(DateUtil.getMonEndDate(aDate));
//                calendar.add(java.util.Calendar.DATE, i+1);
//                endBlackDays.add(dt.format(calendar.getTime()));
//            }
//        }
//
//
//        days.addAll(frontBlackDays);
//        days.addAll(endBlackDays);
//
//
//        List<EntityDTO> result = days.stream().map(e->{
//            Date date1 = null;
//            try {
//                date1 = new SimpleDateFormat("yyyy-MM-dd").parse(e);
//            } catch (ParseException ex) {
//                ex.printStackTrace();
//            }
//            String week = DateUtil.dateToWeek(date1);
//
//
//            EntityDTO dto = new EntityDTO();
//            dto.setWeek(week);
//            String str = e.substring(8,10);
//            String day = str.startsWith("0") ? str.substring(1,2) : str.substring(0,2);
//
//            dto.setDay(Integer.parseInt(day));
//            return dto;
//        }).collect(Collectors.toList());
//
//        //结果按照日期升序排列
//        result.sort(Comparator.comparing(EntityDTO::getDay));
//        return result;
//    }
//
//}