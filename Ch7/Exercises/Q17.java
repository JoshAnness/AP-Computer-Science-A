import java.util.Scanner; 

public class Q17 {
   public static double sequence (int n) {
   
      double sum = 1.0;
      for(int i = 1; i < n; i++) {
         sum = (1 + (1 / sum));
      }
      return sum;
         
   }

   public static void main(String args[]) {
   
      Scanner sc = new Scanner(System.in);
 	   System.out.print("n: "); 
      int n = sc.nextInt();
      sc.close();
      
      System.out.print(sequence(n));
   }
   
   //x10 is very close to the golden ration
   //1.61818181
}