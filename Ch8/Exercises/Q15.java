import java.util.Scanner; 

public class Q15 {
   public static boolean onlyDigits(String n) {
      try {
         int num = Integer.parseInt(n);
      } catch (NumberFormatException e) {
         return false;
      }
      return true;
   }

   public static void main(String args[]) {
   
      Scanner sc = new Scanner(System.in);
 	   System.out.print("String: "); 
 	   String s1 = sc.nextLine();
      sc.close();
      
      System.out.print(onlyDigits(s1));
   }
}