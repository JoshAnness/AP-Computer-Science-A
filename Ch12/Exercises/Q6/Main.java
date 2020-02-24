import java.util.*;

public class Main {
   
   public static void main(String[] args) {
      EquilateralTriangle tri1 = new EquilateralTriangle(2);
      
      RightTriangle tri2 = new RightTriangle(2);
      
      System.out.println("Triangle 1 Area: " + tri1.getArea() + ", Triangle 1 Perimeter: " + tri1.getPerimeter());
      
      System.out.println("Triangle 2 Area: " + tri2.getArea() + ", Triangle 2 Perimeter: " + tri2.getPerimeter());
   
   }

}