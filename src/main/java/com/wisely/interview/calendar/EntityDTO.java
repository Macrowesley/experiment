package com.wisely.interview.calendar;

import lombok.Data;

@Data
public class EntityDTO {
    public int year;
    public int month;
    public int day;
    public String lunar;
    public String holiday;
    public String week;
}
enum  week {
    Sun("星期天"),Mon("星期一"),Tues("星期二"),Wes("星期三"),Thur("星期四"),Fri("星期五"),Sat("星期六");
    //2.声明Season对象的属性：private final修饰
    private final String name;
    //3.私有化构造器，并给对象属性赋值
    private week(String name){
        this.name = name;
    }
    //4.提供get方法
    public String getName() {
        return name;
    }
}
