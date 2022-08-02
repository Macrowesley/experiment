package com.wisely.ch7_7;

public class Test02 {
    public static void main(String[] args) throws Exception {
        int i = 42;
        //嵌套三目运算符
        boolean b = false;
        String s=(i<40)?"life":(i>50)?"universe":"everything";
        //以下等同于boolean b = true?false:((true==true)?false:true);
         b = false?false:true == true?true:false;
        System.out.println(b);

        //-------------
        char x = 'x';
        int j=10;
        System.out.println(false?j:x);
        System.out.println(false?10:x);

        //-------
        int m;
        int n;
        m = n = 5;
        //&(非短路)，&&(短路)
        if((m!=5)&(n++==6)){}
        System.out.println("b."+n);

        //------------
        int a=4;
        int c=0;
        try {
            System.out.println("a/c" + a / c);
        }catch (ArithmeticException e){//该异常从RuntimeException派生而来
            System.out.println(e);
        }



    }
}
