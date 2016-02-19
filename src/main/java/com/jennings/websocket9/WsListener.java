package com.jennings.websocket9;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.WebSocketListener;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;

/**
 * Created by david on 2/19/2016.
 */

@WebSocket(maxTextMessageSize = 64 * 1024)
public class WsListener implements WebSocketListener {
    public void onWebSocketBinary(byte[] bytes, int i, int i1) {

    }

    public void onWebSocketText(String s) {
        System.out.println(s);

    }

    public void onWebSocketClose(int i, String s) {
        System.out.println("Closed");
    }

    public void onWebSocketConnect(Session session) {
        System.out.println("Connected");

    }

    public void onWebSocketError(Throwable throwable) {

    }
}
