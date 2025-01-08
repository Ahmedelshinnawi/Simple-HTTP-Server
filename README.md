# Simple Java HTTP Server

## Overview
This project demonstrates how to create a basic HTTP server in Java using the 
``ServerSocket`` and ``Socket`` classes. The server listens for incoming HTTP 
requests on port 8080 and responds with a simple "Hello" message.

## Feature
- Accepts HTTP requests and prints the request headers to the console.
- Responds to clients with a basic HTTP response.
- Demonstrates the use of ``ServerSocket``, ``Socket``, and stream handling in Java.

## Prerequisites
  - Java Development Kit (JDK) 8 or later installed on your system.
  - A text editor or IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code).
 
## How It Works
  1. The server listens for incoming connections on port 8080.
  2. When a connection is established, the server reads the client's HTTP request.
  3. The request headers are printed to the console.
  4. The server sends a simple HTTP response back to the client with a "Hello" message
  5. The connection is closed after sending the response.
 
## Code Highlights
  ### Key components of the server:
  - ServerSocket: Listens for incoming connections.
  - Socket: Handles the connection to the client.
  - InputStreamReader and BufferedReader: Read the incoming request data.
  - OutputStream: Sends the HTTP response.
 
## Using Instructions
1. Clone this repository or copy the ``HttpServer.java`` file.
  
2. Compile the Java file:
   ```bash
   javac HttpServer.java
   ```
3. Run the server:
   ```bash
   java HttpServer
   ```
4. Open a web browser or use a tool like curl to send a reques
   - Browser: Navigate to ``http://localhost:8080/``.
   - Curl: Run curl http://localhost:8080 in your terminal.
   #### The server will print the incoming request headers to the console and respond with:
``` 
Oh, Hi There!
```
## Example Output
#### Console Output (Server Side)
```
Server is Running on Port 8080...
GET / HTTP/1.1
Host: localhost:8080
User-Agent: curl/7.68.0
Accept: */*
```
#### Browser or Curl Output (Client Side)
```
Oh, Hi There!
```
       

