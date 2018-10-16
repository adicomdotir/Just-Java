import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {

        String serverHostname = new String ("127.0.0.1");

        // if (args.length > 0)
        //   serverHostname = args[0];
        System.out.println (serverHostname + " : port 10007.");

        Socket echoSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;

        try {
            echoSocket = new Socket(serverHostname, 10007);
            out = new PrintWriter(echoSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
        } catch (UnknownHostException e) {
            System.err.println("host mojod nist: " + serverHostname);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("nemitavanad vasl shavad");
            System.exit(1);
        }

	BufferedReader stdIn = new BufferedReader(
                                   new InputStreamReader(System.in));
	String userInput;

        System.out.print ("input: ");
	while ((userInput = stdIn.readLine()) != null) {
	    out.println(userInput);
	    System.out.println("echo: " + in.readLine());
            System.out.print ("input: ");
	}

	out.close();
	in.close();
	stdIn.close();
	echoSocket.close();
    }
}
