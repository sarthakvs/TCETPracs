import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StringMatcher extends Remote {
    public boolean match(String pattern, String text) throws RemoteException;
}
