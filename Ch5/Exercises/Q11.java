import java.util.Scanner;
import java.lang.Math;

public class Q11
{
   
   public static void main(String[] args) { 
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a Negative Double: ");
      double x = sc.nextDouble();
      sc.close();
      int z;
      
      
      if(x % .5 == 0.0) {
         z = (int)x - 1;
         System.out.println(Math.round(z));
      }
      else 
         System.out.println(Math.round(x));
   }
  
}
