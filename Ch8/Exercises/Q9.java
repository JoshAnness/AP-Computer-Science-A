import java.util.Scanner; 

public class Q9 {
   public static boolean same(String n) {
      /*String nEnd = n.substring(n.length()/2);
      String nStart = n.substring(0, n.length()/2);
      if(n.length() % 2 == 0){
         if(nEnd.equals(nStart))
            return true;
         else 
            return false;
      }
      else if(n.length() % 2 != 0 && n.length() > 1)
         if(n.substring((n.length()/2) + 1).equals(n.substring(0, n.length()/2)) && (n.charAt((n.length()/2)) == (n.charAt(0))))
            return true;
         else
            return false;
      else
         return true;
   }
   String n2 = n;
   if(n.length() = 
   n2 = n2.charAt(0)*/
   
      String f = n.substring(0, 1);
      if (n.length() > 1) {
         String[] words = n.split(f);
         if (words.length == 0)
            return true;
         else 
            return false;
      }
      
      else
         return true;
         
       
   }
   public static void main(String args[]) {
   
      Scanner sc = new Scanner(System.in);
 	   System.out.print("String: "); 
 	   String s1 = sc.nextLine();
      sc.close();
      
      System.out.print(same(s1));
   }
}