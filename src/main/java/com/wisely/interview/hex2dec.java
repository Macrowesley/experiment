package com.wisely.interview;

import java.util.Scanner;
public class hex2dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String line = sc.nextLine();
            String content = line.substring(2);
            Integer integer = Integer.parseInt(line.substring(2), 16);
            if(-1==line.compareTo("0x01")||1==line.compareTo("0x7FFFFFFF")){
                System.out.println("输入的数不能小于1或大于7FFFFFFF！");
                hex2dec.main(args);
            }
            if(!content.matches("[0-9a-fA-F]*")){
                System.out.println("输入不匹配");
                System.exit(-1);
            }
            System.out.println(integer);
        }
    }

//    private static void printResult(String line) {
        // 截取前面的 0x，转为十进制,不能有前缀 0x

        // 十进制再转为16进制
//        String toHexString = Integer.toHexString(integer);
//        System.out.println("0x"+toHexString);
//    }
}
