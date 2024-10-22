import java.rmi.Remote;
import java.rmi.RemoteException;

// Interface that declares the remote method
public interface RMI_interface extends Remote {
    void displayMessage() throws RemoteException;
}

