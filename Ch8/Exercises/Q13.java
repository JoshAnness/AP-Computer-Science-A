import java.util.Scanner; 

public class Q13 {
   public static boolean starts(String n, String sub) {
      if(n.indexOf(sub) == 0)
         return true;
      else
         return false;
   }
   
   public static boolean ends(String n, String sub) {
      if(n.indexOf(sub) == (n.length() - sub.length()))
         return true;
      else
         return false;
   }

   public static void main(String args[]) {
   
      Scanner sc = new Scanner(System.in);
 	   System.out.print("String: "); 
 	   String s1 = sc.nextLine();
      System.out.print("Sub-string: "); 
      String s2 = sc.nextLine();
      sc.close();
      
      System.out.println("Starts With: " + starts(s1, s2));
      System.out.println("Ends With: " + ends(s1, s2));
      
      /*System.out.println("");
      
      System.out.println("Starts With: " + s1.startsWith(s2));
      System.out.println("Ends With: " + s1.endsWith(s2));*/
   }
}