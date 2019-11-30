import java.util.Scanner; 

public class Q14 {
   public static boolean isPrime(int n) {
      boolean noFactors = true;
      
      if (n <= 1)
         return false;
      
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
         
     return noFactors;
   }

   public static void main(String args[]) {
   
      int j = 0;
      for(int i = 0; j < 20; i++) {
         if (isPrime(i) && isPrime(i+2)) {
          System.out.println(i + " " + (i+2));
          j++;  
       }
     }    
   }
}