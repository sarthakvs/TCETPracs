import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMI_Server extends UnicastRemoteObject implements RMI_interface {

    // Constructor for the server
    protected RMI_Server() throws RemoteException {
        super();
    }

    // Implementation of the remote method
    @Override
    public void displayMessage() throws RemoteException {
        System.out.println("-------------------------------------");
        System.out.println("Hello from the RMI Server!");
        System.out.println("-------------------------------------");
    }

    public static void main(String[] args) {
        try {
            // Create registry on port 1878
            Registry registry = LocateRegistry.createRegistry(1878);

            // Create an instance of RMI_Server and bind it to the registry with the name "hello"
            RMI_Server server = new RMI_Server();
            registry.bind("hello", server);

            System.out.println("The RMI Server is running and ready...");
        } catch (RemoteException e) {
            System.err.println("RemoteException occurred: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Exception occurred: " + e.getMessage());
        }
    }
}

