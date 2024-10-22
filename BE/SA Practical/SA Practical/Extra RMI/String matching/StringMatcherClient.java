import java.rmi.Naming;

public class StringMatcherClient {
    public static void main(String[] args) {
        try {
            StringMatcher stringMatcherService = (StringMatcher) Naming.lookup("rmi://localhost:5003/stringmatcher");
            String pattern = "example"; // Change this to the pattern you want to match.
            String text = "This is an example text."; // Change this to the text you want to search in.
            boolean result = stringMatcherService.match(pattern, text);
            System.out.println("Pattern found in text: " + result);
        } catch (Exception e) {
            System.err.println("StringMatcherClient exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
