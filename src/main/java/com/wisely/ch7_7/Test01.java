package com.wisely.ch7_7;

import java.io.FileNotFoundException;

public class Test01 {
//    static void main(String[] args) {
//main方法必须是public的，默认代表是protect，所以不合法
//    }
    public static void main(String[] exp)throws FileNotFoundException {
        int j=0034677;
        int k=(int)056L;
        //如果数字以0开头，则是一个以8为底的八进制数字,下面编译不通过
        //int l=078;
        System.out.println(j);
        assert(j>=29);
        System.out.println(k);
        //System.out.println(l);

        //-------------
//        String str = "hiii";
//        int i = "hiii".length();
//        int j = 0;
        //---------------
//        for(int i=0;i<100;i++){
//            j=j++;
//        }
    }
}
