package com.wisely.Netty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * bio客户端
 *
 * @author LionLi
 */
public class BioClient {

    public static void main(String[] args) {

        try (Socket socket = new Socket("localhost", 8088);
             InputStreamReader isr = new InputStreamReader(socket.getInputStream());
             BufferedReader br = new BufferedReader(isr);
             PrintStream ps = new PrintStream(socket.getOutputStream())) {

            System.out.println("请输入内容: ");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            System.out.println("客户端: " + str);
            // 发送到服务端
            ps.println(str);
            String response;
            while (true) {
                // 读取服务端消息
                response = br.readLine();
                if (response == null || response.length() == 0) {
                    break;
                }
                System.out.println("服务端: " + response);
                String client = scanner.nextLine();
                System.out.println("客户端: " + client);
                ps.println(client);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}