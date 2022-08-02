package com.wisely.ch7_7;

public class Test09 {
    public static void main(String[] args) {
        method(new Circle());
    }

    static void method(Shape shape) {
        //由于final方法不能被重写，所以直接调用父类的change()方法
        shape.change();
    }
}
