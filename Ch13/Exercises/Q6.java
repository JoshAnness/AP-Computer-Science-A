import java.util.*;

public class Q6 {
   public static String printStars(int n) {
      String output = "";
      for (int i=1; i<=n; i++)
         output += "*";
      
      return output;
   }
   
   public static void printTriangle(int n) {
      // Part A
      /*if(n == 0)
         return;
      else {
         printTriangle(n - 1);
         System.out.println(printStars(n));
      }*/
      
      // Part B
      if(n == 0)
         return;
      else {
         System.out.println(printStars(n));
         printTriangle(n-1);
      }
   }   

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      System.out.print("Enter the number of rows in the triangle: ");
      int num = sc.nextInt(); 
      printTriangle(num);
   }

}