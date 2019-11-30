import java.util.Scanner; 
import java.lang.Math;

public class Q17 {


   public static double getOrderTotal(int bp, int nb)
   {

      double bpp = 20.95;
      double nbp = 21.95;

      if (bp == 1 && nb == 1)
         return 39.95;

      else if(bp >= 12 || nb >= 12)
         return (16 * bp + 16 * nb);

      else if(bp >= 3 || nb >= 3)
         return (16.95 * bp + 16.95 * nb);

      else
         return (bpp * bp + nbp * nb);

   }
   

   public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);
 	   System.out.println("Be Prepared: "); 
 	   int bp2 = sc.nextInt();
      System.out.println("Next Best: ");
      int nb2 = sc.nextInt();

      System.out.print("Total cost: " + "$" + Math.round(getOrderTotal(bp2, nb2) * 100.0) / 100.0);
      //System.out.print("Total cost: " + "$" + getOrderTotal(bp2, nb2));

   }

}