package pkg_socket;

import java.net.*;

public class DReceiver{

public static void main(String[] args) throws Exception {

System.out.println("Waiting for Sender to send the Message"); DatagramSocket ds = new DatagramSocket(3000); byte[] buf = new byte[1024];

DatagramPacket dp = new DatagramPacket(buf, 1024); ds.receive(dp);

String str = new String(dp.getData(), 0, dp.getLength());

System.out.println(str);

ds.close();

System.out.println("Message received successfully");

}

}

