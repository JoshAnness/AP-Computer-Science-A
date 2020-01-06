public class FCConverter
{
  private double f;
  private double c;
  
  public void setFahrenheit(double degrees) {
   c = (degrees - 32) * 5/9; 
  }
  
  public void setCelsius(double degrees) {
   f = (degrees * 9/5) + 32;
  }
  
  public double getFahrenheit() {
   return f;
  }
  
  public double getCelsius() {
   return c;
  }
  
}
