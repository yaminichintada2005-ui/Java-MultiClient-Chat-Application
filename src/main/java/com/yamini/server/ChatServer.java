package com.yamini.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {

    // Stores all connected clients
    public static List<PrintWriter> clients = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(5000);

        System.out.println("==================================");
        System.out.println("     CHAT SERVER STARTED");
        System.out.println("==================================");
        System.out.println("Waiting for clients...");

        while (true) {

            // Wait for a client
            Socket socket = serverSocket.accept();

            System.out.println("New Client Connected: "
                    + socket.getInetAddress());

            // Create a thread for this client
            ClientHandler handler = new ClientHandler(socket);

            // Start the thread
            handler.start();
        }
    }
}

