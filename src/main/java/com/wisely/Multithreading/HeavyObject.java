package com.wisely.Multithreading;

import java.util.concurrent.ConcurrentHashMap;

public class HeavyObject {
    public HeavyObject(){
        System.out.println("HeavyObject created");
    }


    public static void main(String[] args) {
        ConcurrentHashMap<String,HeavyObject> map = new ConcurrentHashMap<>();
        HeavyObject obj = getOrCreate(map,"1");
    }

    public static HeavyObject getOrCreate(ConcurrentHashMap<String,HeavyObject> map,String key){
//        HeavyObject value = map.get(key);
//        if(value == null){
//            value = new HeavyObject();
//            map.put(key,value);
//        }
//        return value;
        //以上代码不是线程安全的，如果设置为同步，会极大降低该方法的性能
        //这里采用线程安全的高效方法——computeIfAbsent()函数
        return map.computeIfAbsent(key,k->new HeavyObject());
    }
}