import java.util.Scanner; 

public class Q7 {
   public static String convertName(String str) {
      String str2 = str.trim();
      int k = str2.indexOf(',');
      String first = str2.substring(k+1, str2.length());
      String last = str2.substring(0, k);
      return first.trim() + " " + last;
   }

   public static void main(String args[]) {
   
      Scanner sc = new Scanner(System.in);
 	   System.out.print("Name (last, first): "); 
 	   String firstLast = sc.nextLine();
      sc.close();
      
      System.out.print(convertName(firstLast));
   }
   
}