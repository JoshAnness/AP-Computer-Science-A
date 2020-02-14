import java.util.*;
import java.lang.*;

public class Q72 {
   //public static String[] names1 = {"1", "2", "5", "4", "3"};
   //public static String[] names2 = {"1", "3", "7", "8", "2"};
   
   public static void filter (ArrayList<Object> list1, ArrayList<Object> list2) {     
      for(int i = list1.size()-1; i > 0; i--) {
         for(int j = 0; j < list2.size(); j++) {
            if(list1.get(i) == (list2.get(j))) { 
               list1.remove(i);
               break;
            }
         }
      
      }
    }
   
   public static ArrayList<Object> makeList(String[] names) {
      ArrayList<Object> list = new ArrayList<Object>();
      
      for (int i=0; i<names.length; i++)
      {
         list.add(new Object(names[i]));
      }
      //System.out.println(list);
      return list;
   }

   
   /*public static ArrayList<Object> makeList2(String[] names)
    {
      ArrayList<Object> list = new ArrayList<Object>();
      Object o = new Object();
      
      for (int i=0; i<names.length; i++)
      {
         o.setName(names[i]);
         list.add(o);
      }
      //System.out.println(list);
      return list;
    }*/

   
   public static void main(String[] args) {     
      String[] names1 = {"1", "2", "5", "4", "3"};
      String[] names2 = {"1", "3", "7", "8", "2"}; 
      
      ArrayList<Object> list1; 
      list1 = makeList(names1);
      ArrayList<Object> list2; 
      list2 = makeList(names2); 
      
      
      /*list1.add(new Object("1", "2", "3", "4"));
      list2.add(new Object("2", "4", "5", "6"));*/
      
      System.out.println("Before: " + list1);
      filter(list1, list2);
      System.out.println("After: " + list1);
   }
}