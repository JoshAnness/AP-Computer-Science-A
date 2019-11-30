public class Demo
{
   public static int a, b, c;
   public static boolean q11() {
      a = 1;
      b = 1;
      c = 1; 
      boolean eleven = ((a != 0 && b != 0 && c != 0) && (Double.compare((double()(a/b))/((double)(b/c)))) == 1));
      /*double j = (double)(a/b);
      double k = (double)(b/c);
      if ((a != 0 && b != 0 && c != 0) && (j.compareTo(k) == 0))
         return true;
      else
         return false;*/
   }
   
   public static void main(String args[]) {
      System.out.print(q11());
   }
}