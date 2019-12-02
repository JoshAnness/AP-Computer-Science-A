import java.util.Scanner; 

public class HangmanGame {
   
   private String word;
   private StringBuffer guess;
   private StringBuffer tried = new StringBuffer("");
   
   public HangmanGame(String w) {
      word = w;
      guess = new StringBuffer(w);
      for(int i = 0; i < word.length(); i++)
         guess.setCharAt(i, '-');  
   }
   
   public String getWord() {
      return word;
   }
   
   public String getGuessed() {
      return "" + guess;
   }
   
   public String getTried() {
      return "" + tried;
   }
   
   public int tryLetter(char letter) {
      if(tried.toString().indexOf(letter) >= 0) 
         return 0;
         
      tried.append(letter);
      
      if(word.indexOf(letter) == -1)
         return -1;
         
      else {
         for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == letter)
               guess.setCharAt(i, letter);
         }
         return 1;
      }
   }

   /*public static void main(String args[]) {
   
      Scanner sc = new Scanner(System.in);
 	   System.out.print("String: "); 
 	   String s1 = sc.nextLine();
      sc.close();
      
      System.out.print(comment(s1));
   }*/
}