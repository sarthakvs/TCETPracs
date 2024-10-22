import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StringMatcherServer extends UnicastRemoteObject implements StringMatcher {
    public StringMatcherServer() throws RemoteException {
        super();
    }

    public boolean match(String pattern, String text) throws RemoteException {
        return text.contains(pattern);
    }
}
