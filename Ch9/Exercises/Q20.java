import java.util.*;

public class Q20 {
   public static int[][] pascalTriangle(int n) {
      int[][] arr = new int[n][];
      
      int num = 1;
      
      for(int i = 0; i < n; i++) {
         num = 1;
         int[] temp = new int[i+1];
         for(int j = 0; j < temp.length; j++) {
            temp[j] = num;
            num = num * (i - j)/(j + 1);
         }
         
         arr[i] = temp;
      }
      return arr;
   }

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("n: ");
      int n = sc.nextInt();
      sc.close();
     
      if(n < 0)
         throw new IllegalArgumentException("n < 0");
      
      n++;
      int[][] arr = pascalTriangle(n);
      int space = n;
      
      for(int i = 0; i < n; i++) {
         for(int k = 1; k <= space; k++) {
            System.out.print(" ");
         }
         
         for(int j = 0; j < i+1; j++) {
            System.out.print(arr[i][j] + " ");
         }
         
         space--;
         System.out.println();
      }

   }
}