//Java program to illustrate the 
// concept of inheritance
  
// base class
public class Bicycle 
{
    // the Bicycle class has two fields
    private int gear;
    private int speed;
          
    // the Bicycle class has one constructor
    public Bicycle(int g, int s)
    {
        gear = g;
        speed = s;
    }
    
    public int getGear() 
    {
      return gear;
    }
    
    public int getSpeed()
    {
      return speed;
    }
    
   //overriding the toString() method 
   public String toString()
   { 
      return "No of gears are " + gear + "\nspeed of bicycle is " + speed;  
   }  
          
    // the Bicycle class - other methods
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }
          
    public void speedUp(int increment)
    {
        speed += increment;
    }
     
 }
