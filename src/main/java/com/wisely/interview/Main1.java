package com.wisely.interview;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do{
            int T = Integer.parseInt(scanner.nextLine());
            //T由连续的自然数之和表示
            System.out.println("T="+T);
            if(T%2==1){
                int a = (T+1)/2;
                System.out.println("T="+(a-1)+"+"+a);
                do{
                    a--;
                }while(3*a-3>T);
                if(3*a-3==T){
                    System.out.println("T="+(a-2)+"+"+(a-1)+"+"+a);
                }
            }else{
                int b = T/2;
//                for(int i=3;i*b-i<T;i++){
                    do{
                        b--;
                    }while(3*b-3>T);
//                    if(i*b-i==T){
                System.out.println("T="+(b-2)+"+"+(b-1)+"+"+b);
//                        System.out.println("T="+(b-i+1)+"+"+(b-i+2)+"+"+(b-i+3));
//                        int j = 3;
//                        do{
//                            ++j;
//                            System.out.print("+"+(b-i+j));
//
                        }while(true);
//                    }
//                }


//            }
        }while(false);




//        for(int i = T;i+i-1)

        //自然数由少到多排


//        ArrayList<String> list = new ArrayList<>();
//        do{
//            // 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
//            String a = scanner.nextLine();
//            list.add(a);
//        }while(list.size()<n);

    }
}
