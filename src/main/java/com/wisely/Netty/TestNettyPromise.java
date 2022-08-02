package com.wisely.Netty;

import io.netty.channel.EventLoop;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.util.concurrent.DefaultPromise;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;

/**
 * @version v1.0
 * @Date: 2022/4/5 20:31
 * @Author: Mr.Throne
 * @Description:
 */
@Slf4j
public class TestNettyPromise {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //获取一个eventLoop
        NioEventLoopGroup eventLoopGroup = new NioEventLoopGroup();
        EventLoop loop = eventLoopGroup.next();

        // 主动创建Promise,结果容器
        DefaultPromise<Integer> promise = new DefaultPromise<>(loop);

        new Thread(()->{
            // 由其他线程向promise填充结果
            log.info("开始计算...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            promise.setSuccess(100);
        }).start();

        //接收结果的线程
        log.info("waiting...");
        log.info("result:{}",promise.get());

    }
}
