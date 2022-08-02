package com.wisely.Multithreading;

import java.util.Random;
import java.util.concurrent.atomic.LongAccumulator;

public class LongAccumulatorTest {
    public static void main(String[] args) throws InterruptedException {
        //LongAccumulator会通过Long::max识别最大值并保存在内部
        LongAccumulator accumulator = new LongAccumulator(Long::max,Long.MIN_VALUE);
        Thread[] ts = new Thread[1000];

        for(int i=0;i<1000;i++){
            ts[i] = new Thread(()->{
                Random random = new Random();
                long value = random.nextLong();
                accumulator.accumulate(value);
            });
            ts[i].start();
        }
        for (int i=0;i<1000;i++){
            ts[i].join();
        }
        System.out.println(accumulator.longValue());//longValue()对所有的cell进行Long::max操作，得到最大值
    }
}
