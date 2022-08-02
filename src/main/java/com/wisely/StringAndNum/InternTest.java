package com.wisely.StringAndNum;


import org.apache.commons.lang3.StringUtils;

public class InternTest {
    public static void main(String[] args) {
        String result = replace();
        System.out.println(result);
        System.out.println(StringUtils.repeat("a",3));
    }

    public static String replace(){
        String status = "1";
        status = "78";
        String str = status.intern();
        return str;
    }
}
