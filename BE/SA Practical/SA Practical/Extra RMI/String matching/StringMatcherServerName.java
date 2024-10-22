import java.rmi.Naming;

public class StringMatcherServerName {
    public static void main(String[] args) {
        try {
            StringMatcher stringMatcherService = new StringMatcherServer();
            Naming.rebind("rmi://localhost:5003/stringmatcher", stringMatcherService);
            System.out.println("StringMatcherServer is running...");
        } catch (Exception e) {
            System.err.println("StringMatcherServer exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
