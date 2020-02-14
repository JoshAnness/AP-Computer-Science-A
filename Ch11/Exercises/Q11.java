import java.util.*;
import java.math.*;

public class Q11 {
   public static ArrayList<BigInteger> fibonacci(int n) {   
      n++;  
      ArrayList<BigInteger> list = new ArrayList<BigInteger>();
      
      BigInteger k = BigInteger.valueOf(0);
      BigInteger p = BigInteger.valueOf(1);
      list.add(p);
      BigInteger sum;
      
      for(int i = 2; i < n; i++) {
         sum = k.add(p);
         k = p;
         p = sum;
         list.add(sum);
      }
      
      return list;
   }
   
   public static void main(String[] args) {      
      ArrayList<BigInteger> list = fibonacci(100);
      System.out.println(fibonacci(10));
      
      String s = list.get(list.size()-1).toString();
      System.out.print("F100 has " + s.length() + " Digits");
   }
}