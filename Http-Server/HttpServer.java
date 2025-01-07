import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Java program made for creating a simple HTTP Server to demonstrate 
 * how to use ServerSocket and Socket class.
*/
public class HttpServer {

    public static void main(String[] args) throws IOException {

    


        /** 
         * Create a network socket that can accept connections on 
         * 8080 TCP port 
        */
        ServerSocket server = new ServerSocket(8080);
        System.out.println("Server is Running on Port 8080...");
        while (true) {
            
        
        
            /** 
             * Accept incoming connection by blocking call to 
             * accept() method 
            */
            Socket client = server.accept();

            /** 
             * Read the content of the request using InputStream 
             * opened from the client socket
            */
            InputStreamReader inputStreamReader = new InputStreamReader(client.getInputStream());

            /** Using BufferedReader because the browser will send  
             * multiple lines 
            */
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line = reader.readLine();
            /** 
             * Print the content of the request line by line 
             */
            while (!line.isEmpty()) {
                System.out.println(line);
                line = reader.readLine();
            }
            

            /** 
             * Prepare an HTTP response 
            */
            String response = "HTTP/1.1 OK 200\r\n\r\n" + "Oh, Hi There!";


            /** 
             * Get the output stream from the socket
            */
           client.getOutputStream()
            /** 
             * Write the response to the stream
            */
            .write(response.getBytes("UTF-8"));

            /** 
             * Close the client socket 
            */
            client.close();
        }
    }
}