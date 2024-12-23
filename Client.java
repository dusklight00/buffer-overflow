// Java Program to implement ServerSocket class
// Client - side

// Importing required libraries
import java.io.*;
import java.net.*;

// Main class
public class Client {

  // Main driver method
  public static void main(String[] args) {
    // Try block to check if exception occurs
    try {
      // Creating Socket class object and
      // initializing Socket
      Socket soc = new Socket("localhost", 6666);

      DataOutputStream d = new DataOutputStream(soc.getOutputStream());

      // Message to be displayed
      d.writeUTF(
        "Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!Hello GFG Readersasdfgasdfsdf!"
      );

      // Flushing out internal buffers,
      // optimizing for better performance
      d.flush();

      // Closing the connections

      // Closing DataOutputStream
      d.close();
      // Closing socket
      soc.close();
    } catch (Exception e) { // Catch block to handle exceptions
      // Print the exception on the console
      System.out.println(e);
    }
  }
}
