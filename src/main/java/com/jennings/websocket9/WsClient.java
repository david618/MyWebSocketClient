package com.jennings.websocket9;

import org.eclipse.jetty.util.ssl.SslContextFactory;
import org.eclipse.jetty.websocket.client.WebSocketClient;

import java.net.URI;

/**
 * Created by david on 2/19/2016.
 */
public class WsClient {

    public void openSocket() {
        try {
            String url = "wss://W12AGS104.JENNINGS.HOME:6143/arcgis/ws/services/FAA-Stream/StreamServer/subscribe";
            //String url = "ws://W12AGS104.JENNINGS.HOME:6180/arcgis/ws/services/FAA-Stream/StreamServer/subscribe";

            URI uri = new URI(url);

            SslContextFactory sslContexFactory = new SslContextFactory();
            sslContexFactory.setTrustAll(true);
            WebSocketClient webSocketClient = new WebSocketClient(sslContexFactory);

            webSocketClient.start();

            WsListener a = new WsListener();

            webSocketClient.connect(a, uri);





        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println("Start");
        WsClient t = new WsClient();
        t.openSocket();
        System.out.println("End");
    }
}
