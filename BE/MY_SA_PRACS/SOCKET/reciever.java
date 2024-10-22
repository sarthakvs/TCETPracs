import java.net.*;

public class DReceiver {

    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(3000);
            byte[] buf = new byte[1024];

            System.out.println("Waiting for messages. Type 'exit' from Sender to stop both.");

            // Continuous loop to receive messages
            while (true) {
                DatagramPacket dp = new DatagramPacket(buf, buf.length);
                ds.receive(dp);

                String str = new String(dp.getData(), 0, dp.getLength());
                System.out.println("Received: " + str);

                // Break if 'exit' is received
                if (str.equalsIgnoreCase("exit")) {
                    System.out.println("Exit command received. Stopping receiver...");
                    break;
                }
            }

            ds.close();
            System.out.println("Receiver stopped.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

