import java.util.Scanner; 

public class Q15
{
   
   public static void main(String[] args) { 
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a Positive Int: ");
      int n = sc.nextInt();
      sc.close();
      //int nFinal = ((((((n % 100) * 100))+ n % 10) (+ % 10) + n % 10);
      int nFinal2 = ((n / 100) * 100) + ((n % 10) * 10) + ((n / 10) % 10);
      System.out.print("n = " + nFinal2);
   }
  
}
