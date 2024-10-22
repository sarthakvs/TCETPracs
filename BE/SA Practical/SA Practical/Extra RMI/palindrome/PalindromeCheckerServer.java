import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject; 

public class PalindromeCheckerServer extends UnicastRemoteObject implements PalindromeChecker {
    public PalindromeCheckerServer() throws RemoteException {
        super();
    }

    public boolean isPalindrome(String str) throws RemoteException {
        // Remove spaces and convert the string to lowercase for case-insensitive comparison.
        str = str.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}