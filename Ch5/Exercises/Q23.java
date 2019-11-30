import java.util.Scanner; 

public class Q23
{
   
   public static int convertToHumanAge(int dogYears) {
      return 13 + (int)(16.0 / 3.0 * (dogYears - 1) + 0.5); 
   }
   
   public static void main(String[] args) { 
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter dog age in human years: ");
      int age = sc.nextInt();
      sc.close();
      
      System.out.print("Dog Years: " + convertToHumanAge(age));
      
   }
  
}
