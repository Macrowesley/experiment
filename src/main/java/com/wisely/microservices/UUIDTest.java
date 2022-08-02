package com.wisely.microservices;

import java.util.UUID;

public class UUIDTest {
    public static String generateId(){
        UUID uid = UUID.randomUUID();
        System.out.println(uid);
        return uid.toString();
    } 

//    public static void main(String[] args) {
//
//    }

    public static void main(String[] args){
        long start = System.currentTimeMillis();
        for(int i=1;i<1000000;i++){
            generateId();
        }
        long end = System.currentTimeMillis();
        System.out.println("生成一百万个UUID耗时："+(end-start)+"毫秒");
    }
}
