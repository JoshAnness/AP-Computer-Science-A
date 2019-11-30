import java.util.Scanner; 

public class Q13 {
   public static boolean isLeapYear(int year) {

      if ((year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)))
         return true;

      else 
         return false;

   }
   
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
 	   System.out.println("Enter the Year: "); 
 	   int year = sc.nextInt();
      System.out.print(isLeapYear(year));
      sc.close();
   }

}