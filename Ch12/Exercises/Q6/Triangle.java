// Chapter 12 Question 6
import java.util.*;

public abstract class Triangle
{
  public double side;
  
  public Triangle(double s) {
   side = s;
  }
  
  public abstract double getArea();
  
  public abstract double getPerimeter();
}
