package com.wisely.ch7_7;

class Value{
    public int i = 15;
}
public class Test05 {
    public static void main(String[] args) {
        Test05 t = new Test05();
        t.first();
    }

public void first(){
    int i = 5;
    Value v = new Value();
    v.i = 25;
    second(v,i);
    System.out.println("first:"+v.i);
}

public void second(Value v,int i){
    i = 0;
    v.i = 20;
    Value val = new Value();
    v = val;
    System.out.println("second:"+v.i+ " "+i);
}
}
