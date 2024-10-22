import java.rmi.Naming;

public class IPAddressClient {
    public static void main(String[] args) {
        try {
            IPAddressService ipAddressService = (IPAddressService) Naming.lookup("rmi://localhost:5004/ipaddress");
            String ipAddress = ipAddressService.getIPAddress();
            System.out.println("IP Address of the local machine: " + ipAddress);
        } catch (Exception e) {
            System.err.println("IPAddressClient exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}