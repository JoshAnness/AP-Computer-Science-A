import java.util.Scanner;

public class Q22 {
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
 	   System.out.print("Enter a number 1-10 (or 0 to quit): "); 
 	   int line = sc.nextInt();
      sc.close();
      String dayString;
      
      switch (line) {
      case 1:
         dayString = "Buckle your shoe";
         break;
      case 2:
         dayString = "Buckle your shoe";
         break;
      case 3:
         dayString = "Shut the door";
         break;
      case 4: 
         dayString = "Shut the door";
         break;
      case 5:
         dayString = "Pick up sticks";
         break;
      case 6:
         dayString = "Pick up sticks";
         break;
      case 7:
         dayString = "Lay them straight";
         break;
      case 8:
         dayString = "Lay them straight";
         break;
      case 9:
         dayString = "A big fat hen";
         break;
      case 10:
         dayString = "A big fat hen";
         break;
      case 0:
         dayString = "Bye";
         break;
      default:
         dayString = "Invalid line";
         break;
      }
      System.out.println(dayString);
      
     }
 }
