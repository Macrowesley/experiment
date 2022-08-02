package com.wisely.proxy.staticProxy;

public class Client {
    public static void main(String[] args) {
        //创建目标对象
        IAccountService target = new AccountServiceImpl();
        //创建代理对象
        AccountProxy proxy = new AccountProxy(target);
        proxy.transfer();
    }
}
