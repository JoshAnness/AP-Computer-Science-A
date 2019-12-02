import java.util.Scanner; 

public class Q14 {
   public static String removeTag(String n) {
      int start = n.indexOf("<");
      int startEnd = n.indexOf(">");
      
      int lastStart = n.lastIndexOf("</");
      int lastEnd = n.lastIndexOf(">");
      
      if((start == 0 && startEnd == 1) || (lastStart == n.length()-3 && lastEnd == lastStart+2))
         return n;
      
      if(start == 0 && startEnd < (n.length()/2))
         if(lastEnd == (n.length()-1) && n.substring(lastStart+2, n.length()-1).equals(n.substring(start+1, startEnd)))
            return n.substring(startEnd+1, lastStart);
      return n;
   }

   public static void main(String args[]) {
   
      Scanner sc = new Scanner(System.in);
 	   System.out.print("String: "); 
 	   String s1 = sc.nextLine();
      sc.close();
      
      System.out.print(removeTag(s1));
   }
}