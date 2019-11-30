//Java program to illustrate the 
// concept of inheritance
  
// sub-class MountainBike
public class MountainBike extends Bicycle
{
    private int seatHeight;
    
    
    public MountainBike(int g, int s, int startHeight)
    {
        super(g, s);
        seatHeight = startHeight;
    }
    
   public String toString()
   { 
      return super.toString() + "\nseat height is " + seatHeight;
      //return "No of gears are " + gear + "\nspeed of bicycle is " + speed + "\nseat height is " + seatHeight;  
   }  
          
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    } 

     
 }
