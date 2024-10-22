import java.rmi.Naming;

public class IPAddressServerName {
    public static void main(String[] args) {
        try {
            IPAddressService ipAddressService = new IPAddressServer();
            Naming.rebind("rmi://localhost:5004/ipaddress", ipAddressService);
            System.out.println("IPAddressServer is running...");
        } catch (Exception e) {
            System.err.println("IPAddressServer exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}