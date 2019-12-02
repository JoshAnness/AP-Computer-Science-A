import java.util.Scanner; 

public class Q8 {
   public static String swap(String str) {
      String str2 = str.replace('0', '2');
      str2 = str2.replace('1', '0');
      str2 = str2.replace('2', '1');
   
      return str2;
   }

   public static void main(String args[]) {
   
      Scanner sc = new Scanner(System.in);
 	   System.out.print("Enter String(0s and 1s): "); 
 	   String str = sc.nextLine();
      sc.close();
      
      System.out.print(swap(str));
   }
   
}