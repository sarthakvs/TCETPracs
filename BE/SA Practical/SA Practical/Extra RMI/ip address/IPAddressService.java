import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IPAddressService extends Remote {
    public String getIPAddress() throws RemoteException;
}