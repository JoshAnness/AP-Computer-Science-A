import java.util.*;

public class Q5 {
   public static ArrayList<String> reverse(ArrayList<String> arr) {
      ArrayList<String> result = new ArrayList<String>();
      
      for(int i = arr.size()-1; i > -1; i--) {
         result.add(arr.get(i));
      } 
      
      return result;
   }
   
   public static void main(String[] args) {      
      ArrayList<String> data = new ArrayList<String>();
      
      data.add("Josh");
      data.add("Ben");
      data.add("Alex");
      data.add("David");
      data.add("Joel");  
      
      System.out.print(reverse(data));
   }
}