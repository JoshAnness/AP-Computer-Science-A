//8b
public class Cylinder {
   private Circle base;
   private double height; 
   
   public Cylinder(int r, int h) {
      base = new Circle(r);
      height = h;
   }
   
   public double getVolume() {
      return base.getArea() * height; 
      
   }
   
}