import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FactorialServer extends UnicastRemoteObject implements Factorial {
    public FactorialServer() throws RemoteException {
        super();
    }

    public int calculateFactorial(int n) throws RemoteException {
        if (n < 0) {
            throw new RemoteException("Factorial calculation is not defined for negative numbers.");
        }

        if (n == 0 || n == 1) {
            return 1;
        } else {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
