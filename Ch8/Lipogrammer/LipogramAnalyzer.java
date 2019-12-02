import java.util.Scanner; 

public class LipogramAnalyzer {

   private String text;
   
   public LipogramAnalyzer(String text) {
      this.text = text;
   }
   
   public String mark(char letter) {
      return text.replace(letter, '#');
   }
   
   public String allWordsWith(char letter) {
      String[] words = text.split(" ");
      String out = "";
      
      for(int j = 0; j < words.length; j++) {
         words[j] = words[j].replaceAll("[^a-zA-Z]", "");
      }
      
      for(int i = 0; i < words.length; i++) {
         if(out.indexOf(words[i]) == -1) 
            if(words[i].indexOf(letter) > -1)
               out += words[i] + "\n";
      }
            
      return out;
   }
   

   public static void main(String[] args) {
   
      Scanner sc = new Scanner(System.in);
 	   System.out.print("String: "); 
 	   LipogramAnalyzer s1 = new LipogramAnalyzer(sc.nextLine());
      sc.close();
      
      System.out.print(s1.allWordsWith('e'));
   }
}