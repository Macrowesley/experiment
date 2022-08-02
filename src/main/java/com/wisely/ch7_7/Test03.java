package com.wisely.ch7_7;

public class Test03 {
    public static void main(String[] args) {

        //数组传值本质是传地址值的副本
        char ch[]={'H','e','1','1','o'};
        change(ch);
        System.out.println(ch);
    }
    public static void change(char ch[]){
        ch[0] = 'c';
    }
}
