import java.util.*;

public class Q23 {
   // Returns true if m is a median for values in the array
   // sample, false otherwise. (Here we call m a median if
   // the number of elements that are greater than m is the
   // same as the number of elements that are less than m)
   public static boolean isMedian(double[] sample, double m) {
      double sum = 0.0;
      
      int g = 0;
      int l = 0;
      
      for (double n : sample) {
        if(n > m)
          g++;
        if(n < m)
          l++;
         
      }
      
      if (g == l)
         return true;
      return false;
   }

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("m: ");
      double m = (double)sc.nextDouble();
      sc.close();
      
      double[] sample = {1.0, 3.0, 3.0};
      System.out.print(isMedian(sample, m)); 

   }
}