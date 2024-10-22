public class SingletonPatternDemo {
   public static void main(String[] args) {
      // Get the only object available
      SingleObject object = SingleObject.getInstance();

      // Show the message
      object.showMessage();
   }
}
