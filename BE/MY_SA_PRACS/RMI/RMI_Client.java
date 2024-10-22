import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMI_Client {

    public static void main(String[] args) {
        try {
            // Locate the registry where the server is running on port 1878
            Registry registry = LocateRegistry.getRegistry("localhost", 1878);

            // Lookup the remote object by its name "hello"
            RMI_interface stub = (RMI_interface) registry.lookup("hello");

            // Call the remote method and print the message
            System.out.println("Calling remote method...");
            stub.displayMessage();
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}

