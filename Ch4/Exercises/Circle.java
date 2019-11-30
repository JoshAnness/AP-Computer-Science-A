public class Circle {
   private int radius; 
   
   public Circle(int r) {
      radius = r;
   }
   
   public double getArea() {
      return ((radius * radius) * Math.PI);
      
   }
   
   public double getRadius() {
      return radius;
   
   }
   
}