import java.util.Scanner; 

public class Q16 {

   public static void main(String args[]) {
   
      Scanner sc = new Scanner(System.in);
 	   System.out.print("String 1: "); 
 	   String s1 = sc.nextLine();
      System.out.print("String 2: "); 
 	   String s2 = sc.nextLine();
      sc.close();
      
      int n1 = Integer.parseInt(s1);
      int n2 = Integer.parseInt(s2);
      
      if(s1.compareTo(s2) >= 0 && ((n1 - n2) >= 0))
         System.out.print("Same Sign");
      else if(s1.compareTo(s2) < 0 && ((n1 - n2) < 0))
         System.out.print("Same Sign");
      else
         System.out.print("Different Sign");
         
      //Can be different sign
      //Ex. 100/5
         
      //System.out.println("s1.compareTo(s2): " + s1.compareTo(s2));
      //System.out.print("(n1 - n2): " + (n1 - n2));
   }
}