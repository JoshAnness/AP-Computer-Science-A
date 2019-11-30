import java.util.Scanner;

public class Q26 {

   public static int gcf(int a, int b) {
   
      while (a != b)
      {
         int temp = b % a;
         a = a - temp;
         b = a - temp;
      
      }
      return b;
 }
   
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
 	   System.out.print("a: "); 
 	   int a = sc.nextInt();
      System.out.print("b: ");
      int b = sc.nextInt();
      sc.close();
      System.out.print(gcf(a, b));
   }
   
}