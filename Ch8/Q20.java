import java.util.Scanner; 

public class Q20 {
   public static boolean isValidISBN(String isbn) {
      //to array  
      int[] n2 = new int[isbn.length()];
      for (int i = 0; i < isbn.length(); i++)
      {
          n2[i] = isbn.charAt(i) - '0';
      }
      
      if(isbn.length() != 13)
         return false;
      
      int j = 1;
      int sum = 0;
      
      for(int i = 0; i < 13; i++) {
         if(j % 2 == 0)
            sum += (n2[i] * 3);
         else
            sum += n2[i];
         j++;
      }
      
      if(sum % 10 == 0)
         return true;
      else
         return false;
   }

   public static void main(String args[]) {
   
      Scanner sc = new Scanner(System.in);
 	   System.out.print("ISBN: "); 
 	   String s1 = sc.nextLine();
      sc.close();
      
      System.out.print(isValidISBN(s1));
   }
}