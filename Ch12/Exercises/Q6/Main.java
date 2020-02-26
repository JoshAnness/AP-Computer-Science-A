import java.util.*;

public class Main {
   
   public static void main(String[] args) {
      EquilateralTriangle tri1 = new EquilateralTriangle(3);
      
      RightTriangle tri2 = new RightTriangle(3);
      
      System.out.println("Triangle 1, Area: " + tri1.getArea() + ", Perimeter: " + tri1.getPerimeter());
      
      System.out.println("Triangle 2, Area: " + tri2.getArea() + ", Perimeter: " + tri2.getPerimeter());
   
      System.out.print("Q: The right triangle can hold a bigger circle inside");
   }

}