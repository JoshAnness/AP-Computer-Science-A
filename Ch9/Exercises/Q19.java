import java.util.*;

public class Q19 {
   public static String[] allSubstrings(String s) {
      int subSize = (s.length()*(s.length()+1))/2;
      String[] sub = new String[subSize];
      
      int pos = 0;
      
      for(int i = 0; i < s.length(); i++) {
         for(int j = i+1; j <= s.length(); j++) {
            sub[pos] = s.substring(i, j);
            pos++;
         }     
      }
      
      return sub;
   }


   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("String: ");
      String s = sc.nextLine();
      sc.close();
      
      System.out.print(Arrays.toString(allSubstrings(s)));
   }
}