import java.util.Scanner; 

public class CircleTest {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 	 System.out.println("Enter the Radius: "); 
 	 int radius2 = sc.nextInt();
    sc.close();
    Circle c1 = new Circle(radius2);
    System.out.print("Area: " + c1.getArea());
    
      
    }
 }
 