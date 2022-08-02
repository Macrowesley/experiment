package com.wisely.ch7_7;

public class Test08 {
    public static void main(String[] args) {
        method(new Circle());
    }

    static void method(Shape shape) {
        shape.draw();
    }
}

class Shape {
    public void draw() {};
    public void erase() {};
    public final void change() {
        System.out.println("shape change");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("draw circle");
    }
    public void erase() {
        System.out.println("erase circle");
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("draw square");
    }
    public void erase() {
        System.out.println("erase square");
    }
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("draw triangle");
    }
    public void erase() {
        System.out.println("erase triangle");
    }
}
