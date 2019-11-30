import java.util.Scanner; 

public class Q19 {
   public static int findBestFit(int size1, int size2, int space) {
      int sizeFinal = 0; 
      if (size1 + size2 <= space)
         sizeFinal = 3;
      else if (size1 > size2 && size1 <= space)
         sizeFinal = 1;
      else if (size2 > size1 && size2 <= space)
         sizeFinal = 2;
      else if (size2 == size1 && size1 <= space)
         sizeFinal = 1;
      else if (size2 < size1 && size2 <= space)
         sizeFinal = 2;
      else if (size1 < size2 && size1 <= space)
         sizeFinal = 1;
      else
         sizeFinal = 0;
      return sizeFinal;
         
   }

   public static void main(String args[]) {
   
      Scanner sc = new Scanner(System.in);
 	   System.out.println("Size 1: "); 
 	   int s1 = sc.nextInt();
      System.out.println("Size 2: ");
      int s2 = sc.nextInt();
      System.out.println("Space: ");
      int s3 = sc.nextInt();
      sc.close();
      
      System.out.print(findBestFit(s1, s2, s3));
   }
}