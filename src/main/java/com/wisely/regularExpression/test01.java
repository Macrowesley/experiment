package com.wisely.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test01 {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("(\\d{3,5})([a-z]{2})");

        String s= "123aa-3434as-234cc-00";

        Matcher m= p.matcher(s);

        while(m.find()){
//            System.out.println(m.group());
            System.out.println(m.group(1));

        }//.group()打印全部（匹配全部正则）；.group(1)只匹配数字部分，打印数字。
    }
}
