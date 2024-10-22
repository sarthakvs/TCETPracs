package pkg_RMI;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface RMI_interface extends Remote{
public void displayMessage() throws RemoteException;
}