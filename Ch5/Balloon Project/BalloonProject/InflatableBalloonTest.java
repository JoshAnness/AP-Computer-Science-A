import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner; 

public class InflatableBalloonTest extends InflatableBalloon
{
   
   public static void main(String[] args) { 
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the radius: ");
      double radius2 = sc.nextInt();
      sc.close();
      double final1;
      //final1 = final1.inflate(20, radius2);
      System.out.print("New Radius: " + inflate(20, radius2));
   }
  
}
