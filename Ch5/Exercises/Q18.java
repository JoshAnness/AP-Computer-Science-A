// Chapter 5 Question 18

// This program prompts the user to enter miles traveled and
// gas spent and calculates the car's gas mileage

import java.util.Scanner;

public class Q18
{
  public static double gasMileage(int miles, double gallons)
  {
    return miles/gallons;
  }
  
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter Gas Mileage: ");
    double gasMileage = input.nextDouble();
    System.out.print("Miles traveled: ");
    int miles = input.nextInt();
    
    input.close();
    
    double gSpent = (double)miles/gasMileage;

    System.out.printf("The amount of gas you spent in that trip: " + gSpent + " gallons");
  }
}
