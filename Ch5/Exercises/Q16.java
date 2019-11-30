import java.util.Scanner; 

public class Q16
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
 	   System.out.println("1st Day of the Month (0-6): "); 
      final int dayOfWeek1 = sc.nextInt();;
      System.out.println("Enter the day: ");
      int day = sc.nextInt();
      sc.close();
      int dayOfWeek = (((day + ((dayOfWeek1 - 1) + 7))) % 7);
      System.out.print(Math.abs(dayOfWeek));
   }

}