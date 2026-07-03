<div align="center">

# 💬 Java Multi-Client Chat Application

### Real-Time Chat Application using Java Socket Programming & Multithreading

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge)
![Socket Programming](https://img.shields.io/badge/Socket-Programming-blue?style=for-the-badge)
![Multithreading](https://img.shields.io/badge/Multithreading-Java-success?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge)
![GitHub](https://img.shields.io/badge/GitHub-Open%20Source-black?style=for-the-badge)

A console-based multi-client chat application that enables multiple users to communicate simultaneously through a centralized server using Java Socket Programming and Multithreading.

</div>

---

# 📖 Overview

The **Java Multi-Client Chat Application** is a networking project developed using **Core Java**.

This application follows the **Client-Server Architecture**, where a server listens for incoming client connections and manages communication between multiple connected clients.

Each client is handled by a dedicated thread, allowing several users to chat simultaneously without interrupting one another.

This project demonstrates real-world concepts such as:

- Socket Programming
- TCP Communication
- Multithreading
- Java Networking
- Client-Server Architecture
- Concurrent Programming

---

# ✨ Features

✅ Multi-client Communication

✅ Real-time Message Broadcasting

✅ Java Socket Programming

✅ Multithreading using Thread Class

✅ Client-Server Architecture

✅ Username Support

✅ Multiple Client Handling

✅ Console-Based Interface

✅ Maven Project

---

# 🛠 Technologies Used

| Technology | Purpose |
|------------|----------|
| Java | Programming Language |
| Socket Programming | Network Communication |
| Multithreading | Concurrent Client Handling |
| Java I/O Streams | Reading & Writing Messages |
| Maven | Project Management |
| Eclipse IDE | Development |
| Git | Version Control |
| GitHub | Project Hosting |

---

# 🏗 System Architecture

```text
                +----------------------+
                |      Chat Server     |
                |   Port : 5000        |
                +----------+-----------+
                           |
      ---------------------------------------------
      |                   |                       |
      |                   |                       |
+------------+     +------------+        +------------+
| Client 1   |     | Client 2   |        | Client 3   |
| Yamini     |     | Ravi       |        | User 3     |
+------------+     +------------+        +------------+
```

---

# 📂 Project Structure

```text
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
├── pom.xml
│
└── README.md
```

---

# ⚙ Working Flow

```text
Start Server
      │
      ▼
Server waits for clients
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
Server broadcasts message
      │
      ▼
All connected clients receive message
```

---

# 🚀 How to Run

## 1. Clone Repository

```bash
git clone https://github.com/yaminichintada2005-ui/Java-MultiClient-Chat-Application.git
```

---

## 2. Open Project

Import the project into Eclipse as a Maven Project.

---

## 3. Run Server

Run

```
ChatServer.java
```

Output

```
CHAT SERVER STARTED
Waiting for clients...
```

---

## 4. Run Client

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

## 5. Run Another Client

Run

```
ChatClient.java
```

again.

Enter

```
Ravi
```

Now both users can communicate.

---

# 📸 Screenshots

## Server

(Add server screenshot)

---

## Client 1

(Add Client 1 screenshot)

---

## Client 2

(Add Client 2 screenshot)

---

# 📚 Concepts Covered

- Socket Programming
- TCP Communication
- Client-Server Architecture
- Java Networking
- Java Threads
- Java I/O
- Exception Handling
- Object-Oriented Programming

---

# 🎯 Learning Outcomes

Through this project I learned:

- Creating TCP Server using Java
- Connecting multiple clients simultaneously
- Implementing multithreading
- Broadcasting messages
- Handling client connections
- Java Networking Fundamentals

---

# 🚀 Future Enhancements

- Private Chat
- Online User List
- Chat Rooms
- File Sharing
- JavaFX GUI
- Database Integration
- Spring Boot WebSocket Version
- User Authentication

---

# 👩‍💻 Author

**Yamini Chintada**

B.Tech Computer Science and Engineering

Java Backend Developer

GitHub

https://github.com/yaminichintada2005-ui

---

<div align="center">

### ⭐ If you like this project, don't forget to give it a Star!

</div>
