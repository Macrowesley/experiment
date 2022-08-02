package com.wisely.ch7_7;

public class StringJudge {
    public static void main(String[] args) {
        //String s1= "aaa77";
        char foo='和';
        String tmp = "";
        String s1=new String("aaa77");
        String s2= "aaa77";
        //System.out.println(s1.intern()==s2);//true
        System.out.println(s1.equals(s2));//true
        System.out.println(s1==s2);
        //==比较的是两个基本类型的值，或者引用类型的地址，通过intern()从String Pool检查有没此String对象，有的话
        //则返回此String对象在String Pool中的引用。
        for(int i=0;i<9999;i++){
            tmp +="x";
        }
    }
}
