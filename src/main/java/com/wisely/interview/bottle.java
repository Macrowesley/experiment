package com.wisely.interview;

import java.util.ArrayList;
import java.util.Scanner;

public class bottle {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do{
            String str = sc.nextLine();
            System.out.println("每行的值："+str);
            if(str.equals("0")){
                break;
            }else{
                list.add(str);
            }
        }while (true);
        sc.close();
        for(String s:list){
            int result = 0;
            int  n = Integer.parseInt(s);
            if(n==0){
                System.out.println(result);
            }
            do{
                if(n==1){
                    System.out.println(result);
                    n=0;
                }else if(n/3+n%3==2){
                    result +=n/3+1;
                    System.out.println(result);
                    n=0;
                }else{
                    result += n/3;
                    n = n/3 + n%3;
                }
            }while(n!=0);
        }
    }
}