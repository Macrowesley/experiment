package com.wisely.Netty;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 伪异步I/O时间服务器
 */
public class TimeServer {

    public static void main(String[] args) throws Exception {
        try {
            ServerSocket server = new ServerSocket(8080);
            System.out.println("server is start in port 8080");
            Socket socket = null;
            TimerServerHanlderExecutorPool pool = new TimerServerHanlderExecutorPool(20, 50);
            while(true) {
                socket = server.accept();
                pool.execute(new TimeServerHandler(socket));
            }
        } finally {
            // TODO: handle finally clause
        }
    }
}

class TimerServerHanlderExecutorPool {
    private ExecutorService executor;
    public TimerServerHanlderExecutorPool (int maxPoolSize,int queueSize) {
        executor = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), maxPoolSize,
                120L, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(queueSize));
    }

    public void execute(java.lang.Runnable task) {
        executor.execute(task);
    }
}


