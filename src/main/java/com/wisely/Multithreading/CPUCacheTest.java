package com.wisely.Multithreading;

import java.util.concurrent.TimeUnit;

public class CPUCacheTest {
    private static boolean stop = false;
    public static void main(String[] args){
        Thread a = new Thread("B"){
          public void run(){
              while(!stop){
                  int a = 1;
              }
              System.out.println("exit");
          }
        };
        a.start();
        pause(100);
        //如果两个线程，当前A线程仅将A工作内存和主内存改为true，B线程的工作内存并未改为true，解决办法，对stop修饰为volatie
        //和final修饰变量时一样，具备并发下的多线程可见和禁止重排序。

        stop=true;
    }
    public static void pause(int time){
        try {
            TimeUnit.MILLISECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
