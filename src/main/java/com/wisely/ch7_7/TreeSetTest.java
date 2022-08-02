package com.wisely.ch7_7;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(3);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(4);
        TreeSet set = new TreeSet(list);
        System.out.println("list:"+list);//原序输出
        System.out.println("set:"+set);//排好序，且去重
    }
}
