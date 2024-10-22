import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Factorial extends Remote {
    public int calculateFactorial(int n) throws RemoteException;
}
