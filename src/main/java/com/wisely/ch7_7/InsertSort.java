package com.wisely.ch7_7;

import javafx.application.Application;
import javafx.stage.Stage;

public class InsertSort {

    public static void selectSort(int[] source){
        for(int i = 1;i<source.length;i++){
            for(int j = i;(j>0)&&(source[j]<source[j-1]);j--){
                swap(source,j,j-1);
            }
        }
    }
    public static void swap(int[] source,int x,int y) {
       int temp = source[x];
       source[x] = source[y];
       source[y] = temp;
    }

    public static void main(String[] args) {
        int[] a = {4,2,1,6,3,6,0,-5,1,1};
        int i;
        selectSort(a);

        for(i=0;i<10;i++)
            System.out.printf("%d",a[i]);
    }
}
