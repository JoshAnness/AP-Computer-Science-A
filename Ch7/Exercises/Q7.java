public class Q7 {

   public static int simLearn() {
   
   double s = 0.0;
   double f = 95.0;
   double book = 100.0;
   final double rate = .1;
   
   int i = 0;
   do {
      s = s + (rate * book);
      book = book - (rate * book);
      i++;
   } while(s < f);
   
   return i;
 }
   
   public static void main(String args[]) {
      int months = simLearn();
      
      int years = (int)(months/12);
      int fMonths = (months - (years*12));
      System.out.print("" + years + " years " + "and " + fMonths + " months");
   }
   
}