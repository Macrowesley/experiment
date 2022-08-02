package com.wisely.Netty;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * bio服务端
 *
 * @author LionLi
 */
public class BioServer {

    public static void main(String[] args) {
        try {
            // 创建服务端socket
            ServerSocket server = new ServerSocket(8088);
            System.out.println("服务端启动成功!!!");
            // 堵塞
            Socket socket = server.accept();
            // 创建消息处理器
            new ServerHandler(socket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}