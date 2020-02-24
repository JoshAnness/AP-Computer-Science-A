import java.util.*;

public class EquilateralTriangle extends Triangle {
   
   public EquilateralTriangle(double s) {
      super(s);
   }
   
   public double getArea() {
      return ((Math.sqrt(3) / 4) * (Math.pow(side, 2)));
   }
   
   public double getPerimeter() {
      return (3 * side);
   }

}