import java.util.Scanner; 

public class LunchTime
{
   public static int rHour;
   public static int rMin;
   
   public static int minutesUntilLunch(int hours, int minutes) { 
      rHour = 12 - hours;
      rMin = 60 - (60 - minutes);
      if (rMin == 60)
         rMin = 0;
      
      return (rHour * 60) + (60 - minutes);
      /*String str1 = Integer.toString(rHour);
      String str2 = Integer.toString(rMin);
      
      if(rMin < 10) {
         System.out.print("Time until lunch: " + str1 + ":" + "0" + str2);
      }
      
      if(rMin == 60) {
         System.out.print("Time until lunch: " + str1 + ":" + "00");
      }
      
      if(rHour == 12) {
         System.out.print("If you're talking about A.M., then, Time until lunch: " + )
      
      else 
         System.out.print("Time until lunch: " + str1 + ":" + str2); */
   }
   
   public static void main(String[] args) { 
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter current time(hh:mm): ");
      String s = sc.nextLine();
      sc.close();
      
      int i = s.indexOf(":");
      int hours = Integer.parseInt(s.substring(0, i));
      int mins = Integer.parseInt(s.substring(i+1));
      
      System.out.print("Minutes Remaining: " + minutesUntilLunch(hours, mins));
      
   }
  
}
