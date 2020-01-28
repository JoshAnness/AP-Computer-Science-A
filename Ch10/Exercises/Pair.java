public class Pair
{
   private double first, second;
   
   public Pair(double a, double b)
   {
      first = a;
      second = b;
   }
   
   public void swap2()
   {
      double temp = first; first = second; second = temp;
   }
   
   public Pair swap()
   {
      return new Pair(second, first);
   }

}

// Class will not compile
// A way to fix this is to change the name of the void method