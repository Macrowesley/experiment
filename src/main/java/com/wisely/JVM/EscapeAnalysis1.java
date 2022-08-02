package com.wisely.JVM;

public class EscapeAnalysis1 {
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        for(int i = 0; i < 5_000_000; i++){
            createObject();
        }
        System.out.println("cost = " + (System.currentTimeMillis() - start) + "ms");
    }

    public static void createObject(){
        synchronized (new Object()){

        }
    }
}
