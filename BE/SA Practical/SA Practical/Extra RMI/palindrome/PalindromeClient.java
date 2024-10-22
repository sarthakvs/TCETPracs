import java.rmi.Naming;

public class PalindromeClient {
    public static void main(String[] args) {
        try {
            PalindromeChecker palindromeService = (PalindromeChecker) Naming.lookup("rmi://localhost:5003/palindrome");
            String testString = "racecar"; // Change this to the string you want to check.
            boolean isPalindrome = palindromeService.isPalindrome(testString);
            if (isPalindrome) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        } catch (Exception e) {
            System.err.println("PalindromeClient exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}