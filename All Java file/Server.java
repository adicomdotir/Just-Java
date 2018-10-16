import java.net.*;
import java.io.*;

public class Server { 
 public static void main(String[] args) throws IOException
   {
    ServerSocket serverSocket = null;

    try {
         serverSocket = new ServerSocket(10007);
        }
    catch (IOException e)
        {
         System.err.println("kasi nist dar port: 10007.");
         System.exit(1);
        }

    Socket clientSocket = null;
    System.out.println ("montazer kasi baray vasl shodan ...");

    try {
         clientSocket = serverSocket.accept();
        }
    catch (IOException e)
        {
         System.err.println("anjam nashod");
         System.exit(1);
        }

    System.out.println ("vasl shod");
    System.out.println ("montazer payam ...");

    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),
                                      true);
    BufferedReader in = new BufferedReader(
            new InputStreamReader( clientSocket.getInputStream()));

    String inputLine;

    while ((inputLine = in.readLine()) != null)
        {
         System.out.println ("Server: " + inputLine);
         out.println(inputLine);

         if (inputLine.equals("Bye."))
             break;
        }

    out.close();
    in.close();
    clientSocket.close();
    serverSocket.close();
   }
}
