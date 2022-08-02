package com.wisely.Multithreading;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDemo implements Runnable {
    static final CountDownLatch end = new CountDownLatch(10);
    static final CountDownLatchDemo demo = new CountDownLatchDemo();
    @Override
    public void run(){
        try {
            Thread.sleep(new Random().nextInt(10)*1000);
            System.out.println("check complete");
            end.countDown();//一个线程已经完成任务，倒计数器减1
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newFixedThreadPool(10);
        for(int i = 0;i<10;i++){
            exec.submit(demo);
        }
        //等待检查
        end.await();
        System.out.println("Fire!");
        exec.shutdown();
    }
}
