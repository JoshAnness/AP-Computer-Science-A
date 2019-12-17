import java.util.*;

public class Q23 {
   // Returns true if m is a median for values in the array
   // sample, false otherwise. (Here we call m a median if
   // the number of elements that are greater than m is the
   // same as the number of elements that are less than m)
   public static boolean isMedian(double[] sample, double m) {
      Arrays.sort(sample);
      
      int i = 0;
      
      for (double n : sample) {
        i++;
         
      }
      
      if(i % 2.0 == 0.0) {
         double sum = (double)(sample[i/2] + sample[(i/2)-1]);
         if(sum / 2.0 == m)
            return true;
         return false;
      }
      
      else if(sample[i/2] == m)
         return true;
         
      return false;
   }

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("m: ");
      double m = (double)sc.nextDouble();
      sc.close();
      
      double[] sample = {0.0, 1.0, 2.0};
      System.out.print(isMedian(sample, m)); 

   }
}