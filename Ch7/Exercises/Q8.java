import java.util.Scanner; 

public class Q8 {
   public static int addOdds(int n) {
      int sum = 0;
      for(int i = 1; i <= n; i = i + 2)
         sum = i + sum;
      return sum;
   }

   public static void main(String args[]) {
   
      Scanner sc = new Scanner(System.in);
 	   System.out.println("n: "); 
 	   int s1 = sc.nextInt();
      sc.close();
      
      System.out.print(addOdds(s1));
   }
}