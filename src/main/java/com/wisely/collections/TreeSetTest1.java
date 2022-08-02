package com.wisely.collections;

import java.util.TreeSet;

public class TreeSetTest1 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(new Person("成龙",13));
        set.add(new Person("胡歌",22));
        set.add(new Person("刘亦菲",11));
        set.add(new Person("周星驰",16));
        set.add(new Person("李连杰",56));
        System.out.println("set:"+set);
    }
}