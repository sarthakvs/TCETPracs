package pkg_RMI;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.rmi.Naming;
public class RMI_Client {
public static void main(String[] args) throws
MalformedURLException, RemoteException, NotBoundException{

try {
RMI_interface helloAPI = (RMI_interface)

Naming.lookup("rmi://localhost:1878/hello");
helloAPI.displayMessage();
}
catch(Exception e)
{
System.out.println("The RMI APP is not running...");

e.printStackTrace();
}
}

}