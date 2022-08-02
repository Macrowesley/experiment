package com.wisely.interview;

public class ThisEscape {
    private int num = 8;
    public ThisEscape(){
        new Thread(()->System.out.println(this.num)).start();
    }

    public static void main(String[] args) throws Exception {
        new ThisEscape();
        System.in.read();
    }

}
