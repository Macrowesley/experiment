package com.wisely.StringAndNum;

import java.util.regex.Pattern;

public class StringFind {
    public static void main(String[] args) {

        String str = "abcde";
        if (str.startsWith("a")) {
            System.out.println("YES");
        }
        System.out.println(compileSearch("12btxt"));
    }


    public static boolean compileSearch(String str){
        Pattern pattern = Pattern.compile(".*ab.*");//先保留预编译的结果，要比直接调用String.match()性能要好
        return pattern.matcher(str).matches();
    }
}
