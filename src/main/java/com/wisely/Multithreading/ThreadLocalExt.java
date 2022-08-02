package com.wisely.Multithreading;

import java.util.Date;

public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue(){
        return new Date().getTime();
    }
}
