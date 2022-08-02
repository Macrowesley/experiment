package com.wisely.ch7_7;

public class B extends A{
    public static void prt(){
        System.out.println("2");
    }
    public B(){
        System.out.println("B");
    }

    public static void main(String[] args) {
        //每新建一个对象，都会产生一个构造函数
        A a = new B();
        a = new A();
        //由于产生的顺序ABA，所以输出结果是ABA
    }
}
