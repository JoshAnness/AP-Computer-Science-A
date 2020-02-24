import java.util.*;

public class RightTriangle extends Triangle {
   
   public RightTriangle(double s) {
      super(s);
   }
   
   public double getArea() {
      return ((side * side) / 2);
   }
   
   public double getPerimeter() {
      double hyp = Math.sqrt((side * side) + (side * side));
      return (side + side + hyp);
   }

}