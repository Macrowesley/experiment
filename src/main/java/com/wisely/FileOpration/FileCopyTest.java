package com.wisely.FileOpration;

public class FileCopyTest {
    public static void main(String[] args) {
        FileCopy cf = new FileCopy("E:\\720.txt","E:\\test\\1.txt");
        FileCopy cf2 = new FileCopy("E:\\721.txt","E:\\test\\2.txt");
        FileCopy cf3 = new FileCopy("E:\\722.txt","E:\\test\\3.txt");
        cf.start();
        cf2.start();
        cf3.start();
    }
}
