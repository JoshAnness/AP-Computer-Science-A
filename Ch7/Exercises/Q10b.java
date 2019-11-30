import java.util.Scanner; 

public class Q10b {
   public static boolean isPrime(int n) {
      boolean noFactors = true;
      
      if (n <= 1)
         return false;
      
      //if (n != 2) {
         if ((n%2 != 0) || (n%3 != 0)) {
            for (int m = 2; noFactors; m++)
            {
               if (m * m > n)
                  break;
               
               if (n % m == 0)
                  noFactors = false;
             
            }
         }
        else 
         noFactors = false; 
     //}
     return noFactors;
   }

   public static void main(String args[]) {
   
      Scanner sc = new Scanner(System.in);
 	   System.out.print("n: "); 
 	   int s1 = sc.nextInt();
      sc.close();
      
      System.out.print(isPrime(s1));
   }
}