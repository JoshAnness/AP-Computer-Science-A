import java.util.Scanner; 

public class CylinderTest {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 	 System.out.println("Enter the Radius: "); 
 	 int radius = sc.nextInt();
    System.out.println("Enter the height: ");
    int height = sc.nextInt();
    sc.close();
    Cylinder c1 = new Cylinder(radius, height);
    System.out.print("Volume: " + c1.getVolume());
    
      
    }
 }
 