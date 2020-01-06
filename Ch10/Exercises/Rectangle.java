public class Rectangle {
   private static int width;
   private static int height;
   
   public Rectangle(int w, int h) {
      if(w <= 0 || h <= 0)
         throw new IllegalArgumentException("Width/Height must be a positive integer");
      
      width = w;
      height = h;
   }
   
   public Rectangle(int square) {
      this(square, square);
   }
   
   public Rectangle() {
      this(1, 1);
   }
   
   public boolean isSquare() {
      if(width == height)
         return true;
      return false;
   }
   
   public void quadratize() {
      int area = width * height;
      int side = (int)(Math.sqrt(area));
      width = side;
      height = side;
   }
   
   public static void main(String[] args) {
      Rectangle r1 = new Rectangle(1, 2);
      System.out.println("Square: " + r1.isSquare());
      
      r1.quadratize();
      System.out.println("Quadratized r1, Width: " + width + ", Height: " + height + ", Area: " + (width * height));
      System.out.println("Square: " + r1.isSquare());
      
      System.out.println();
      
      Rectangle r2 = new Rectangle(2);
      System.out.println("Square: " + r2.isSquare());
      
      System.out.println();
      
      Rectangle r3 = new Rectangle();
      System.out.println("Square: " + r3.isSquare());
   }

}