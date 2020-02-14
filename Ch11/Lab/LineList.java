import java.util.*;

public class LineList {
   private ArrayList<String> list;
   
   public LineList() {
      list = new ArrayList<String>();
   }
   
   public int size() {
      return list.size();
   }
   
   public String get(int k) {
      return list.get(k);
   }
   
   public void add(String line) {
      list.add(line);
   }
   
   public String remove(int k) {
      String temp = list.get(k);
      list.remove(k);
      return temp;
   }
   
   public void move(int index, int newIndex) {
      String temp = list.get(index);
      list.remove(index);
      list.add(newIndex, temp);
   }
   
   public void shuffle() {
      //int n = list.size();
      Random rand = new Random();
      
      for(int n = list.size()-1; n >= 1; n--) {
         int intRand = rand.nextInt(n);
         String temp = list.get(intRand);
         //int intRand2 = rand.nextInt(n);
         String temp2 = list.get(n);
         
         list.set(intRand, temp2);
         list.set(n, temp);
      }
   }
}