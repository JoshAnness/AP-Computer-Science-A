public class Calculation {
   private int z;
   
   //Accessor/Getter Method
   public int getZ() {
      return z;
   }
	
   //Mutator/Setter Method
   public void setZ(int zz) {
      z = zz;
   }
   public void addition(int x, int y) {
      z = x + y;
      System.out.println("The sum of the given numbers:"+z);
   }
	
   public void subtraction(int x, int y) {
      z = x - y;
      System.out.println("The difference between the given numbers:"+z);
   }
}