import java.rmi.Naming;

public class FactorialClient {
    public static void main(String[] args) {
        try {
            Factorial factorialService = (Factorial) Naming.lookup("rmi://localhost:5002/factorial");
            int n = 5; // Change this to the number for which you want to calculate the factorial.
            int result = factorialService.calculateFactorial(n);
            System.out.println("Factorial of " + n + " is: " + result);
        } catch (Exception e) {
            System.err.println("FactorialClient exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
