import java.util.*;

public class Q14 {
   private static double positiveMax(double[][] m) {
      double max = m[0][0];
      int negCount = 0;
      int data = 1;
      
      if(max < 0.0)
         negCount++;
         
      for(int i = 0; i < m.length; i++) {
         for(int j = 1; j < m[0].length; j++) {
            data++;
            if(m[i][j] > max)
               max = m[i][j];
            if(m[i][j] < 0.0)
               negCount++;
            
         }
      }
      
      if(negCount == data)
         return 0.0;
         
      return max;
   }


   public static void main(String args[]) {
      
      double[][] m = {
      {-1.0, 2.2, -3.3},
      {-4.5, -5.1, 0}
      };
      
      
      System.out.print(positiveMax(m));
   }
}