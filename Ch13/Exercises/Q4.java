import java.util.*;

public class Q4 {
   public static int findMin(int[] list, int n) {
      n--;
      
      if(n == 0)
         return list[0];
         
      else {
         if(list[n] > list[n-1])
            return findMin(list, n);
         else {
            list[n-1] = list[n];
            return findMin(list, n);
         }
      }  
       
   }

   public static void main(String args[]) {
      int[] listOfNumbers = {6, 5, 3, 11, 17, 2, 8, 7, 6};
      int numberOfItemsInListToExamine = 9;
      
      System.out.println(findMin(listOfNumbers, numberOfItemsInListToExamine));
   }

}