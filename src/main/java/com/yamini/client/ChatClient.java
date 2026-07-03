package com.yamini.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

    public static void main(String[] args) {

        try {

            Socket socket = new Socket("localhost", 5000);

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter writer = new PrintWriter(
                    socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);

            // Ask user name
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
         // Send username to the server
            writer.println(name);

            System.out.println("==================================");
            System.out.println(" Connected to Chat Server ");
            System.out.println(" Type 'exit' to quit");
            System.out.println("==================================");

            // Thread to receive messages
            Thread receiveThread = new Thread(() -> {

                try {

                    String response;

                    while ((response = reader.readLine()) != null) {

                        System.out.println(response);

                    }

                } catch (IOException e) {

                    System.out.println("Disconnected from server.");

                }

            });

            receiveThread.start();

            // Send messages
            while (true) {

                String message = scanner.nextLine().trim();

                if (message.equalsIgnoreCase("exit")) {
                    break;
                }

                // Don't send empty messages
                if (message.isEmpty()) {
                    continue;
                }

                writer.println(message);
            }

            scanner.close();
            socket.close();

            System.out.println("Chat Closed.");

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}