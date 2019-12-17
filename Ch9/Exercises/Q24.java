import java.util.*;

public class Q24 {
   public static void rotateLeft(int[] a) {
      int temp = a[0];
      for(int i = 0; i < a.length-1; i++)
         a[i] = a[i+1];
      a[a.length-1] = temp;
   }
   
   public static void rotateRight(int[] a) {
      int temp = a[a.length-1];
      for(int i = a.length-1; i > 0; i--)
         a[i] = a[i-1];
      a[0] = temp;
   }
   
   public static void rotate(int[] a, int d) {
      if(d > 0) {
         for(int i = d; i == 0; i--)
            rotateRight(a);
      }
      
      if(d < 0) {
         for(int i = d; i == 0; i++)
            rotateLeft(a);
      }  

   }

}