import java.util.*;

public class Q6 {
   public static ArrayList<Integer> smallestValue(ArrayList<Integer> arr) {     
      int index = 0;
      
      for(int i = 1; i < arr.size(); i++) {
         if(arr.get(index).compareTo(arr.get(i)) > 0)
            index = i;
      } 
      
      int num = arr.get(index);
      
      for(int i = 0; i < arr.size(); i++) {
         if(arr.get(i).compareTo(num) == 0)
            arr.remove(i);
      }
      
      return arr;
   }
   
   public static void main(String[] args) {      
      ArrayList<Integer> data = new ArrayList<Integer>();
      
      data.add(1);
      data.add(-3);
      data.add(2);
      data.add(-3);
      data.add(2); 
      
      if(data.size() < 1) 
         System.out.print(data);

      else
         System.out.print(smallestValue(data));
   }
}