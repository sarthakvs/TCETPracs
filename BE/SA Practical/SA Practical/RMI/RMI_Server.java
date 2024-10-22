package pkg_RMI;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
public class RMI_Server extends UnicastRemoteObject implements
RMI_interface{
public RMI_Server() throws RemoteException {
super();
}
public static void main(String[] args)throws RemoteException,
AlreadyBoundException {
try {
Registry registry =
LocateRegistry.createRegistry(1878);

registry.bind("hello", new RMI_Server());
System.out.println("The RMI_Server is running and ready...");
}
catch (Exception e) {
System.out.println("The RMI_Server is not running...");
}
}
@Override
public void displayMessage()throws RemoteException{
System.out.println("-------------------------------------");

System.out.println("Hello Drashti!");

System.out.println("-------------------------------------");
}
}