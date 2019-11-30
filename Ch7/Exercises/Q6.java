import java.util.Scanner; 

public class Q6 {

   public static void main(String args[]) {
      final int sYear = 2014;
      final double sPop = 123.8;
      final double gRate = .005;
      
   
      Scanner sc = new Scanner(System.in);
 	   System.out.println("Target Population(Millions): "); 
 	   double tp = sc.nextDouble();
      sc.close();
      
      double sPop2 = 123.8;
      int sYear2 = 2014;
      
      if (tp < sPop) {
         System.out.println("Invalid Output");
      }
      
      int i = 0;
      
      while (tp >= sPop2) {
         sPop2 = sPop2 + (gRate * sPop2);
         i++;
      } 
      
      i = i + sYear;
      
      System.out.print("Year: " + i);
   }
   
}