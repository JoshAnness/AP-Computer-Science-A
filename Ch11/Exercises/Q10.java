import java.util.*;

public class Q10 {
   public static void removeConsecutiveDuplicate(ArrayList<String> arr) {     
      for(int i = arr.size()-1; i > 0; i--) {
         if(arr.get(i).compareTo(arr.get(i-1)) == 0) {
            arr.remove(i);
         }
      }
   }
   
   public static void main(String[] args) {      
      ArrayList<String> data = new ArrayList<String>();
      
      data.add("A");
      data.add("A");
      data.add("A");
      data.add("B");
      data.add("C"); 
      data.add("C"); 
      data.add("A");
      data.add("A");
      
      if(data.size() < 1) 
         System.out.print(data);
      else {
         removeConsecutiveDuplicate(data);
         System.out.print(data);
      }
   }
}