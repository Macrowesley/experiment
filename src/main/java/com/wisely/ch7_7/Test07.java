package com.wisely.ch7_7;

import java.util.HashMap;
import java.util.Map;

public class Test07 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put(String.valueOf(System.currentTimeMillis())+"a","1");
        map.put(String.valueOf(System.currentTimeMillis())+"b","2");
        map.put(String.valueOf(System.currentTimeMillis())+"c","3");
        for(Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getValue());//不能保证每次输出123顺序一致
        }
    }
}
