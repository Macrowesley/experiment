package com.wisely.Netty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * bio服务端消息处理
 *
 * @author LionLi
 */
public class ServerHandler {

    public ServerHandler(Socket socket) {
        try (InputStreamReader isr = new InputStreamReader(socket.getInputStream());
             BufferedReader br = new BufferedReader(isr);
             PrintWriter pw = new PrintWriter(socket.getOutputStream(), true)) {
            String body;
            Scanner scanner = new Scanner(System.in);
            while (true) {
                // 读取客户端消息
                body = br.readLine();
                if (body == null) {
                    break;
                }
                System.out.println("客户端: " + body);
                String s = scanner.nextLine();
                System.out.println("服务端: " + s);
                // 发送到客户端
                pw.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}