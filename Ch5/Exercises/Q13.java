import java.util.Scanner;
import java.lang.Math;

public class Q13
{
   
   public static void main(String[] args) { 
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a: ");
      int a = sc.nextInt();
      System.out.println("Enter b: ");
      int b = sc.nextInt();
      System.out.println("Enter c: ");
      int c = sc.nextInt();
      sc.close();
      double x1;
      double x2;
      double temp = Math.sqrt((double)(b * b) - (4 * a * c));
      
      x1 = (double)(-b + temp) / (2 * a);
      x2 = (double)(-b - temp) / (2 * a);
      
      System.out.println("Enter x1 = " + temp);
      System.out.println("Enter x2 = " + x2);
   }
  
}
