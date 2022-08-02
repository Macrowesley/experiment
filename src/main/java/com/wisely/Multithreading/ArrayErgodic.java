package com.wisely.Multithreading;

import java.util.Arrays;
import java.util.function.IntConsumer;

public class ArrayErgodic {
    static int[] arr ={1,3,4,5,6,7,8,9,10};
    public static void main(String[] args) {
//        for(int i:arr){
//            System.out.println(i);
//        }

        Arrays.stream(arr).forEach(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.println(value);
            }
        });
    }
}
