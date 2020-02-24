import java.util.*;

public class Diploma {
   private String name;
   private String major;
   public Diploma(String s1, String s2) {
      name = s1;
      major = s2;
   }
   
   public String toString() {
      return "This certifies that " + name + "\n" + "has completed a MOOC in " + major;
   }
}