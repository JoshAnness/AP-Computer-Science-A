import java.util.Scanner; 

public class Q18 {
   public static String sequence (int n) {
      
      int y = 1;
      int x = 1;
      
      for(int i = 1; i < n; i++) {
         int temp = y;
         y = y + x;
         x = temp;

      }
      
      return "" + y + "/" + x;
         
   }

   public static void main(String args[]) {
   
      Scanner sc = new Scanner(System.in);
 	   System.out.print("n: "); 
      int n = sc.nextInt();
      sc.close();
      le 
      System.out.print(sequence(n));
   }
   //Fraction 55/34 best approximates to the golden ratio
}