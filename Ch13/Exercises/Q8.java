public class Q8 {
   public static int sumDigits(int n) {
      if(n < 10)
         return n;
      else
         return (n%10) + sumDigits(n/10);
   }
   
   public static boolean divThree(int n) {
      n = sumDigits(n);
      int j = 3;
      
      while(n > 3) {
         j = 3;
         while(j != 0) {
            int b = (~n) & j;
            n = n ^ j;
            j = b << 1;
         }
      }
      
      return n == 3;
      
      /*if(n == 3)
         return true;
      else if(n < 3)
         return false;
      else {
         while(n > 3) {
            n = n ^ 3;
            if(n == 3)
               return true;
         }
         return false;
      }*/
   }
   
   public static void main(String[] args) {
      System.out.println(sumDigits(15));
      System.out.println(divThree(15));
   }

}