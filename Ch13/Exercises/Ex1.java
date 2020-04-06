public class Ex1 {
   // Returns the product of a and b
   // Precondition: a >= 0, b >= 0
   public static int product(int a, int b) {
      if(a == 0)
         return 0;
      else if(a <= b)
         return b + product(a-1, b);
      return product(b, a);
      
   }
   
   public static void main(String[] args) {
      System.out.print(product(5, 5));
   
   }

}