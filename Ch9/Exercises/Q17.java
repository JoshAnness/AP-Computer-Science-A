import java.util.*;

public class Q17 {
   public static double average(int[] scores) {
      int sum = 0;
      for(int num: scores)
         sum += num;
      return (double)(sum/scores.length);
   }


   public static void main(String args[]) {
      int[] scores = {1, 0, 1};
      
      System.out.print(average(scores));
   }
}