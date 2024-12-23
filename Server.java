// Java Program to implement ServerSocket class
// Server Side

// Importing required libraries
import java.io.*;
import java.net.*;

// Main class
public class Server {

  // Main driver method
  public static void main(String[] args) {
    // Try block to check for exceptions
    try {
      // Creating an object of ServerSocket class
      // in the main() method for socket connection
      ServerSocket ss = new ServerSocket(6666);

      while (true) {
        // Establishing a connection
        Socket soc = ss.accept();

        // Invoking input stream via getInputStream()
        // method by creating DataInputStream class
        // object
        DataInputStream dis = new DataInputStream(soc.getInputStream());

        String str;
        while ((str = dis.readUTF()) != null) {
          // Display the string on the console
          System.out.println("message= " + str);
        }

        // Close the input stream and socket
        dis.close();
        soc.close();
      }
    } catch (Exception e) { // Catch block to handle the exceptions
      // Display the exception on the console
      System.out.println(e);
    }
  }
}
