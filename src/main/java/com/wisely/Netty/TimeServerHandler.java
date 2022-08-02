package com.wisely.Netty;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class TimeServerHandler implements Runnable {

    private Socket socket;

    public TimeServerHandler(Socket socket) {
        this.socket = socket;
    }


    @Override
    public void run() {
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            out = new PrintWriter(this.socket.getOutputStream(),true);
            out.println("please input your order: ");
            String currentTime = null;
            String body = null;

            while(true) {
                body = in.readLine();
                if(body == null) break;
                currentTime = "cm".equals(body) ? System.currentTimeMillis() + "" : "bad order";
                out.println(currentTime);
            }
        } catch (Exception e) {

        } finally {
            //关闭IO
        }
    }

}
