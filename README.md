# 💬 Java Multi-Client Chat Application

![Java](https://img.shields.io/badge/Java-17-orange)
![Socket Programming](https://img.shields.io/badge/Socket-Programming-blue)
![Multithreading](https://img.shields.io/badge/Multithreading-Java-success)
![Maven](https://img.shields.io/badge/Maven-Build-red)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![License](https://img.shields.io/badge/License-MIT-green)

---

## 📖 Overview

The Java Multi-Client Chat Application is a console-based networking application developed using Java Socket Programming and Multithreading.

The application allows multiple clients to connect to a central server and communicate with each other in real time. Each client connection is managed using a dedicated thread, enabling simultaneous communication between users.

This project demonstrates the implementation of networking concepts, concurrent programming, client-server architecture, and Java I/O streams.

---

## ✨ Features

- Real-time communication
- Multi-client support
- Client-Server architecture
- Socket Programming
- Multithreading
- Username-based chatting
- Message broadcasting
- Multiple client handling
- Console-based interface
- Modular project structure

---

## 🛠 Technologies Used

| Technology | Purpose |
|------------|----------|
| Java | Programming Language |
| Socket Programming | Network Communication |
| Multithreading | Concurrent Client Handling |
| Java I/O | Reading and Writing Messages |
| Maven | Dependency Management |
| Eclipse IDE | Development Environment |
| Git | Version Control |
| GitHub | Source Code Hosting |

---

## 📂 Project Structure

```
ChatApplication
│
├── src
│
├── client
│      ChatClient.java
│
├── server
│      ChatServer.java
│      ClientHandler.java
│
├── model
│      Message.java
│
└── pom.xml
```

---

## ⚙ Working Flow

```
Start Server
      │
      ▼
Server listens on Port 5000
      │
      ▼
Client connects
      │
      ▼
Server accepts connection
      │
      ▼
ClientHandler Thread Created
      │
      ▼
Client sends message
      │
      ▼
Server receives message
      │
      ▼
Broadcast to all clients
      │
      ▼
Clients display message
```

---

## 🚀 How to Run

### 1️⃣ Clone Repository

```bash
git clone https://github.com/yaminichintada2005-ui/Java-MultiClient-Chat-Application.git
```

### 2️⃣ Open in Eclipse

Import the project as an Existing Maven Project.

### 3️⃣ Run Server

Run

```
ChatServer.java
```

Console Output

```
CHAT SERVER STARTED
Waiting for clients...
```

---

### 4️⃣ Run Client

Run

```
ChatClient.java
```

Enter

```
Username
```

Example

```
Yamini
```

---

### 5️⃣ Start Another Client

Run ChatClient.java again.

Enter

```
Ravi
```

Now both clients can communicate.

---

## 📸 Screenshots

### Server

(Add server screenshot)

---

### Client 1

(Add client1 screenshot)

---

### Client 2

(Add client2 screenshot)

---

## 📚 Concepts Covered

- Socket Programming
- TCP Communication
- Client-Server Architecture
- Java Networking
- Java Threads
- Concurrency
- Java I/O Streams
- Exception Handling
- Object-Oriented Programming

---

## 🎯 Learning Outcomes

Through this project I learned:

- How sockets establish communication
- How multiple clients connect to one server
- How multithreading enables concurrent communication
- How broadcasting messages works
- Java networking fundamentals
- Thread lifecycle
- Real-world client-server implementation

---

## 🚀 Future Enhancements

- Private Messaging
- Online User List
- Chat Rooms
- File Sharing
- GUI using JavaFX
- Database Integration
- Message Encryption
- Spring Boot WebSocket Version
- Authentication and Login System

---

## 👩‍💻 Author

**Yamini Chintada**

B.Tech Computer Science and Engineering

Java Backend Developer

GitHub

https://github.com/yaminichintada2005-ui

---

## ⭐ Support

If you found this project useful, consider giving it a ⭐ on GitHub.
