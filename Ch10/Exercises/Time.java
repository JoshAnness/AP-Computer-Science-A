public class Time 
{
   private int hours;
   private int mins;
   
   public Time(int h, int m) {
      if(h < 0 || h > 24)
         throw new IllegalArgumentException("Hours not within military range");
      else if(m < 0 || m > 59)
         throw new IllegalArgumentException("Minutes not within military range");
      else {
         hours = h;
         mins = m;
      }
   }
   
   private int toMins() {
      int minsE = mins;
      minsE += hours * 60;
      return minsE;
   }
   
   public boolean lessThan(Time t) {
      int tMins = t.toMins();
      int oMins = toMins();
      if(oMins < tMins)
         return true;
      return false;
   }
   
   public int elapsedSince(Time t) {
      int tMins = t.toMins();
      int oMins = toMins();
      
      int diff = oMins - tMins;
      
      if(diff >= 0)
         return diff;
      return 1440 + diff;
   
   }
   
   public String toString() {
      return "" + hours + ":" + mins;
   }

}