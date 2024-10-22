import java.rmi.Naming;

public class PalindromeCheckerServerName {
    public static void main(String[] args) {
        try {
            PalindromeChecker palindromeService = new PalindromeCheckerServer();
            Naming.rebind("rmi://localhost:5003/palindrome", palindromeService);
            System.out.println("PalindromeCheckerServer is running...");
        } catch (Exception e) {
            System.err.println("PalindromeCheckerServer exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}