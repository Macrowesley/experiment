package com.wisely.interview;

import java.util.*;

public class RandomTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        if(Integer.parseInt(n)>500||Integer.parseInt(n)<1) {
            System.out.println("请输入大于等于1小于等于500的数");
            RandomTest.main(args);
        }
        ArrayList<String> list = new ArrayList<>();
        do{
            String str = sc.nextLine();
            list.add(str);
        }while (Integer.parseInt(n)>list.size());
        sc.close();
        //下面进行去重排序
        System.out.println(list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);
        for(int i=0;i<Integer.parseInt(n);i++){
            System.out.println( list.get(i));
        }
    }
}
