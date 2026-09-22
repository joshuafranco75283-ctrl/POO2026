

public class error0 {
    public static void main(String[] args) {
        
    
        try{
          int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e){
           System.out.println("Error: division by zero");
        }
        // int result = 10 / 0;      //Si se pone asi sale: Exception in thread "main" java.lang.ArithmeticException: / by zero
         //  System.out.println(result);

        
    }
}