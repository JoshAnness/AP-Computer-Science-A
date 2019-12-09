import java.util.Scanner; 
import java.util.*;

public class Q9 {
   public static int[] makePythagoreanTriple(int m, int n) {
      int a = (m * m) - (n * n);
      int b = 2 * m * n;
      int c = (m * m) + (n * n);
      int[] mPT = {a, b, c};
      
      return mPT;
   }


   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
 	   System.out.print("m: "); 
 	   int m = sc.nextInt();
      System.out.print("n: "); 
 	   int n = sc.nextInt();
      sc.close();
      
      if(m == n)
         throw new IllegalArgumentException("m = n");
      else if(n > m) {
         int temp = m;
         m = n;
         n = temp; 
         System.out.print(Arrays.toString(makePythagoreanTriple(m, n))); }
      else
         System.out.print(Arrays.toString(makePythagoreanTriple(m, n)));
         
   }
}