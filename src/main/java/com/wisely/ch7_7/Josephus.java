package com.wisely.ch7_7;

public class Josephus {
    public static void main(String[] args) {
        Boolean[] usaJapa = new Boolean[30];
        for(int i=0;i<usaJapa.length;i++){
            usaJapa[i]=true;
        }

        int leftCount = usaJapa.length;
        int countNum = 0;
        int index = 0;
        while(leftCount>1){
            countNum++;

            if(countNum==9){
                countNum=0;
                usaJapa[index] = false;
                leftCount --;
            }
            index ++;
            if(index==usaJapa.length)index=0;
        }
        for(int i=0;i<usaJapa.length;i++){
            System.out.println(i+"="+usaJapa[i]+" ");
        }
    }
}
