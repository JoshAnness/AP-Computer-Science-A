import java.util.Scanner; 

public class Coins 
{
   private int cents;
   private int quarters, nickels, dimes, pennies;
   
   public Coins(int c) {
      cents = c;
      
      quarters = c / 25;
      c -= (quarters*25);
      
      dimes = c / 10;
      c -= (dimes*10);
      
      nickels = c / 5;
      c -= (nickels * 5);
      
      pennies = c;
   }
   
   public int getQuarters() {
      return quarters;
   }
   
   public int getNickels() {
      return nickels;
   }
   
   public int getDimes() {
      return dimes;
   }
   
   public int getPennies() {
      return pennies;
   }
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
 	   System.out.println("Change amount in cents: "); 
 	   int s1 = sc.nextInt();
      sc.close();
      
      if(s1 < 0)
         throw new IllegalArgumentException("Must be a positive amount");
         
      Coins c1 = new Coins(s1);
      
      System.out.println("Quarters: " + c1.quarters);
      System.out.println("Dimes: " + c1.dimes);
      System.out.println("Nickels: " + c1.nickels);
      System.out.println("Pennies: " + c1.pennies);
   }

}