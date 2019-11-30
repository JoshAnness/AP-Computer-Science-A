import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner; 

public class InflatableBalloon extends Balloon
{
   public static double inflate(double percentage, double radius) { 
      double volume = (radius * radius * radius);
      volume = volume * ((percentage/100)+1);
      return (double)Math.cbrt(volume);
      //super.setRadius(r2);
   }
  
}