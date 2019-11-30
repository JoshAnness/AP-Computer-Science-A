import java.util.Scanner; 

public class Q4 {

 
   
   /*public static int remainder(int a, int b) {
   
   }*/

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
 	   System.out.print("m = "); 
 	   int m = sc.nextInt();
      System.out.print("n = ");
      int n = sc.nextInt();
      sc.close();
      
      int p = 0;
      int q = m + m; 
      /*for (int i = 0; q <= n; i++){
         System.out.print(i);

      }*/
      int r = m;
      int i = 0;
      
      if(n == m) {
         i = 1;
         m = 0;
      }
      
      else if(m > n)
      {
         do {
            m = m - n;
            i++;
         } while(m >= n);
      }
      
      r = m;
      
      System.out.println("Integer quotient = " + i);
      
      System.out.print("Remainder = " + r);
      
   }
      
}
