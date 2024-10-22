import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.net.InetAddress;

public class IPAddressServer extends UnicastRemoteObject implements IPAddressService {
    public IPAddressServer() throws RemoteException {
        super();
    }

    public String getIPAddress() throws RemoteException {
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            return localhost.getHostAddress();
        } catch (Exception e) {
            throw new RemoteException("Error occurred while getting the IP address: " + e.getMessage());
        }
    }
}