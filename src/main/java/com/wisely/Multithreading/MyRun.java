package com.wisely.Multithreading;

public class MyRun {
    private String lock = new String("");
    private boolean isFirstRunB = false;
    private Runnable runnableA = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock){
                    while (isFirstRunB == false){
                        System.out.println("begin wait");
                        lock.wait();
                        System.out.println("end wait");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    private Runnable runnableB = new Runnable() {
        @Override
        public void run() {
            synchronized (lock){
                System.out.println("begin notify");
                lock.notify();
                System.out.println("end notify");
                isFirstRunB = true;
            }
        }
    };

    public static void main(String[] args) throws InterruptedException{
        MyRun run = new MyRun();
        Thread b = new Thread(run.runnableA);
        b.start();
        Thread.sleep(100);
        Thread a = new Thread(run.runnableB);
        a.start();
    }

}
