import java.util.*;

public class DiplomaTest {
   public static void main(String[] args) {
      Diploma diplomal = new Diploma("Adam Smith", "Gardening");
      System.out.println(diplomal);
      System.out.println();
      
      Diploma diploma2 = new DiplomaWithHonors("Betsy Smith", "Robotics");
      
      System.out.println(diploma2);
      System.out.println();
   }
}