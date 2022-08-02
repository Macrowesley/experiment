package com.wisely.Netty;

import io.netty.channel.EventLoop;
import io.netty.channel.nio.NioEventLoop;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/**
 * @version v1.0
 * @Date: 2022/4/5 20:25
 * @Author: Mr.Throne
 * @Description:
 */
@Slf4j
public class TestNettyFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        NioEventLoopGroup group = new NioEventLoopGroup();

        EventLoop eventLoop = group.next();

        Future<Integer> future = eventLoop.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                log.info("计算中...");
                Thread.sleep(1000);
                return 100;
            }
        });

        // 同步
//        log.info("等待结果...");
//        log.info("{}",future.get());

        //异步
        future.addListener(new GenericFutureListener<Future<? super Integer>>() {
            @Override
            public void operationComplete(Future<? super Integer> future) throws Exception {
                log.info("result:{}",future.getNow());
            }
        });

    }
}
