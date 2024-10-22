import java.rmi.Naming;

public class FactorialServerName {
    public static void main(String[] args) {
        try {
            Factorial factorialService = new FactorialServer();
            Naming.rebind("rmi://localhost:5002/factorial", factorialService);
            System.out.println("FactorialServer is running...");
        } catch (Exception e) {
            System.err.println("FactorialServer exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
