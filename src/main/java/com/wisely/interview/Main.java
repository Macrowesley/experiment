package com.wisely.interview;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<String> list = new ArrayList<>();
        do{
            // 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String a = scanner.nextLine();
            list.add(a);
        }while(list.size()<n);
        //对list排序
        Collections.sort(list, new Comparator<String>() {
            DateFormat f = new SimpleDateFormat("HH:mm:ss");
            @Override
            public int compare(String o1, String o2) {
                try {
                    return f.parse(o1).compareTo(f.parse(o2));
                } catch (ParseException e) {
                    throw new IllegalArgumentException(e);
                }
            }
        });
        System.out.println(list);
    }
}