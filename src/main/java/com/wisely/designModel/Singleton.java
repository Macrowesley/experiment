package com.wisely.designModel;

public class Singleton {
    private Singleton(){}
    //在自己内部定义一个实例，是不是很奇怪
    //注意，这是private，只供内部调用
    private static Singleton instance = new Singleton();
    public static Singleton getInstance(){
        return instance;
    }
}

//第二种形式
//public class Singleton{
//    private static Singleton instance = null;
//    public static synchronized Singleton getInstance(){
//        if(instance == null)
//            instance = new Singleton();
//        return instance;
//    }
//}
