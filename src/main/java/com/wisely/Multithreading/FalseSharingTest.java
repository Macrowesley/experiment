package com.wisely.Multithreading;

public class FalseSharingTest {

    //伪共享问题
    public static void main(String[] args) throws InterruptedException {
        testPointer(new Pointer());
    }

    private static void testPointer(Pointer pointer) throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000000; i++) {
                pointer.x.value++;
                //pointer.x++;
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000000; i++) {
                pointer.y.value++;
                //pointer.y++;
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(System.currentTimeMillis() - start);
        System.out.println(pointer);
    }
}

class Pointer {
    //volatile long x;
    long p1,p2,p3,p4,p5,p6,p7;//添加这一行会大大缩短时间
    //volatile long y;
    MyLong x = new MyLong();
    MyLong y = new MyLong();
}

@sun.misc.Contended//第三种优化
class MyLong {
    volatile long value;
    long p1,p2,p3,p4,p5,p6,p7;
}
