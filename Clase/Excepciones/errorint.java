public class errorint {
    public static void main(String[] args) {
         try {
             int value = Integer.parseInt("ABC");
         } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
         }
    }
}
