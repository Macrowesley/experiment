package com.wisely.JVM;

public class EscapeAnalysis {
    public static void main(String[] args){
        for(int i = 0; i < 5_000; i++){
            createObject();
        }
    }

    public static void createObject(){
        new Object();
    }
}
