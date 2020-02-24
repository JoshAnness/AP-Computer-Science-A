import java.util.*;

public abstract class Poem {

   private int lines;
   
   public abstract int numLines();

   public abstract int getSyllables(int k);
   
   public void printRythm() {
     for(int i = 0; i < numLines(); i++) {
       for(int j = 0; j < getSyllables(i); j++) {
        if(j < getSyllables(i) - 1)
          System.out.print("ta-");
        else
          System.out.print("ta");
       }
       System.out.println();
     }
   }

}