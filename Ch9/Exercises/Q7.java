import java.util.Scanner; 
import java.util.*;

public class Q7 {
   public static double[] roots(double a, double b, double c, double d) {
      double[] r = new double[2];
      
      b = b * -1.0;
      d = Math.sqrt(d);
      
      double x1 = (b + d) / (2.0 * a);
      double x2 = (b - d) / (2.0 * a);
      
      r[0] = x1;
      r[1] = x2;
      return r;
   }


   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
 	   System.out.print("a: "); 
 	   double a = (double)sc.nextDouble();
      
      if(a == 0.0)
         throw new IllegalArgumentException("a = 0");
      
      System.out.print("b: "); 
 	   double b = (double)sc.nextDouble();
      System.out.print("c: "); 
 	   double c = (double)sc.nextDouble();
      sc.close();
      
      double d = (double)((Math.pow(b, 2.0)) - 4.0 * a * c);
      double[] r = roots(a, b, c, d);
      
      if(d > 0.0)
         System.out.print("Root(s): " + r[0] + ", " + r[1]);
      else if(d == 0.0)
         System.out.print("Root(s): " + r[0]);
      else
         System.out.print("null");
         
   }
}