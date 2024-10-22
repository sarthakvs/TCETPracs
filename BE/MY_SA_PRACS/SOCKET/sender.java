import java.net.*;
import java.util.*;

public class DSender {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        try {
            DatagramSocket ds = new DatagramSocket();
            InetAddress ip = InetAddress.getByName("127.0.0.1");

            // Continuous loop to send messages
            while (true) {
                System.out.print("Enter your message (type 'exit' to quit): ");
                String str = scn.nextLine();

                // Break the loop if 'exit' is typed
                DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);
                ds.send(dp);

                if (str.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting...");
                    break;
                }

                System.out.println("Message has been sent: " + str);
            }

            ds.close();
            System.out.println("Sender stopped.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scn.close();
        }
    }
}

