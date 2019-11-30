import java.util.Scanner;
import java.lang.Math;

public class MyMath
{
  /**
   * Returns the sum of all integers from 1 to n, if n >= 1,
   * and 0 otherwise.
   */
  public static int sumUpTo(int n)
  {
    int sum = 0;

    for (int k = 1; k <= n; k++)
      sum += k;

    return sum;
  }

  /**
   * Returns 1 * 2 * ... * n, if n >= 1; otherwise returns 1
   */
  public static long factorial(int n)
  {
    long f = 1;

    for (int k = 2; k <= n; k++)
      f *= k;

    return f;
  }

  /**
   * Returns true if n is a prime; otherwise returns false
   */
  public static boolean isPrime(int n)
  {
    if (n <= 1)
      return false;

    int m = 2;

    while (m * m <= n)
    {
      if (n % m == 0)
        return false;
      m++;
    }

    return true;
  }

  /**
   * Tests Goldbach conjecture for even numbers
   * up to bigNum
   */
  public static boolean testGoldbach(int bigNum)
  {
    for (int n = 6; n <= bigNum; n += 2)  // obviously true for n = 4
    {
      boolean found2primes = false;

      for (int p = 3; p <= n/2; p += 2)
      {
        if (isPrime(p) && isPrime(n - p))
          found2primes = true;
      }

      if (!found2primes)
      {
        System.out.println(n + " is not a sum of two primes!");
        return false;
      }
    }

    return true;
  }
  
  public static void perfectNumber() {
      int j = 0;
      
      boolean prime = true;
    
      for(int i = 2; j < 4; i++) {
         int p = (int)(Math.pow(2,i) - 1);
         
         for(int k = 2; k <= p/2; k++) {
         
            if (p % k == 0) {
               prime = false;
               break;
            }
            
            else
               prime = true;
            
               
         }
         
         if(prime != false) {
           System.out.print((int)(Math.pow(2, (i-1))*(Math.pow(2, i)-1)) + " ");
           j++;
         }
      
      } 
  
  }
  
  public static void mersennePrime() {
      int j = 0;
      
      boolean prime = true;
      
      for(int i = 2; j < 6; i++) {
         int p = (int)(Math.pow(2,i) - 1);
         
         for(int k = 2; k <= p/2; k++) {
         
            if (p % k == 0) {
               prime = false;
               break;
            }
            
            else
               prime = true;
            
               
         }
         
         if(prime != false) {
           System.out.print(p + " - ");
           System.out.print((long)(Math.pow(2, (i-1))*(Math.pow(2, i)-1)) + " | ");
           j++;
         }
      
      } 
  
  }

  /*********************************************************************/

  public static void main(String[] args)
  {
    System.out.print("First four perfect numbers: ");
    perfectNumber();
    System.out.println();
    System.out.print("First six Mersenne primes with corresponding first six perfect numbers (Mersenne prime - perfect number): ");
    mersennePrime();
    System.out.println();
    Scanner kb = new Scanner(System.in);
    int n;

    do
    {
      System.out.print("Enter an integer from 4 to 20: ");
      n = kb.nextInt();
    } while (n < 4 || n > 20);

    kb.close();

    System.out.println();
    System.out.println("1 + ... + " + n + " = " + sumUpTo(n));
    System.out.println(n + "! = " + factorial(n));
    System.out.println("Primes: ");
    for (int k = 1; k <= n; k++)
      if (isPrime(k))
        System.out.print(k + " ");
    System.out.println();
    System.out.println("Goldbach conjecture up to " + n + ": " + testGoldbach(n));
    
  }
  
}

