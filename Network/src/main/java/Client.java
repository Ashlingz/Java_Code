

/**
 *
 * @author TUF
 */
import java.io.IOException;
import java.io.PrintStream;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String args[]) throws IOException
    {
        Socket s = new Socket("127.0.0.1", 8888);
        System.out.println("This client has been connected to server");
        System.out.println("==========================================");
        Scanner in = new Scanner(s.getInputStream());
        PrintStream out = new PrintStream(s.getOutputStream());
        
        String msg = "";
        
        while (!msg.equals("!bye")) {            
            System.out.println("Message:");
            out.flush();
            msg = in.nextLine();
            System.out.printf("Server sent me : " + msg);
        }
        
    }
    
}