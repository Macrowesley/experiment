package com.wisely.ch7_7;

public class ClassObject {
    public static void main(String[] args) {
        //EnclosingClass jb2;未初始化，下一句编译不通过
        EnclosingClass jb = new EnclosingClass();
        System.out.println(jb.m);
    }
}
class EnclosingClass{
    public int m = 6;
    class InnerClass{
        int msquare;
        InnerClass(){
            msquare = m*m;
        }
    }
}
