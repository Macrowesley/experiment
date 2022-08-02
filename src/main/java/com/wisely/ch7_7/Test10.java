package com.wisely.ch7_7;

import java.util.LinkedList;
import java.util.Queue;

public class Test10 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        System.out.println(queue.size());
        String str;
        while((str=queue.poll())!=null){
            System.out.println(str);
        }
        System.out.println(queue.size());
    }
}
