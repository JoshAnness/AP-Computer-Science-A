import java.util.Scanner; 
import java.util.*;

public class Q11 {
   public static int[] fibonacci(int n) {
      n++;
      int[] f = new int[n];
      f[0] = 0;
      f[1] = 1;
      int sum = 1;
      
      for(int i = 2; i < n; i++) {
         f[i] = sum;
         sum = f[i] + f[i-1];
      }
      return f;
   }


   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
 	   System.out.print("n: "); 
 	   int n = sc.nextInt();
      sc.close();
      
      System.out.print(Arrays.toString(fibonacci(n)));
   }
}