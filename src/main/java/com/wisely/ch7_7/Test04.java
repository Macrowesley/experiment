package com.wisely.ch7_7;

public class Test04 {
    public static void test(StringBuffer str){
        str.append(",world!");
    }
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        test(stringBuffer);
        System.out.println(stringBuffer);
    }
}
