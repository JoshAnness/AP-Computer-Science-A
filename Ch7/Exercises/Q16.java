import java.util.Scanner; 

public class Q16 {

   public static void main(String args[]) {
   
      int n = 37;
      int b = 2;
      
      int p = 1;
      
     while (p <= n) {
        n = n - p;
        p = p * b;
         
      }
      
      System.out.println(n);
      
   }
   
}