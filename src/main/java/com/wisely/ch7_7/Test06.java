package com.wisely.ch7_7;

import java.util.ArrayList;
import java.util.List;

public class Test06 {
    private String value = null;
    public Test06(String v){
        value = v;
    }
    public boolean equals(Test06 o){
        if(o == this)
            return true;
        if(o instanceof Test06){
            Test06 test06 = (Test06) o;
            return value.equals(test06.value);
        }
        return false;
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        Test06 test1 = new Test06("object");
        Test06 test2 = new Test06("object");
        Test06 test3 = new Test06("object");
        Object test4 = new Test06("object");
        list.add(test1);
        System.out.println(list.contains(test1));
        System.out.println(list.contains(test2));//false
        System.out.println(test2.equals(test3));//ture比较同一内存空间的值
        System.out.println(test2 == test3);//false判断是否指向同一个内存空间
        System.out.println(test3.equals(test4));//false
    }
}
