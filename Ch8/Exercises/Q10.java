import java.util.Scanner; 

public class Q10 {
   public static String comment(String n) {
      int first = n.indexOf("/*");
      int last = n.indexOf("*/");
      if(first < last)
         return "" + n.substring(first+2, last);
      return n;
   }

   public static void main(String args[]) {
   
      Scanner sc = new Scanner(System.in);
 	   System.out.print("String: "); 
 	   String s1 = sc.nextLine();
      sc.close();
      
      System.out.print(comment(s1));
   }
}