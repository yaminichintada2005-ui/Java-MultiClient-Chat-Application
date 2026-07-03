package com.yamini.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler extends Thread {

    private Socket socket;
    private PrintWriter writer;
    private String username;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            writer = new PrintWriter(socket.getOutputStream(), true);

            // First message from client is the username
            username = reader.readLine();

            // Add this client's writer
            ChatServer.clients.add(writer);

            System.out.println(username + " joined the chat.");

            // Notify everyone
            for (PrintWriter client : ChatServer.clients) {
                client.println("*** " + username + " joined the chat ***");
            }

            String message;

            while ((message = reader.readLine()) != null) {

                System.out.println(username + ": " + message);

                // Broadcast to everyone
                for (PrintWriter client : ChatServer.clients) {
                    client.println(username + ": " + message);
                }
            }

        } catch (IOException e) {

            System.out.println(username + " disconnected.");

        } finally {

            ChatServer.clients.remove(writer);

            // Notify everyone
            for (PrintWriter client : ChatServer.clients) {
                client.println("*** " + username + " left the chat ***");
            }

            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}